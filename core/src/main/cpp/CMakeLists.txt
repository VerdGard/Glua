cmake_minimum_required(VERSION 3.22.1)
project(glua_core C CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_library(glua_core SHARED
    glua_log.c
    glua_crash.c
    glua_jni.c
)

target_link_libraries(glua_core
    android
    log
    atomic
)

target_compile_options(glua_core PRIVATE -Wall -Wextra -fvisibility=hidden -funwind-tables)
