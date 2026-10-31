plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.so.revelation.lua"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.so.revelation.lua"
        minSdk = 21
        targetSdk = 33
        versionCode = 20
        versionName = "2.5.4"
        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = false
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            isDebuggable = true
        }
        release {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        buildConfig = true
        viewBinding = false
    }

    packaging {
        resources {
            excludes += setOf(
                "META-INF/DEPENDENCIES",
                "META-INF/LICENSE",
                "META-INF/LICENSE.txt",
                "META-INF/NOTICE",
                "META-INF/NOTICE.txt",
                "META-INF/*.kotlin_module"
            )
        }
        jniLibs.useLegacyPackaging = true
    }

    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }
}

// 说明：
// AndroidX / Material / sora-editor / 百度 SDK 的源码已由原 APK 反编译完整还原进
// app/src/main/java，对应资源也已在 app/src/main/res 中（values/ 里是原 APK 全量资源表）。
// 因此不再引入同名 Maven 依赖，否则会出现
//   "Duplicate value for resource 'attr/xxx'"（aapt2 拒绝重复定义）。
dependencies {
    // 仅保留反编译产物中缺失、且源码实际引用到的少量运行期依赖
    implementation("com.google.code.gson:gson:2.10.1")
}
