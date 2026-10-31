# Lua 5.3 语言开发文档

Glua 使用 **LuaJ 3.0.1** 执行脚本，语义与 Lua 5.3 一致。

本文只讲写脚本会用到的部分，不重复官方手册。完整语法见
[Lua 5.3 参考手册](https://www.runoob.com/manual/lua53doc/manual.html)。

## 快速开始

在 Glua 里新建脚本，写入：

```lua
print("Hello, Glua")

local sum = 0
for i = 1, 100 do
    sum = sum + i
end
print("1..100 =", sum)
```

点运行，输出面板会显示：

```
Hello, Glua
1..100 =	5050
```

`print` 的多个参数用制表符分隔，与标准 Lua 一致。

## 基础语法

### 变量

```lua
local x = 10          -- 局部变量，推荐
y = 20                -- 全局变量，脚本结束后仍存在
local a, b = 1, 2     -- 多重赋值
a, b = b, a           -- 交换
```

**优先用 `local`**。全局变量在多次运行之间会残留，容易产生难查的 bug。

### 数据类型

| 类型 | 示例 | 说明 |
|---|---|---|
| nil | `nil` | 未定义 / 空 |
| boolean | `true` `false` | |
| number | `3.14` `42` `0xFF` | 只有一种数字类型（双精度） |
| string | `"abc"` `'abc'` `[[abc]]` | 不可变 |
| table | `{1,2,3}` `{a=1}` | 唯一的复合类型 |
| function | `function() end` | 一等公民 |

### 字符串

```lua
local s = "hello"
print(s .. " world")     -- 拼接用 ..
print(#s)                -- 长度 5
print(s:upper())         -- 方法调用 :  HELLO
print(string.format("%d %s", 42, "x"))   -- 格式化

-- 长字符串，不转义
local raw = [[
第一行
第二行
]]

-- 多行且有缩进时用 [==[
local code = [==[
    if x then
        print("x")
    end
]==]
```

### 表

```lua
-- 数组
local arr = {10, 20, 30}
print(arr[1])            -- 10，Lua 下标从 1 开始
print(#arr)              -- 3
table.insert(arr, 40)    -- 追加
table.remove(arr, 1)     -- 删除第一个

-- 字典
local map = {name = "Glua", version = 1}
print(map.name)          -- Glua
print(map["name"])       -- 同上

-- 混合
local mixed = {1, 2, key = "value"}
```

**下标从 1 开始**，不是 0。这是 Lua 与其它语言最大的差异。

### 条件与循环

```lua
if x > 10 then
    print("big")
elseif x > 5 then
    print("medium")
else
    print("small")
end

-- 数值 for
for i = 1, 10 do print(i) end
for i = 10, 1, -1 do print(i) end     -- 步长 -1

-- 泛型 for
for i, v in ipairs({10, 20, 30}) do
    print(i, v)
end

for k, v in pairs({a = 1, b = 2}) do
    print(k, v)                        -- 顺序不保证
end

-- while
while x > 0 do x = x - 1 end

-- repeat
repeat
    x = x + 1
until x >= 10
```

`ipairs` 用于数组（遇到 nil 停止），`pairs` 用于字典（遍历全部）。

### 函数

```lua
local function add(a, b)
    return a + b
end

-- 多返回值
local function divmod(a, b)
    return a // b, a % b
end
local q, r = divmod(17, 5)

-- 可变参数
local function sum(...)
    local s = 0
    for _, v in ipairs({...}) do s = s + v end
    return s
end

-- 匿名函数
local double = function(x) return x * 2 end

-- 闭包
local function counter()
    local n = 0
    return function()
        n = n + 1
        return n
    end
end
local c = counter()
print(c(), c(), c())    -- 1  2  3
```

### 错误处理

```lua
-- 抛错
error("出错了")
error({code = 42})       -- 可以抛任何值

-- 捕获
local ok, err = pcall(function()
    error("内层错误")
end)
if not ok then
    print("捕获:", err)
end

-- 带堆栈
local ok2, err2 = xpcall(f, debug.traceback)

-- 断言
assert(x ~= nil, "x 不能为 nil")
```

## 标准库

### string

```lua
string.format("%d", 42)          -- 格式化
string.sub("hello", 1, 3)        -- "hel"
string.rep("ab", 3)              -- "ababab"
string.find("hello", "ll")       -- 3  4
string.gsub("abc", "b", "X")     -- "aXc"
string.match("v1.2", "%d+%.%d+") -- "1.2"
string.len("abc")                -- 3

-- 常用模式
%a  字母    %d  数字    %s  空白    %w  字母数字
%.  转义点  %-  非贪婪  ^   开头    $   结尾
```

### table

```lua
table.insert(t, v)        -- 尾部插入
table.insert(t, 1, v)     -- 指定位置
table.remove(t, i)        -- 删除
table.concat(t, ",")      -- 拼接成字符串
table.sort(t)             -- 排序
table.sort(t, function(a,b) return a > b end)   -- 降序
table.unpack(t)           -- 展开为多返回值
```

### math

```lua
math.floor(3.7)    -- 3
math.ceil(3.2)     -- 4
math.abs(-5)       -- 5
math.max(1,5,3)    -- 5
math.min(1,5,3)    -- 1
math.random(1,10)  -- 1~10
math.randomseed(os.time())
math.huge          -- 无穷大
```

### os

```lua
os.time()                  -- 当前时间戳
os.date("%Y-%m-%d")        -- 格式化
os.clock()                 -- CPU 时间
os.getenv("PATH")          -- 环境变量

-- 注意：Glua 里 os.exit 会中止脚本（被拦截），不会退出 App
```

### utf8

```lua
utf8.len("你好")              -- 2，按字符数
utf8.char(20320)              -- 字符
for p, c in utf8.codes("你好") do
    print(p, c)
end
```

## Glua 环境差异

### print

`print` 被重定向：输出同时进入**输出面板**和**日志面板**（TAG 为 `print`）。

### dofile / loadfile

相对路径基于当前脚本所在目录解析：

```lua
dofile("lib.lua")        -- 同目录下的 lib.lua
dofile("/sdcard/x.lua")  -- 绝对路径
```

### os.exit

被拦截为脚本中止，不会退出 App 进程。

### 计时

```lua
local t0 = os.clock()
-- ... 做事
print(string.format("耗时 %.3f 秒", os.clock() - t0))

-- 或毫秒级
local ms = glua_now_ms()
```

`glua_now_ms()` 是 Glua 扩展，返回毫秒时间戳。

## 与 GameGuardian 脚本的兼容性

Glua 提供完整的 `gg.*` API（68 个函数 + 66 个常量），见 **[GG_API.md](GG_API.md)**。

**关键差异**：`gg.*` 的内存函数需要 root。无 root 时它们返回错误字符串而非中断脚本：

```lua
local ok = gg.searchNumber("100", gg.TYPE_DWORD)
if type(ok) == "string" then
    print("搜索失败:", ok)     -- "错误: gg.searchNumber 需要读写目标进程内存，当前设备未 root"
else
    print("搜索成功")
end
```

因此写脚本时**用返回值判断，不要依赖 pcall**：

```lua
-- 推荐
local r = gg.getValue("0x1234", gg.TYPE_DWORD)
if type(r) == "number" then
    print("读到了", r)
end

-- 不推荐（错误是返回字符串，不会抛异常）
local ok, r = pcall(gg.getValue, "0x1234", gg.TYPE_DWORD)
```

## 常见陷阱

### 1. 下标从 1 开始

```lua
local t = {10, 20, 30}
print(t[0])    -- nil，不是 10
print(t[1])    -- 10
```

### 2. nil 与 false 都是假值

```lua
if 0 then print("真") end      -- 0 是真值！
if "" then print("真") end     -- 空字符串也是真值！
if nil then print("不会打印") end
if false then print("不会打印") end
```

只有 `nil` 和 `false` 是假。

### 3. 长度运算符对含 nil 的表不可靠

```lua
local t = {1, 2, nil, 4}
print(#t)    -- 可能是 4，也可能是 2
```

用 `table.insert` / `table.remove` 维护数组，不要手动挖洞。

### 4. 字符串连接性能

```lua
-- 慢：每次 .. 都创建新字符串
local s = ""
for i = 1, 10000 do s = s .. i end

-- 快：先放进 table 再 concat
local parts = {}
for i = 1, 10000 do parts[#parts + 1] = i end
local s = table.concat(parts)
```

### 5. 全局变量泄漏

```lua
function work()
    result = 42        -- 忘了 local，变成全局
end

function work()
    local result = 42  -- 正确
end
```

### 6. 闭包捕获的是变量本身，不是值

```lua
local fns = {}
for i = 1, 3 do
    fns[i] = function() return i end
end
print(fns[1](), fns[2](), fns[3]())   -- 1  2  3（Lua 里正确）

-- 但在某些语言里会是 4 4 4，Lua 的 for 每次迭代是新变量
```

## 调试技巧

### 打印表结构

```lua
local function dump(t, indent)
    indent = indent or 0
    if type(t) ~= "table" then
        print(string.rep("  ", indent) .. tostring(t))
        return
    end
    for k, v in pairs(t) do
        io.write(string.rep("  ", indent), tostring(k), " = ")
        if type(v) == "table" then
            print()
            dump(v, indent + 1)
        else
            print(tostring(v))
        end
    end
end
```

### 定位错误行

```lua
local ok, err = xpcall(function()
    -- 可能出错的代码
end, function(e)
    return debug.traceback(e, 2)
end)
if not ok then print(err) end
```

### 在 Glua 里看日志

脚本出错时会自动记录到日志面板，TAG 为脚本名。
打开「日志」页面按级别 `E` 过滤即可看到完整堆栈。

## 参考

- [Lua 5.3 中文手册](https://www.runoob.com/manual/lua53doc/manual.html)
- [GG_API.md](GG_API.md) — GameGuardian API 完整文档
- [MCP.md](MCP.md) — 通过 AI 客户端读写脚本
