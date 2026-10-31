package com.so.revelation.glua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.so.revelation.glua.core.files.ScriptStore
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.lua.LuaEngine
import com.so.revelation.glua.ui.editor.EditorScreen
import com.so.revelation.glua.ui.editor.EditorViewModel
import com.so.revelation.glua.ui.home.HomeScreen
import com.so.revelation.glua.ui.home.HomeViewModel
import com.so.revelation.glua.ui.logcat.LogcatScreen
import com.so.revelation.glua.ui.settings.SettingsScreen
import com.so.revelation.glua.ui.theme.GluaTheme
import java.io.File

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        GLog.i(TAG, "MainActivity 已创建")

        setContent {
            GluaTheme {
                Surface(Modifier.fillMaxSize()) {
                    GluaNavHost()
                }
            }
        }
    }

    private companion object {
        const val TAG = "MainActivity"
    }
}

private object Routes {
    const val HOME = "home"
    const val EDITOR = "editor"
    const val LOGCAT = "logcat"
    const val SETTINGS = "settings"
}

@Composable
private fun GluaNavHost() {
    val navController = rememberNavController()

    // 应用级单例：脚本仓库与 Lua 引擎
    val scriptStore = remember { ScriptStore(File(filesDir, "scripts")) }
    val luaEngine = remember { LuaEngine() }

    // 当前打开的文件在 editor 路由间传递
    var pendingFile: File? = remember { null }

    NavHost(navController = navController, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            val vm = remember { HomeViewModel(scriptStore) }
            HomeScreen(
                viewModel = vm,
                onOpenScript = { file ->
                    pendingFile = file
                    navController.navigate(Routes.EDITOR)
                },
                onOpenLogcat = { navController.navigate(Routes.LOGCAT) },
                onOpenSettings = { navController.navigate(Routes.SETTINGS) },
            )
        }

        composable(Routes.EDITOR) {
            val vm = remember {
                EditorViewModel(scriptStore, luaEngine).also { editor ->
                    pendingFile?.let(editor::open)
                }
            }
            EditorScreen(
                viewModel = vm,
                onBack = { navController.popBackStack() },
                onOpenLogcat = { navController.navigate(Routes.LOGCAT) },
            )
        }

        composable(Routes.LOGCAT) {
            LogcatScreen(
                onBack = { navController.popBackStack() },
                exportDir = File(cacheDir, "logs"),
            )
        }

        composable(Routes.SETTINGS) {
            SettingsScreen(onBack = { navController.popBackStack() })
        }
    }
}
