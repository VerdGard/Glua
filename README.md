# Glua 2.5.4 — 源码还原与可构建工程

由 `Glua_2.5.4.apk` 反编译还原得到的 Android 工程骨架。

- 包名：`com.so.revelation.lua`
- 应用名：启示录
- 版本：2.5.4 (versionCode 20)
- minSdk 21 / targetSdk 33 / compileSdk 34

## 这是什么

一个基于 **GameGuardian 运行时** 的 Lua 脚本编辑器（IDE）。
应用自身提供编辑器 UI 与脚本执行入口，脚本可调用 `gg.*` 系列 API 完成
进程内存读写、搜索、冻结等操作。

## 工程结构

```
app/src/main/
├── java/
│   ├── com/so/revelation/lua/     自有代码（原 com.apocalypse.lua）
│   │   ├── EditorActivity.java    主界面，1300 行，菜单有约 40 个分支
│   │   ├── Code.java              sora-editor 的 Lua 编辑器子类
│   │   ├── AppContext.java        Application
│   │   ├── MainActivity.java      设置页
│   │   ├── View/                  自定义控件（SlidingUpPanelLayout 等）
│   │   └── Baidu/                 百度翻译 API 封装
│   ├── android/ext/               GameGuardian 工具层（Tools/DaemonLoader/...）
│   ├── p165u6/ p180w6/ p172v6/    Lua 5.3 VM（纯 Java 实现）+ gg.* API 桥
│   ├── p055g5/ p071i5/ p132q4/    sora-editor（代码编辑器内核）
│   ├── p036e2/                    百度 MobStat SDK
│   └── androidx/ ...              AndroidX（混淆后）
├── res/
│   ├── raw/chunk*                 36 个 ELF 原生库（ARM32/ARM64/x86/x86_64）
│   ├── layout/ menu/ ...          应用与库资源
│   └── values*/                   127 个语言目录
└── assets/                        Lua 文档、语法高亮、示例工程
```

## 关于原生层

APK 内**没有** `lib/` 目录。原生代码以 `res/raw/chunk0` … `res/raw/chunkt`
共 36 个 ELF 文件的形式随包分发，由 `android/ext/DaemonLoader.extractLib()`
在首次运行时通过 `R.raw.chunk*` 反射提取到应用私有目录，
再用 `exec` 启动独立 daemon 进程。

`DaemonLoader` 里的架构常量（`LIB_ARM64_PIE`、`LIB_X86_STUB` …）与
`chunk*` 文件名一一对应。

## 构建

本仓库不含本地 Gradle Wrapper 二进制（体积原因）。
在装有 Android SDK 的机器上：

```bash
gradle :app:assembleDebug
```

或直接使用 GitHub Actions（`.github/workflows/build.yml`），
push 到 `main` 后自动构建并在 Artifact 中提供 debug APK。

## 已知限制

1. **无法在本仓库内验证编译通过**。还原自反编译产物，源码存在
   266 处 jadx 未能完整反编译的方法（`UnsupportedOperationException("Method not decompiled: ...")`）。
   这些桩能通过编译，但运行时若被调用会抛异常。
2. `gg.*` 的内存操作能力**完全依赖**上述 ELF daemon，需要
   root 或 virtualization 环境（`Config.vSpace*`）才能工作。
3. 百度 MobStat 埋点已从 Manifest 移除，但 SDK 类仍在源码中。
4. 资源 id 已由 AGP 重新生成，原 jadx 硬编码的 `0x7f...` 常量已删除。

## 免责声明

本项目仅用于逆向工程学习与研究。GameGuardian 及其 `gg.*` API
属于第三方商业软件，请勿用于违反服务条款或法律法规的用途。
