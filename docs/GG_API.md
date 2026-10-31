# GameGuardian Lua API 参考

Glua 完整实现了 GameGuardian 的 `gg.*` API：**68 个函数、66 个常量**。

数据来源：原 APK 内 `assets/AGG_LUA_API_ZN.json`，与官方文档一致。

> **无 root 环境**：内存类函数返回错误字符串，脚本继续执行，不会中断。
> 详见 [无 root 时的行为](#无-root-时的行为)。

## 目录

- [提示与交互](#提示与交互)
- [文本与编码](#文本与编码)
- [脚本信息](#脚本信息)
- [文件与变量](#文件与变量)
- [列表管理](#列表管理)
- [内存搜索](#内存搜索)
- [结果管理](#结果管理)
- [数值读写](#数值读写)
- [内存操作](#内存操作)
- [内存区域](#内存区域)
- [进程控制](#进程控制)
- [速度与时间](#速度与时间)
- [界面控制](#界面控制)
- [系统信息](#系统信息)
- [常量](#常量)
- [无 root 时的行为](#无-root-时的行为)
- [完整示例](#完整示例)

---

## 提示与交互

### gg.alert

```lua
int alert ( string text, string positive = 'ok', string negative = nil, string neutral = nil )
```

显示一个包含多个按钮的对话框。返回结果取决于按下了哪个按钮。可以使用“后退”按钮取消对话框（返回代码0）。

**返回值**：返回对话框取消时的值-0，否则：1表示正，2表示负，3表示中性按钮。

**参数**

```
▪text▪
     短信
 ▪positive▪
     正极按钮的文本。此按钮返回代码1。
 ▪negative▪
     负极按钮的文本。此按钮返回代码2。
 ▪neutral▪
     中性按钮的文本。此按钮返回代码3。
```

**示例**

```lua
gg. alert( 'Script ended')
 --用单个“确定”按钮显示警报

gg. alert( 'Script ended', 'Yes')
 --用单个“是”按钮显示警报

gg. alert( 'A or B?', 'A', 'B')
 --用两个按钮显示警报

gg. alert( 'A or C?', 'A', nil, 'C')
-- Show alert with two buttons

gg. alert( 'A or B or C?', 'A', 'B', 'C')
 --用三个按钮显示警报
```

### gg.choice

```lua
mixed choice ( table items, string selected = nil, string message = nil )
```

显示列表中的选择对话框。该列表由项目表组成。Selected设置默认情况下将要选择的表的索引。如果要按指定顺序显示项目，则项目必须是数字数组。

**返回值**：如果对话框或所选项目的索引已被取消，则返回nil。

**参数**

```
▪items▪
     包含可供选择项目的表。
 ▪selected▪
     未指定或指定为nil，则列表将没有默认选项。
 ▪message▪
     指定对话框的可选标题。
```

**示例**

```lua
print( '1: ', gg. choice({ 'A', 'B', 'C', 'D'}))
 --显示4个项目的列表

print( '2: ', gg. choice({ 'A', 'B', 'C', 'D'}, 2))
 --显示包含4个项目和选定的2个项目的列表

print( '3: ', gg. choice({ 'A', 'B', 'C', 'D'}, 3, 'Select letter:'))
 --显示4个项目的列表以及选定的3个项目和消息

print( '4: ', gg. choice({ 'A', 'B', 'C', 'D'}, nil, 'Select letter:'))
 --显示4个项目的列表，没有选择和消息
```

### gg.multiChoice

```lua
mixed multiChoice ( table items, table selection = {}, string message = nil )
```

显示多选对话框。如果要按指定顺序显示项目，则项目必须是数字数组。

**返回值**：如果对话框已取消，或者所选键和值为true的表（与所选参数类似），则返回nil。

**参数**

```
▪items▪
     包含可供选择项目的表。
 ▪selection▪
     该表通过相同的键指定项目中每个项目的选择状态。如果找不到键，则将取消选中该元素。
 ▪message▪
     指定对话框的可选标题。
```

**示例**

```lua
print( '1: ', gg. multiChoice({ 'A', 'B', 'C', 'D'}))
 --显示4个项目的列表，其中没有选中的项目

print( '2: ', gg. multiChoice({ 'A', 'B', 'C', 'D'}, {[2]=true, [4]=true}))
 --显示4个项目的列表，其中包含选中的2个和4个项目

print( '3: ', gg. multiChoice({ 'A', 'B', 'C', 'D'}, {[3]=true}, 'Select letter:'))
 --显示4个项目的列表以及选中的3个项目和消息

print( '4: ', gg. multiChoice({ 'A', 'B', 'C', 'D'}, {}, 'Select letter:'))
 --显示4个项目的列表，其中没有选中的项目和消息

 --执行多项操作
local t = gg. multiChoice({ 'A', 'B', 'C', 'D'})
if t == nil then
gg. alert( 'Canceled')
else
if t[1] then
gg. alert( 'do A')
end
if t[2] then
gg. alert( 'do B')
end
if t[3] then
gg. alert( 'do C')
end
if t[4] then
gg. alert( 'do D')
end
end
```

### gg.prompt

```lua
mixed prompt ( table prompts, table defaults = {}, table types = {} )
```

显示用于数据输入的对话框。为了尊重字段的顺序，提示必须是数字数组。此外，对于类型“number”、“setting”和“speed”，在输出过程中，分隔符会转换为本地化版本，反之亦然。例如，对于德语区域设置，字符串“6789.12345”的形式将显示为“678912345”（“，”-十进制分隔符，“.”-千位分隔符）。如果用户输入“4.567,89”，则脚本将收到“4567.89”。要显示搜索栏，必须指定类型“number”，即提示文本末尾的最小值和最大值，用分号分隔并用方括号括起来。最小值必须小于最大值。如果默认值不在该范围内，则将使用最接近的匹配项。只能使用整数。步长始终为1。请参见示例。如果搜索栏的配置无法识别，则将使用通常输入的数字作为文本。

**返回值**：如果对话框已取消，或者具有提示中的键和输入字段中的值的表已取消，则返回nil。

**参数**

```
▪prompts▪
     该表指定了每个输入字段的键和描述。
 ▪defaults▪
     该表根据提示为每个键指定默认值。
 ▪types▪
     该表指定了提示中每个键的类型。有效类型：“number”、“text”、“path”、“file”、“new_file”、“setting”、“speed”、“checkbox”。根据输入字段附近附加元素的类型输出（例如，用于选择路径或文件的按钮、内部或外部键盘等）。
```

**示例**

```lua
print( 'prompt 1: ', gg. prompt(
{ 'ask any', 'ask num', 'ask text', 'ask path', 'ask file', 'ask set', 'ask speed', 'checked', 'not checked'},
{[1]= 'any val', [7]=123, [6]=-0.34, [8]=true},
{[2]= 'number', [3]= 'text', [4]= 'path', [5]= 'file', [6]= 'setting', [7]= 'speed', [8]= 'checkbox', [9]= 'checkbox'}
))
print( 'prompt 2: ', gg. prompt(
{ 'ask any', 'ask num', 'ask text', 'ask path', 'ask file', 'ask set', 'ask speed', 'check'},
{[1]= 'any val', [7]=123, [6]=-0.34}
))
print( 'prompt 3: ', gg. prompt(
{ 'ask any', 'ask num', 'ask text', 'ask path', 'ask file', 'ask set', 'ask speed', 'check'}
))
print( 'prompt 4: ', gg. prompt(
{ 'seek bar 1 [32; 64]', 'seek bar 2 [-80; -60]'}, nil,
{ 'number', 'number'}
))
print( 'prompt 5: ', gg. prompt(
{ 'seek bar 1 [32; 64]', 'seek bar 2 [-80; -60]'},
{42, -76},
{ 'number', 'number'}
))

 --执行多项操作
local t = gg. prompt({ 'A', 'B', 'C', 'D'}, nil, { 'checkbox', 'checkbox', 'checkbox', 'checkbox'})
if t == nil then
gg. alert( 'Canceled')
else
if t[1] then
gg. alert( 'do A')
end
if t[2] then
gg. alert( 'do B')
end
if t[3] then
gg. alert( 'do C')
end
if t[4] then
gg. alert( 'do D')
end
end
```

### gg.toast

```lua
nil toast ( string text, bool fast = false )
```

展示祝酒词。如果第二个参数为true，则短时间显示toast。toast是一个包含给用户的快速小消息的视图。当视图显示给用户时，将显示为应用程序上的浮动视图。它永远不会受到关注。用户可能正在键入其他内容。这个想法是尽可能不引人注目，同时仍然向用户显示您希望他们看到的信息。两个例子是音量控制和一条简短的消息，上面说您的设置已经保存。

**返回值**：无返回值

**参数**

```
▪text▪
     祝酒词。
 ▪fast▪
     旗用于显示短时间的祝酒词。
```

**示例**

```lua
gg. toast( 'This is toast')
 --长时间显示文本通知

gg. toast( 'This is toast', true)
 --短时间显示文本通知
```

### gg.copyText

```lua
nil copyText ( string text, bool fixLocale = true )
```

将文本复制到剪贴板。如果第二个参数为true或未指定，则文本将作为数字从英语区域设置转换为选定的区域设置。

**返回值**：无返回值

**参数**

```
▪text▪
     要复制的文本。
 ▪fixLocale▪
     用于禁用修复区域设置特定分隔符的标志。
```

**示例**

```lua
--选择了“ru”区域设置，其中十进制分隔符为“，”，千位分隔符为为“”。
 --在英语区域设置（en_US）中，十进制分隔符为“”千分隔符是“，”。
gg.copyText( '1,234,567.890') --将复制“1 234 567890”
gg. copyText( '1,234,567.890', true) --将复制“1 234 567890”
gg. copyText( '1,234,567.890', false) --将复制“1234567.890”
```


## 文本与编码

### gg.bytes

```lua
string bytes ( string text, string encoding = 'UTF-8' )
```

获取指定编码的文本字节。

**返回值**：返回具有指定编码的一组字节的表。

**参数**

```
▪text▪
     终止
 ▪encoding▪
     可能的值：“ISO-8859-1”、“US-ASCII”、“UTF-16”、“UTF-8”
```

**示例**

```lua
print( 'UTF-8', gg. bytes( 'example'))
print( 'UTF-8', gg. bytes( 'example', 'UTF-8'))
print( 'UTF-16', gg. bytes( 'example', 'UTF-16LE'))
```

### gg.numberFromLocale

```lua
string numberFromLocale ( string num )
```

将本地化的十进制分隔符和千位分隔符替换为Lua中使用的分隔符（如英语）。

**返回值**：以字符串形式返回固定数字。

**参数**

```
▪num▪
     要替换的数字或字符串。
```

**示例**

```lua
print( gg. numberFromLocale( '1.234,567')) --针对德语区域设置打印“1234.567”
```

### gg.numberToLocale

```lua
string numberToLocale ( string num )
```

将十进制分隔符和千位分隔符替换为本地化版本。

**返回值**：以字符串形式返回固定数字。

**参数**

```
▪num▪
     要替换的数字或字符串。
```

**示例**

```lua
print( gg. numberToLocale( '1,234.567')) --为德语区域设置打印“1234567”
```

### gg.getLocale

```lua
string getLocale ( )
```

获取GameGuardian中具有当前所选区域设置的字符串。

**返回值**：返回GameGuardian中当前所选区域设置的字符串。

**参数**

```
二、无需传参
```


## 脚本信息

### gg.getFile

```lua
string getFile ( )
```

获取当前运行的脚本的文件名。

**返回值**：返回具有当前运行的脚本的文件名的字符串。

**参数**

```
二、无需传参
```

### gg.getLine

```lua
int getLine ( )
```

获取正在执行的脚本的当前行号。

**返回值**：返回正在执行的脚本的当前行号。

**参数**

```
二、无需传参
```

### gg.require

```lua
nil require ( string version = nil, int build = 0 )
```

检查GameGuardian的版本。如果版本或内部版本号低于要求，脚本将以更新GameGuardian的消息结束。

**返回值**：无返回值

**参数**

```
▪version▪
     运行脚本的最低版本的GameGuardian。
 ▪build▪
     运行脚本的最小内部版本号。可选择的
```

**示例**

```lua
gg. require( '8.31.1')

gg. require( '8.31.1', 5645)

gg. require(nil, 5645)
```

### gg.sleep

```lua
nil sleep ( int milliseconds )
```

根据系统计时器和调度程序的精度和准确性，使当前执行的脚本休眠（暂时停止执行）指定的毫秒数。

**返回值**：无返回值

**参数**

```
▪milliseconds▪
     以毫秒为单位的睡眠时间长度。
```

**示例**

```lua
--200毫秒
gg. sleep(200)

 --300毫秒
local v = 300
gg. sleep(v)
```

### gg.skipRestoreState

```lua
nil skipRestoreState ( )
```

脚本完成后，不要恢复GameGuardian的状态。例如，默认情况下，在脚本执行结束后恢复的一组内存区域。此调用允许防止此情况发生。

**返回值**：无返回值

**参数**

```
二、无需传参
```

**示例**

```lua
gg. setRanges(bit32.bxor( gg. REGION_C_HEAP, gg. REGION_C_ALLOC, gg. REGION_ANONYMOUS))

 --做一些事情，比如搜索值

 --skipRestoreState（）
 --结束脚本后的内存范围和我们在第一行中设置的相同。
 --如果没有，它将恢复到脚本运行之前的状态。
```


## 文件与变量

### gg.saveVariable

```lua
mixed saveVariable ( mixed variable, string filename )
```

将变量保存到文件中。执行的结果将是一个.loa文件，然后可以通过Stores only字符串、数字和表加载该文件。循环引用处理正确。如果您需要更多信息，请阅读：lua-users-wiki:Table Serialization

**返回值**：返回true或带错误的字符串。

**参数**

```
▪variable▪
     要保存的变量。
 ▪filename▪
     保存文件的完整路径。
```

**示例**

```lua
local var = assert(loadfile(filename))()
local t = {}
t[ 'test1'] = {1, 2, 3, 4}
t[ 'test2'] = 42
t[ 'test3'] = 86.3
t[ 'test4'] = 'weapon'
t[4] = t[ 'test1']

gg. saveVariable(t, '/sdcard/test.lua') --保存的

local var = assert(loadfile( '/sdcard/test.lua'))() --加载

 --在脚本重新启动之间保存输入
local configFile = gg. getFile().. '.cfg'
local data = loadfile(configFile)
if data ~= nil then data = data() end
local input = gg. prompt({ 'Please input something'}, data)
if input == nil then os.exit() end
gg. saveVariable(input, configFile)
```

### gg.saveList

```lua
mixed saveList ( string file, int flags = 0 )
```

将保存的列表保存到文件中。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪file▪
     要保存的文件。
 ▪flags▪
     标志集SAVE_*。
```

**示例**

```lua
print( 'saveList:', gg. saveList( '/sdcard/Notes/gg.victim.txt'))
print( 'saveList:', gg. saveList( '/sdcard/Notes/gg.victim.txt', 0))
print( 'saveList:', gg. saveList( '/sdcard/Notes/gg.victim.txt', gg. SAVE_AS_TEXT))
```

### gg.loadList

```lua
mixed loadList ( string file, int flags = 0 )
```

从文件中加载保存的列表。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪file▪
     要加载的文件。
 ▪flags▪
     标志集LOAD_*。
```

**示例**

```lua
print( 'loadList:', gg. loadList( '/sdcard/Notes/gg.victim.txt'))
print( 'loadList:', gg. loadList( '/sdcard/Notes/gg.victim.txt', 0))
print( 'loadList:', gg. loadList( '/sdcard/Notes/gg.victim.txt', gg. LOAD_APPEND))
print( 'loadList:', gg. loadList( '/sdcard/Notes/gg.victim.txt', gg. LOAD_VALUES_FREEZE))
print( 'loadList:', gg. loadList( '/sdcard/Notes/gg.victim.txt', gg. LOAD_APPEND | gg. LOAD_VALUES))
```

### gg.makeRequest

```lua
mixed makeRequest ( string url, table headers = {}, string data = nil )
```

通过HTTP或HTTPS执行GET或POST请求。第一次调用该功能时，会要求用户访问Internet。为每个脚本运行请求一个。如果用户拒绝访问，所有后续调用都将立即返回错误。如果允许，将立即处理。每次运行脚本时都必须获得访问权限。函数执行查询，并在成功时返回一个带有结果的表。出现错误时，将返回包含错误文本的字符串。在logcat中会有更多的信息。结果表可以包含以下字段：如果数据字符串不是nil，则将执行POST请求，否则执行GET。默认情况下，POST请求设置为“内容类型”=“application/x-www-form-urlencoded”。您可以自己指定此标头以指定所需的类型。同样，也设置了标题“内容长度”。其他头可以由系统设置，并取决于Android的实现。HTTPS请求不执行证书验证。

**返回值**：返回成功时的表，错误时的字符串。

**参数**

```
▪url▪
     带有URL的字符串。
 ▪headers▪
     具有请求标头的表。关键是名字。值是表或字符串。如果这是表，则忽略键，并使用值。
 ▪data▪
     包含POST请求数据的字符串。如果指定nil，则会出现一个GET请求。
```

**示例**

```lua
print( 'GET 1: ', gg. makeRequest( 'http://httpbin.org/headers').content) --简单的GET请求

print( 'GET 2: ', gg. makeRequest( 'http://httpbin.org/headers', {[ 'User-Agent']= 'My BOT'}).content) --带有标头的GET请求

print( 'GET 3: ', gg. makeRequest( 'http://httpbin.org/headers', {[ 'User-Agent']={ 'My BOT', 'Tester'}}).content) --带有标头的GET请求

print( 'GET 4: ', gg. makeRequest( 'https://httpbin.org/get?param1=value2&param3=value4', {[ 'User-Agent']= 'My BOT'}).content) --具有标头的HTTPS GET请求

print( 'POST 1: ', gg. makeRequest( 'http://httpbin.org/post', nil, 'post1=val2&post3=val4').content) --简单POST请求

print( 'POST 2: ', gg. makeRequest( 'http://httpbin.org/post', {[ 'User-Agent']= 'My BOT'}, 'post1=val2&post3=val4').content) --带有标头的POST请求

print( 'POST 3: ', gg. makeRequest( 'http://httpbin.org/post', {[ 'User-Agent']={ 'My BOT', 'Tester'}}, 'post1=val2&post3=val4').content) --带有标头的POST请求

print( 'POST 4: ', gg. makeRequest( 'https://httpbin.org/post?param1=value2&param3=value4', {[ 'User-Agent']= 'My BOT'}, 'post1=val2&post3=val4').content) --具有标头的HTTPS POST请求

print( 'FULL: ', gg. makeRequest( 'https://httpbin.org/headers')) --打印有关请求的完整信息
```


## 列表管理

### gg.addListItems

```lua
mixed addListItems ( table items )
```

将项目添加到保存的列表中。

**返回值**：返回True或带错误的字符串。

**参数**

```
▪items▪
     包含要添加的项目列表的表。每个元素都是一个包含以下字段的表：地址（长，必需）、值（带值的字符串，可选）、标志（其中一个常量TYPE_*，必需），名称（字符串，可选的）、冻结（布尔值，可选的，默认为false）、冻结类型（常量之一freeze_*，可选的、默认为freeze_NORMAL）、冻结From（字符串，可选项）、冻结To（字符串，选项）。值必须使用英语区域设置。
```

**示例**

```lua
--从另一个调用检索表
gg. searchNumber( '10', gg. TYPE_DWORD)
t = gg. getResults(5) --加载项目
t[1].value = '15'
t[1].freeze = true
print( 'addListItems: ', gg. addListItems(t))

 --将表创建为项目列表
t = {}
t[1] = {}
t[1].address = 0x18004030 --一些想要的地址
t[1].flags = gg. TYPE_DWORD
t[1].value = 12345
t[2] = {}
t[2].address = 0x18004040 --另一个所需地址
t[2].flags = gg. TYPE_BYTE
t[2].value = '7Fh'
t[2].freeze = true
t[3] = {}
t[3].address = 0x18005040 --另一个所需地址
t[3].flags = gg. TYPE_DWORD
t[3].value = '777'
t[3].freeze = true
t[3].freezeType = gg. FREEZE_MAY_INCREASE
t[4] = {}
t[4].address = 0x18007040 --另一个所需地址
t[4].flags = gg. TYPE_DWORD
t[4].value = '7777'
t[4].freeze = true
t[4].freezeType = gg. FREEZE_IN_RANGE
t[4].freezeFrom = '6666'
t[4].freezeTo = '8888'
print( 'addListItems: ', gg. addListItems(t))

 --前7个结果被冻结，值为8。
gg. searchNumber( '10', gg. TYPE_DWORD)
local t = gg. getResults(7)
for i, v in ipairs(t) do
t[i].value = '8'
t[i].freeze = true
end
gg. addListItems(t)
```

### gg.removeListItems

```lua
mixed removeListItems ( table items )
```

从保存的列表中删除项目。

**返回值**：返回True或带错误的字符串。

**参数**

```
▪items▪
     表作为具有地址的表的列表。或者将表格作为地址列表。
```

**示例**

```lua
--从另一个调用检索表
t = gg. getListItems()
print( 'removeListItems: ', gg. removeListItems(t))

 --将表创建为项目列表
t = {}
t[1] = {}
t[1].address = 0x18004030 --一些想要的地址
t[2] = {}
t[2].address = 0x18004040 --另一个所需地址
print( 'removeListItems: ', gg. removeListItems(t))

 --创建一个表作为地址列表
t = {}
t[1] = 0x18004030 --一些想要的地址
t[2] = 0x18004040 --另一个所需地址
print( 'removeListItems: ', gg. removeListItems(t))
```

### gg.clearList

```lua
mixed clearList ( )
```

清除已保存的列表。

**返回值**：返回true或带错误的字符串。

**参数**

```
二、无需传参
```

**示例**

```lua
print( 'clearList:', gg. clearList())
```

### gg.getListItems

```lua
mixed getListItems ( )
```

以表格形式返回已保存列表的内容。

**返回值**：返回包含结果的表或包含错误的字符串。每个元素都是一个包含以下字段的表：地址（长）、值（数字）、标志（其中一个常量TYPE_*）、名称（字符串）、冻结（布尔值）、冻结类型（其中一个子常量freeze_*），冻结自（字符串），冻结到（字符串）。

**参数**

```
二、无需传参
```

**示例**

```lua
local r = gg. getListItems()
print( 'Items: ', r)
print( 'First item: ', r[1])
print( 'First item address: ', r[1].address)
print( 'First item value: ', r[1].value)
print( 'First item type: ', r[1].flags)
print( 'First item name: ', r[1].name)
print( 'First item freeze: ', r[1].freeze)
print( 'First item freeze type: ', r[1].freezeType)
print( 'First item freeze from: ', r[1].freezeFrom)
print( 'First item freeze to: ', r[1].freezeTo)
```

### gg.getSelectedListItems

```lua
mixed getSelectedListItems ( )
```

返回已保存列表中的选定项目。

**返回值**：返回包含结果的表或包含错误的字符串。每个元素都是一个包含以下字段的表：地址（长）、值（数字）、标志（其中一个常量TYPE_*）、名称（字符串）、冻结（布尔值）、冻结类型（其中一个子常量freeze_*），冻结自（字符串），冻结到（字符串）。

**参数**

```
二、无需传参
```

**示例**

```lua
print( 'Selected: ', gg. getSelectedListItems())
```


## 内存搜索

> 需要 root 权限。无 root 时返回错误字符串。

### gg.searchNumber

```lua
mixed searchNumber ( string text, int type = gg.TYPE_AUTO, bool encrypted = false, int sign = gg.SIGN_EQUAL, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

使用指定的参数搜索数字。如果结果列表中没有结果，则执行新搜索，否则细化搜索。因此，如果您需要在不进行细化的情况下执行搜索，则必须首先调用clearResults。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪text▪
     用于搜索的字符串。格式与GameGuardian UI中的搜索格式相同。但它必须在英语地区。
 ▪type▪
     类型其中一个常量TYPE_*。
 ▪encrypted▪
     运行搜索加密值的标志。
 ▪sign▪
     Sign.常量之一Sign_*。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
--数字搜索
gg. searchNumber( '10', gg. TYPE_DWORD)

 --加密搜索
gg. searchNumber( '-10', gg. TYPE_DWORD, true)

 --范围搜索
gg. searchNumber( '10~20', gg. TYPE_DWORD, false, gg. SIGN_NOT_EQUAL)

 --使用范围进行分组搜索
gg. searchNumber( '6~7;7;1~2;0;0;0;0;6~8::29', gg. TYPE_DWORD)

 --搜索HEX'5C E3 0B 4B 90 9B 11 7B'
gg. searchNumber( '5Ch;E3h;0Bh;4Bh;90h;9Bh;11h;7Bh::8', gg. TYPE_BYTE)

 --搜索HEX'5C E3 0B 4B 90 9B 11 7B'
gg. searchNumber( 'h 5C E3 0B 4B 90 9B 11 7B')

 --搜索HEX'5C？？0B 4B？？9B 11 7B“哪里”可以是任何字节
gg. searchNumber( '5Ch;0~~0;0Bh;4Bh;0~~0;9Bh;11h;7Bh::8', gg. TYPE_BYTE)

 --搜索文本UTF-8“şuşpançik”-类型强制为gg.type_BYTE
gg. searchNumber( ':şuşpançik')

 --搜索文本UTF-16LE“şuşandra”-类型强制为gg.type_WORD
gg. searchNumber( ';şuşandra')

 --搜索HEX‘5C E3 0B’+UTF-8‘şuşpançik’+HEX‘9B 11 7B’-类型强制为gg。type_BYTE
gg. searchNumber( 'Q 5C E3 0B \'şuşpançik\' 9B 11 7B')
gg. searchNumber( "Q 5C E3 0B 'şuşpançik' 9B 11 7B") --同上

 --搜索HEX‘5C E3 0B’+UTF-16LE‘şuşandra’+HEX‘9B 11 7B’-类型强制为gg。type_BYTE
gg. searchNumber( 'Q 5C E3 0B "şuşandra" 9B 11 7B')

 --搜索HEX‘5C E3 0B’+UTF-8‘şuşpançik’+HEX‘9B’+UTF-16LE‘şuşandra’+‘11 7B’-类型强制gg。type_BYTE
gg. searchNumber( 'Q 5C E3 0B \'şuşpançik\' 9B "şuşandra" 11 7B')
gg. searchNumber( "Q 5C E3 0B 'şuşpançik' 9B \"şuşandra\" 11 7B") --同上

 --搜索ARM操作码
gg. searchNumber( '~A MOV R1, R2', gg. TYPE_DWORD)

 --开始新搜索
gg. clearResults()
gg. searchNumber( '10', gg. TYPE_DWORD)

 --如果在结果列表中显示某些结果，则优化搜索
gg. searchNumber( '10', gg. TYPE_DWORD)
```

### gg.searchAddress

```lua
mixed searchAddress ( string text, long mask = -1, int type = gg.TYPE_AUTO, int sign = gg.SIGN_EQUAL, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

使用指定的参数执行地址搜索。如果结果列表中没有结果，则执行新搜索，否则细化搜索。因此，如果您需要在不进行细化的情况下执行搜索，则必须首先调用clearResults。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪text▪
     搜索字符串。格式与GameGuardian UI中的搜索格式相同。但它必须在英语地区。
 ▪mask▪
     面具默认值为-1（0xFFFFFFFFFFFFF）。
 ▪type▪
     类型其中一个常量TYPE_*。
 ▪sign▪
     Sign.Sign_EQUAL或Sign_NOT_EQUAL。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
gg. searchAddress( 'A20', 0xFFFFFFFF)

gg. searchAddress( 'B20', 0xFF0, gg. TYPE_DWORD, gg. SIGN_NOT_EQUAL)

gg. searchAddress( '0B?0', 0xFFF, gg. TYPE_FLOAT)

gg. searchAddress( '??F??', 0xBA0, gg. TYPE_BYTE, gg. SIGN_NOT_EQUAL, 0x9000, 0xA09000)

 --开始新搜索
gg. clearResults()
gg. searchAddress( 'A20', 0xFFFFFFFF)

 --细化搜索
gg. searchAddress( 'A20', 0xFFFFFFFF)
```

### gg.searchFuzzy

```lua
mixed searchFuzzy ( string difference = '0', int sign = gg.SIGN_FUZZY_EQUAL, int type = gg.TYPE_AUTO, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

使用指定的参数优化模糊搜索。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪difference▪
     新旧价值观之间的差异。默认情况下为“0”。必须在英语地区。
 ▪sign▪
     Sign.常量之一Sign_FUZZY_*。
 ▪type▪
     类型其中一个常量TYPE_*。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
gg. searchFuzzy()
 --值未更改

gg. searchFuzzy( '0', gg. SIGN_FUZZY_NOT_EQUAL)
 --值已更改

gg. searchFuzzy( '0', gg. SIGN_FUZZY_GREATER)
 --价值增加

gg. searchFuzzy( '0', gg. SIGN_FUZZY_LESS)
 --值减少

gg. searchFuzzy( '15')
 --值增加了15

gg. searchFuzzy( '-115')
 --值减少115
```

### gg.searchPointer

```lua
mixed searchPointer ( int maxOffset, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

搜索可能是指向当前搜索结果元素的指针的值。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪maxOffset▪
     指针的最大偏移量。有效值：0-65535。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD, false, gg. SIGN_EQUAL, 0, -1, 5) --搜索一些值
gg. searchPointer(512) --搜索指向以前找到的值的可能指针

gg. searchNumber( '10', gg. TYPE_DWORD) --搜索一些值
gg. loadResults( gg. getResults(5))
gg. searchPointer(512) --搜索以前加载的值的可能指针

local t = {}
t[1] = {}
t[1].address = 0x18004030 --一些想要的地址
t[1].flags = gg. TYPE_DWORD
t[2] = {}
t[2].address = 0x18004040 --另一个所需地址
t[2].flags = gg. TYPE_BYTE
gg. loadResults(t)
gg. searchPointer(512) --搜索以前加载的值的可能指针
```

### gg.refineNumber

```lua
mixed refineNumber ( string text, int type = gg.TYPE_AUTO, bool encrypted = false, int sign = gg.SIGN_EQUAL, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

使用指定的参数对数字执行细化搜索。如果结果列表中没有结果，则不执行任何操作。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪text▪
     用于搜索的字符串。格式与GameGuardian UI中的搜索格式相同。但它必须在英语地区。
 ▪type▪
     类型其中一个常量TYPE_*。
 ▪encrypted▪
     运行搜索加密值的标志。
 ▪sign▪
     Sign.常量之一Sign_*。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
--数字细化
gg. refineNumber( '10', gg. TYPE_DWORD)

 --加密精炼
gg. refineNumber( '-10', gg. TYPE_DWORD, true)

 --范围细化
gg. refineNumber( '10~20', gg. TYPE_DWORD, false, gg. SIGN_NOT_EQUAL)

 --使用范围进行分组细化
gg. refineNumber( '6~7;7;1~2;0;0;0;0;6~8::29', gg. TYPE_DWORD)

 --细化为HEX‘5C E3 0B 4B 90 9B 11 7B’
gg. refineNumber( '5Ch;E3h;0Bh;4Bh;90h;9Bh;11h;7Bh::8', gg. TYPE_BYTE)

 --针对HEX'5C进行细化？？0B 4B？？9B 11 7B“哪里”可以是任何字节
gg. refineNumber( '5Ch;0~~0;0Bh;4Bh;0~~0;9Bh;11h;7Bh::8', gg. TYPE_BYTE)

 --什么都不做
gg. clearResults()
gg. refineNumber( '10', gg. TYPE_DWORD)

 --细化搜索
gg. refineNumber( '10', gg. TYPE_DWORD)

 --有关其他搜索示例，请参见searchNumber
```

### gg.refineAddress

```lua
mixed refineAddress ( string text, long mask = -1, int type = gg.TYPE_AUTO, int sign = gg.SIGN_EQUAL, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

使用指定的参数执行地址细化搜索。如果结果列表中没有结果，则不执行任何操作。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪text▪
     搜索字符串。格式与GameGuardian UI中的搜索格式相同。但它必须在英语地区。
 ▪mask▪
     面具默认值为-1（0xFFFFFFFFFFFFF）。
 ▪type▪
     类型其中一个常量TYPE_*。
 ▪sign▪
     Sign.Sign_EQUAL或Sign_NOT_EQUAL。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
gg. refineAddress( 'A20', 0xFFFFFFFF)

gg. refineAddress( 'B20', 0xFF0, gg. TYPE_DWORD, gg. SIGN_NOT_EQUAL)

gg. refineAddress( '0B?0', 0xFFF, gg. TYPE_FLOAT)

gg. refineAddress( '??F??', 0xBA0, gg. TYPE_BYTE, gg. SIGN_NOT_EQUAL, 0x9000, 0xA09000)

 --什么都不做
gg. clearResults()
gg. refineAddress( 'A20', 0xFFFFFFFF)

 --细化搜索
gg. refineAddress( 'A20', 0xFFFFFFFF)
```

### gg.startFuzzy

```lua
mixed startFuzzy ( int type = gg.TYPE_AUTO, long memoryFrom = 0, long memoryTo = -1, long limit = 0 )
```

使用指定的参数开始模糊搜索。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪type▪
     类型其中一个常量TYPE_*。
 ▪memoryFrom▪
     搜索的起始内存地址。
 ▪memoryTo▪
     搜索的结束内存地址。
 ▪limit▪
     在找到指定数量的结果后停止搜索。0表示搜索所有结果。
```

**示例**

```lua
gg. startFuzzy()

gg. startFuzzy( gg. TYPE_DWORD)

gg. startFuzzy( gg. TYPE_FLOAT)

gg. startFuzzy( gg. TYPE_BYTE, 0x9000, 0xA09000)
```


## 结果管理

> 需要 root 权限。无 root 时返回错误字符串。

### gg.getResults

```lua
mixed getResults ( int maxCount, int skip = 0, long addressMin = nil, long addressMax = nil, string valueMin = nil, string valueMax = nil, int type = nil, string fractional = nil, int pointer = nil )
```

将结果加载到结果列表中，并将其作为表返回。

**返回值**：返回包含结果的表或包含错误的字符串。每个元素都是一个包含三个键的表：地址（长）、值（数字）、标志（其中一个常量TYPE_*）。

**参数**

```
▪maxCount▪
     已加载结果的最大计数。
 ▪skip▪
     从开始跳过的结果的计数。默认情况下为-0。
 ▪addressMin▪
     地址的最小值。数字或零。
 ▪addressMax▪
     地址的最大值。数字或零。
 ▪valueMin▪
     值的最小值。数字为字符串或nil。
 ▪valueMax▪
     值的最大值。数字为字符串或nil。
 ▪type▪
     一组标志TYPE_*或nil。
 ▪fractional▪
     按分数值过滤。如果第一个字符是“！”，则筛选器将排除其小数部分与指定部分匹配的所有值。
 ▪pointer▪
     一组标志POINTER_*或nil。
```

**示例**

```lua
gg. clearResults()
gg. startFuzzy( gg. TYPE_AUTO)
local r = gg. getResults(5)
print( 'First 5 results: ', r)
print( 'First result: ', r[1])
print( 'First result address: ', r[1].address)
print( 'First result value: ', r[1].value)
print( 'First result type: ', r[1].flags)

r = gg. getResults(3, 2)
print( 'Skip 2 items and get next 3: ', r)

r = gg. getResults(3, nil, 0x80000000, 0xF0000000)
print( 'Address between 0x80000000 and 0xF0000000: ', r)

r = gg. getResults(3, nil, nil, nil, 23, 45)
print( 'Value between 23 and 45: ', r)

r = gg. getResults(3, nil, nil, nil, nil, nil, gg. TYPE_DWORD | gg. TYPE_FLOAT)
print( 'Dword or Float: ', r)

r = gg. getResults(3, nil, nil, nil, nil, nil, nil, '0.5')
print( 'Only with fractional part equal 0.5: ', r)

r = gg. getResults(3, nil, nil, nil, nil, nil, nil, '!0.0')
print( 'Only with fractional part not equal 0.0: ', r)

r = gg. getResults(3, nil, nil, nil, nil, nil, nil, nil, gg. POINTER_READ_ONLY)
print( 'Only pointers to read-only memory: ', r)
```

### gg.getResultsCount

```lua
long getResultsCount ( )
```

获取找到的结果数。

**返回值**：返回找到的结果数。

**参数**

```
二、无需传参
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
print( 'Found: ', gg. getResultsCount())
```

### gg.getSelectedResults

```lua
mixed getSelectedResults ( )
```

返回搜索结果中的选定项目。

**返回值**：返回包含结果的表或包含错误的字符串。每个元素都是一个包含三个键的表：地址（长）、值（数字）、标志（其中一个常量TYPE_*）。

**参数**

```
二、无需传参
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
gg. getResults(5)
print( 'Selected: ', gg. getSelectedResults())
```

### gg.getSelectedElements

```lua
mixed getSelectedElements ( )
```

在内存编辑器中返回所选地址。

**返回值**：返回包含地址（长）的表或包含错误的字符串。

**参数**

```
二、无需传参
```

**示例**

```lua
print( 'Selected: ', gg. getSelectedElements())
```

### gg.loadResults

```lua
mixed loadResults ( table results )
```

从表中加载搜索结果。现有搜索结果将被清除。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪results▪
     该表是一个包含地址和标志字段（其中一个常量TYPE_*）的表列表。
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
local r = gg. getResults(5)
print( 'load first 5 results: ', gg. loadResults(r))

local t = {}
t[1] = {}
t[1].address = 0x18004030 --一些想要的地址
t[1].flags = gg. TYPE_DWORD
t[2] = {}
t[2].address = 0x18004040 --另一个所需地址
t[2].flags = gg. TYPE_BYTE
print( 'load from table: ', gg. loadResults(t))
```

### gg.removeResults

```lua
mixed removeResults ( table results )
```

从找到的结果列表中删除结果。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪results▪
     该表是一个包含地址和标志字段（其中一个常量TYPE_*）的表列表。
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
local r = gg. getResults(5)
print( 'Remove first 5 results: ', gg. removeResults(r))
```

### gg.clearResults

```lua
nil clearResults ( )
```

清除搜索结果列表。

**返回值**：无返回值

**参数**

```
二、无需传参
```


## 数值读写

> 需要 root 权限。无 root 时返回错误字符串。

### gg.getValues

```lua
mixed getValues ( table values )
```

获取项列表的值。

**返回值**：返回包含结果的新表或包含错误的字符串。每个元素都是一个包含三个键的表：地址（长）、值（数字）、标志（其中一个常量TYPE_*）。

**参数**

```
▪values▪
     该表是一个包含地址和标志字段（其中一个常量TYPE_*）的表列表。
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
local r = gg. getResults(5) --加载项目
r = gg. getValues(r) --刷新项目值
print( 'First 5 results: ', r)
print( 'First result: ', r[1])
print( 'First result address: ', r[1].address)
print( 'First result value: ', r[1].value)
print( 'First result type: ', r[1].flags)

local t = {}
t[1] = {}
t[1].address = 0x18004030 --一些想要的地址
t[1].flags = gg. TYPE_DWORD
t[2] = {}
t[2].address = 0x18004040 --另一个所需地址
t[2].flags = gg. TYPE_BYTE
t = gg. getValues(t)
print(t)
```

### gg.getValuesRange

```lua
mixed getValuesRange ( table values )
```

获取传递值表的内存区域。

**返回值**：返回一个表，其中原始表中的每个键都将与一个短区域代码（例如Ch）相关联。或者字符串有错误。

**参数**

```
▪values▪
     该表可以是地址列表，也可以是带有地址字段的表列表。
```

**示例**

```lua
print( '1: ', gg. getValuesRange({0x9000, 0x9010, 0x9020, 0x9030}))
 --表作为地址列表

gg. searchNumber( '10', gg. TYPE_DWORD)
local r = gg. getResults(5)
print( '2: ', r, gg. getValuesRange(r))
 --表作为具有地址字段的表列表
```

### gg.setValues

```lua
mixed setValues ( table values )
```

Set the values for the list of items.

**返回值**：Returns true or string with error.

**参数**

```
▪values▪
     该表是一个表列表，包含三个键：地址（长）、值（带值的字符串）、标志（其中一个常量TYPE_*）。值必须使用英语区域设置。
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
local r = gg. getResults(5) --加载项目
r[1].value = '15'
print( 'Edited: ', gg. setValues(r))

local t = {}
t[1] = {}
t[1].address = 0x18004030 --一些想要的地址
t[1].flags = gg. TYPE_DWORD
t[1].value = 12345
t[2] = {}
t[2].address = 0x18004040 --另一个所需地址
t[2].flags = gg. TYPE_BYTE
t[2].value = '7Fh'
print( 'Set', t, gg. setValues(t))

 --编辑ARM操作码
gg. searchNumber( '~A MOV R1, R2', gg. TYPE_DWORD)
local r = gg. getResults(5) --加载项目
r[1].value = '~A MOV R2, R3'
print( 'Edited: ', gg. setValues(r))
```

### gg.editAll

```lua
mixed editAll ( string value, int type )
```

编辑所有搜索结果。在调用此方法之前，必须通过getResults加载结果。值将仅应用于具有指定类型的结果。

**返回值**：返回包含更改计数的Int或包含错误的字符串。

**参数**

```
▪value▪
     包含要编辑的数据的字符串。必须在英语地区。
 ▪type▪
     TYPE_*中的一个常量。
```

**示例**

```lua
gg. searchNumber( '10', gg. TYPE_DWORD)
gg. getResults(5)
gg. editAll( '15', gg. TYPE_DWORD)

 --带浮子：
gg. searchNumber( '10.1', gg. TYPE_FLOAT)
gg. getResults(5)
gg. editAll( '15.2', gg. TYPE_FLOAT)

 --具有XOR模式
gg. searchNumber( '10X4', gg. TYPE_DWORD)
gg. getResults(5)
gg. editAll( '15X4', gg. TYPE_DWORD)

 --一次编辑几个值
gg. searchNumber( '10', gg. TYPE_DWORD)
gg. getResults(5)
gg. editAll( '7;13;43;24;11', gg. TYPE_DWORD)

 --编辑HEX
gg. searchNumber( 'h 5C E3 0B')
gg. getResults(30)
gg. editAll( 'h 4B 90 9B', gg. TYPE_BYTE)

 --编辑文本UTF-8
gg. searchNumber( ':şuşpançik')
gg. getResults(100000)
gg. editAll( ':şUşPaNçIk', gg. TYPE_BYTE)

 --编辑文本UTF-16LE
gg. searchNumber( ';şuşandra')
gg. getResults(100000)
gg. editAll( ';şUşAnDrA', gg. TYPE_WORD) --UTF-16LE使用WORD而非BYTE！

 --编辑HEX+UTF-8
gg. searchNumber( "Q 5C E3 0B 'şuşpançik' 9B 11 7B")
gg. getResults(100000)
gg. editAll( "Q 43 12 34 'şUşPaNçIk' 9F 1A 70", gg. TYPE_BYTE)

 --编辑HEX+UTF-16LE
gg. searchNumber( 'Q 5C E3 0B "şuşandra" 9B 11 7B')
gg. getResults(100000)
gg. editAll( 'Q 41 F7 87 "şUşAnDrA" 9B 18 7B', gg. TYPE_BYTE)

 --编辑HEX+UTF-8+UTF-16LE
gg. searchNumber( 'Q 5C E3 0B \'şuşpançik\' 9B "şuşandra" 11 7B')
gg. getResults(100000)
gg. editAll( 'Q 41 F7 87 \'şUşPaNçIk\' 04 "şUşAnDrA" 71 3B', gg. TYPE_BYTE)

 --编辑ARM操作码
gg. searchNumber( '~A MOV R1, R2', gg. TYPE_DWORD)
gg. getResults(100000)
gg. editAll( '~A MOV R2, R3', gg. TYPE_DWORD)
```


## 内存操作

> 需要 root 权限。无 root 时返回错误字符串。

### gg.copyMemory

```lua
mixed copyMemory ( long from, long to, int bytes )
```

复制内存。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪from▪
     副本来源的地址。
 ▪to▪
     副本的目标地址。
 ▪bytes▪
     要复制的字节数。
```

**示例**

```lua
print( 'copyMemory:', gg. copyMemory(0x9000, 0x9010, 3))
 --将3个字节0x9000-0x9002复制到0x9010-0x9012
```

### gg.dumpMemory

```lua
mixed dumpMemory ( long from, long to, string dir, int flags = nil )
```

将内存转储到磁盘上的文件。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪from▪
     开始转储的地址。将四舍五入到尽可能大的内存页。
 ▪to▪
     结束转储的地址。将四舍五入到尽可能小的内存页。
 ▪dir▪
     保存转储文件的目录。
 ▪flags▪
     一组标志DUMP_*或nil。
```

**示例**

```lua
print( 'dumpMemory:', gg. dumpMemory(0x9000, 0x9010, '/sdcard/dump'))
 --将至少一个内存页转储到目录“/sdcard/dump”

print( 'dumpMemory:', gg. dumpMemory(0, -1, '/sdcard/dump'))
print( 'dumpMemory:', gg. dumpMemory(0, -1, '/sdcard/dump', nil))
print( 'dumpMemory:', gg. dumpMemory(0, -1, '/sdcard/dump', 0))
 --将所有内存转储到目录“/sdcard/dump”中（全部相同）

print( 'dumpMemory:', gg. dumpMemory(0, -1, '/sdcard/dump', gg. DUMP_SKIP_SYSTEM_LIBS))
 --将除系统库外的所有内存转储到目录“/sdcard/dump”中
```

### gg.allocatePage

```lua
mixed allocatePage ( int mode = gg.PROT_READ | gg.PROT_EXEC, long address = 0 )
```

在目标进程中分配的内存页（4 KB）。

**返回值**：返回出现错误的页面或字符串的地址。

**参数**

```
▪mode▪
     标志PROT_*的位掩码。
 ▪address▪
     如果不是0，那么内核会将其作为放置页面的提示；在Android上，页面将被分配到附近的地址页面边界。
```

**示例**

```lua
print( 'allocatePage 1: ', string.format( '0x%08x', gg. allocatePage()))
print(' allocatePage 2: ', string.format('0x%08x', gg. allocatePage( gg. PROT_READ | gg. PROT_EXEC)))
print(' allocatePage 3: ', string.format('0x%08x', gg. allocatePage( gg. PROT_READ | gg. PROT_WRITE)))
print(' allocatePage 4: ', string.format('0x%08x', gg. allocatePage( gg. PROT_READ)))
print(' allocatePage 5: ', string.format('0x%08x', gg. allocatePage( gg. PROT_READ | gg. PROT_WRITE, 0x12345)))
```

### gg.disasm

```lua
string disasm ( int type, long address, int opcode )
```

拆下指定值。

**返回值**：返回字符串已分解的操作码字符串。

**参数**

```
▪type▪
     类型常数之一ASM_*。如果传递了不存在的类型，则引发错误。
 ▪address▪
     值的地址。某些操作码可能需要。
 ▪opcode▪
     拆卸说明。要反汇编Thumb32，第一条16位指令应在操作码的下半字中，第二条应在上半字中。
```

**示例**

```lua
print( 'ARM', gg. disasm( gg. ASM_ARM, 0x12345678, 0xE1A01002))

print( 'Thumb16', gg. disasm( gg. ASM_THUMB, 0x12345678, 0x0011))

print( 'Thumb32', gg. disasm( gg. ASM_THUMB, 0x12345678, 0xF800 | (0x0001 << 16)))

print( 'ARM64', gg. disasm( gg. ASM_ARM64, 0x12345678, 0x2A0103E2))
```

### gg.gotoAddress

```lua
nil gotoAddress ( long address )
```

转到内存编辑器中的地址。

**返回值**：无返回值

**参数**

```
▪address▪
     所需地址。
```


## 内存区域

> 需要 root 权限。无 root 时返回错误字符串。

### gg.getRanges

```lua
int getRanges ( )
```

返回内存区域作为标志REGION_*的位掩码。

**返回值**：返回标志REGION_*的位掩码。

**参数**

```
二、无需传参
```

### gg.getRangesList

```lua
table getRangesList ( string filter = '' )
```

获取所选进程的内存区域列表。

**返回值**：返回一个包含内存区域的列表表。每个元素都是一个包含字段的表：state、start、end、type、name、internalName。

**参数**

```
▪filter▪
     筛选器字符串。如果指定，则只返回那些属于筛选器的结果。可选择的过滤器支持通配符：^-数据的开头，$-数据的结尾，*-任意数量的任意字符，？-任何一个角色。
```

**示例**

```lua
print( gg. getRangesList())

local t = gg. getRangesList();
print(t[1].start)
print(t[1][ 'end']) --这里不能使用点表示法，因为'end'是Lua中的关键字，所以需要使用方括号表示法。

print( gg. getRangesList( 'libc.so'))

print( gg. getRangesList( 'lib*.so'))

print( gg. getRangesList( '^/data/'))

print( gg. getRangesList( '.so$'))
```

### gg.setRanges

```lua
nil setRanges ( int ranges )
```

将存储器区域设置为所需的标志REGION_*的位掩码。

**返回值**：无返回值

**参数**

```
▪ranges▪
     标志REGION_*的位掩码。
```

**示例**

```lua
gg. setRanges( gg. REGION_C_HEAP)

gg. setRanges(bit32.bor( gg. REGION_C_HEAP, gg. REGION_C_ALLOC, gg. REGION_ANONYMOUS))

gg. setRanges( gg. REGION_C_HEAP | gg. REGION_C_ALLOC | gg. REGION_ANONYMOUS)
```


## 进程控制

> 需要 root 权限。无 root 时返回错误字符串。

### gg.getTargetInfo

```lua
mixed getTargetInfo ( )
```

如果可能的话，获取一个包含所选进程信息的表。字段集可以不同。打印结果表以查看可用字段。可能的字段：firstInstallTime、lastUpdateTime、packageName、sharedUserId、sharedUserLabel、versionCode、versionName、活动（名称、标签）、安装程序、enabledSetting、backupAgentName、className、dataDir、descriptionRes、标志、图标、labelRes、徽标、manageSpaceActivityName、名称、nativeLibraryDir、权限、processName、publicSourceDir、sourceDir、targetSdkVersion、taskAffinity、主题、uid、标签、cmdLine、pid、x64、RSS。cmdLine-/proc/pid/cmdLine的内容。pid-进程的pid。x64-如果是64位进程，则为True。RSS-进程的RSS内存量，以KB为单位。阅读Android中的PackageInfo和ApplicationInfo，了解每个字段的含义。

**返回值**：返回包含所选进程信息的表或nil。

**参数**

```
二、无需传参
```

**示例**

```lua
--检查游戏版本
local v = gg. getTargetInfo()
if v.versionCode ~= 291 then
print( 'This script only works with game version 291. You have game version ', v.versionCode, ' Please install version 291 and try again.')
os.exit()
end
```

### gg.getTargetPackage

```lua
mixed getTargetPackage ( )
```

如果可能的话，获取所选进程的程序包名称。

**返回值**：以字符串或nil形式返回所选进程的包名称。

**参数**

```
二、无需传参
```

### gg.processPause

```lua
bool processPause ( )
```

暂停所选进程。

**返回值**：成功时返回true，否则返回false。

**参数**

```
二、无需传参
```

### gg.processResume

```lua
bool processResume ( )
```

如果所选进程暂停，则继续该进程。

**返回值**：成功时返回true，否则返回false。

**参数**

```
二、无需传参
```

### gg.processToggle

```lua
bool processToggle ( )
```

切换所选进程的暂停状态。若进程暂停，那个么它将被恢复，否则它将被暂停。

**返回值**：成功时返回true，否则返回false。

**参数**

```
二、无需传参
```

### gg.processKill

```lua
bool processKill ( )
```

强制终止所选进程。如果调用此调用过于频繁，脚本可能会中断。

**返回值**：成功时返回true，否则返回false。

**参数**

```
二、无需传参
```

### gg.isProcessPaused

```lua
bool isProcessPaused ( )
```

获取所选进程的暂停状态。

**返回值**：如果进程暂停，则返回true；否则返回false。

**参数**

```
二、无需传参
```


## 速度与时间

> 需要 root 权限。无 root 时返回错误字符串。

### gg.getSpeed

```lua
double getSpeed ( )
```

从speedhack获取当前速度。

**返回值**：返回speedhack的当前速度。

**参数**

```
二、无需传参
```

### gg.setSpeed

```lua
mixed setSpeed ( double speed )
```

设置速度破解的速度。如果没有加载speedhack，那么它将被加载。呼叫被阻止。脚本将等待speedhack完全加载。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪speed▪
     所需速度。必须在[1.0E-9；1.0E9]的范围内。
```

### gg.timeJump

```lua
mixed timeJump ( string time )
```

执行时间跳跃。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪time▪
     带时间的字符串。该格式类似于时间跳跃对话框中的时间格式。但它必须在英语地区。
```

**示例**

```lua
print( 'jump 1:', gg. timeJump( '42345678'))
 --跳跃1年125天2小时41分18秒

print( 'jump 2:', gg. timeJump( '1:125:2:41:18'))
 --同上

print( 'jump 3:', gg. timeJump( '5:13'))
 --跳跃5分13秒

print( 'jump 4:', gg. timeJump( '7:3:1'))
 --跳跃7小时3分1秒

print( 'jump 5:', gg. timeJump( '3600'))
 --跳跃1小时

print( 'jump 6:', gg. timeJump( '2:15:54:32'))
 --跳跃2天15小时54分32秒

print( 'jump 7:', gg. timeJump( '3600.15'))
 --跳跃1小时0.15秒

print( 'jump 8:', gg. timeJump( '7:3:1.519'))
 --跳跃7小时3分1.519秒
```

### gg.unrandomizer

```lua
mixed unrandomizer ( long qword = nil, long qincr = nil, double double_ = nil, double dincr = nil )
```

使用Unrandomizer。如果未加载Unrandomizer，则会加载它。呼叫被阻止。脚本将等待Unrandomizer完全加载。您可以在nil中设置任何参数，使其不被使用。

**返回值**：返回true或带错误的字符串。

**参数**

```
▪qword▪
     Qword参数。设置为nil可禁用。
 ▪qincr▪
     Q字增量。设置为nil可禁用。
 ▪double_▪
     双参数。设置为nil可禁用。
 ▪dincr▪
     双倍增量。设置为nil可禁用。
```

**示例**

```lua
print( 'unrandomizer:', gg. unrandomizer(0)) --仅设置qword=0
print( 'unrandomizer:', gg. unrandomizer(0, 1)) --仅设置qword=0，增量=1
print( 'unrandomizer:', gg. unrandomizer(nil, nil, 0.3)) --仅设置为双倍，不增加
print( 'unrandomizer:', gg. unrandomizer(nil, nil, 0.3, 0.01)) --只设为带增量的两倍
print( 'unrandomizer:', gg. unrandomizer(2, 3, 0.45, 0.67)) --设置两者
print( 'unrandomizer:', gg. unrandomizer()) --关
```


## 界面控制

### gg.showUiButton

```lua
nil showUiButton ( )
```

显示UI按钮。UI按钮有一个带有字母“Sx”的图标，只有当您打开GameGuardian界面时才能看到。该按钮是浮动的，显示在GameGuardian主界面的顶部。

**返回值**：无返回值

**参数**

```
二、无需传参
```

### gg.hideUiButton

```lua
nil hideUiButton ( )
```

隐藏UI按钮。

**返回值**：无返回值

**参数**

```
二、无需传参
```

### gg.isClickedUiButton

```lua
mixed isClickedUiButton ( )
```

获取ui按钮的单击状态。调用将重置单击状态。

**返回值**：如果自上次检查以来已单击该按钮，则返回true。false-如果没有点击。nil-如果按钮被隐藏。

**参数**

```
二、无需传参
```

**示例**

```lua
gg. showUiButton()
while true do
if gg. isClickedUiButton() then
 --对单击、菜单等执行一些操作
local ret = gg. choice({ 'Item 1', 'Item 2', 'Item 3'}) or os.exit()
gg. alert( 'You selected:', ret)
end
gg. sleep(100)
end
```

### gg.setVisible

```lua
nil setVisible ( bool visible )
```

打开或关闭GameGuardian UI。如果调用此调用过于频繁，脚本可能会中断。

**返回值**：无返回值

**参数**

```
▪visible▪
     true表示打开的GameGuardian UI，false表示隐藏*
```

**示例**

```lua
function doAction()
 --对单击、菜单等执行一些操作
local ret = gg. choice({ 'Item 1', 'Item 2', 'Item 3'}) or os.exit( gg. setVisible( true))
gg. alert( 'You selected: Item '..ret, 'OK')
end

gg. setVisible( false)
while true do
if gg. isVisible() then
gg. setVisible( false)
doAction()
end
gg. sleep(100)
end
```

### gg.isVisible

```lua
bool isVisible ( )
```

检查GameGuardian UI是否打开。

**返回值**：如果GameGuardian UI打开，则返回true，否则返回false。

**参数**

```
二、无需传参
```

### gg.getActiveTab

```lua
int getActiveTab ( )
```

在GameGuardian UI中获取活动选项卡。

**返回值**：返回int其中一个常量TAB_*。

**参数**

```
二、无需传参
```


## 系统信息

### gg.isPackageInstalled

```lua
bool isPackageInstalled ( string pkg )
```

根据程序包名称检查指定的应用程序是否已安装在系统上。

**返回值**：如果安装了程序包，则返回true；否则返回false。

**参数**

```
▪pkg▪
     具有包名称的字符串。
```

**示例**

```lua
print( 'Game installed:', gg. isPackageInstalled( 'com.blayzegames.iosfps'))
```


## 常量

| 常量 | 值 | 用途 |
|---|---|---|
| `gg.ANDROID_SDK_INT` | — | 运行时提供 |
| `gg.ASM_ARM` | `4` | 汇编架构 |
| `gg.ASM_ARM64` | `6` | 汇编架构 |
| `gg.ASM_THUMB` | `5` | 汇编架构 |
| `gg.BUILD` | — | 运行时提供 |
| `gg.CACHE_DIR` | — | 运行时提供 |
| `gg.DUMP_SKIP_SYSTEM_LIBS` | `1` | 转储选项 |
| `gg.EXT_CACHE_DIR` | — | 运行时提供 |
| `gg.EXT_FILES_DIR` | — | 运行时提供 |
| `gg.EXT_STORAGE` | — | 运行时提供 |
| `gg.FILES_DIR` | — | 运行时提供 |
| `gg.FREEZE_IN_RANGE` | `3` | 冻结方式 |
| `gg.FREEZE_MAY_DECREASE` | `2` | 冻结方式 |
| `gg.FREEZE_MAY_INCREASE` | `1` | 冻结方式 |
| `gg.FREEZE_NORMAL` | `0` | 冻结方式 |
| `gg.LOAD_APPEND` | `8` | 结果加载方式 |
| `gg.LOAD_VALUES` | `2` | 结果加载方式 |
| `gg.LOAD_VALUES_FREEZE` | `3` | 结果加载方式 |
| `gg.PACKAGE` | — | 运行时提供 |
| `gg.POINTER_EXECUTABLE` | `2` | 指针类型 |
| `gg.POINTER_EXECUTABLE_WRITABLE` | `1` | 指针类型 |
| `gg.POINTER_NO` | `4` | 指针类型 |
| `gg.POINTER_READ_ONLY` | `8` | 指针类型 |
| `gg.POINTER_WRITABLE` | `16` | 指针类型 |
| `gg.PROT_EXEC` | `4` | 内存页保护 |
| `gg.PROT_NONE` | `0` | 内存页保护 |
| `gg.PROT_READ` | `2` | 内存页保护 |
| `gg.PROT_WRITE` | `1` | 内存页保护 |
| `gg.REGION_ANONYMOUS` | `32` | 内存区域 |
| `gg.REGION_ASHMEM` | `524288` | 内存区域 |
| `gg.REGION_BAD` | `131072` | 内存区域 |
| `gg.REGION_CODE_APP` | `16384` | 内存区域 |
| `gg.REGION_CODE_SYS` | `32768` | 内存区域 |
| `gg.REGION_C_ALLOC` | `4` | 内存区域 |
| `gg.REGION_C_BSS` | `16` | 内存区域 |
| `gg.REGION_C_DATA` | `8` | 内存区域 |
| `gg.REGION_C_HEAP` | `1` | 内存区域 |
| `gg.REGION_JAVA` | `65536` | 内存区域 |
| `gg.REGION_JAVA_HEAP` | `2` | 内存区域 |
| `gg.REGION_OTHER` | `-2080896` | 内存区域 |
| `gg.REGION_PPSSPP` | `262144` | 内存区域 |
| `gg.REGION_STACK` | `64` | 内存区域 |
| `gg.REGION_VIDEO` | `1048576` | 内存区域 |
| `gg.SAVE_AS_TEXT` | `1` | 列表保存方式 |
| `gg.SIGN_EQUAL` | `536870912` | 比较符号 |
| `gg.SIGN_FUZZY_EQUAL` | `536870912` | 比较符号 |
| `gg.SIGN_FUZZY_GREATER` | `67108864` | 比较符号 |
| `gg.SIGN_FUZZY_LESS` | `134217728` | 比较符号 |
| `gg.SIGN_FUZZY_NOT_EQUAL` | `268435456` | 比较符号 |
| `gg.SIGN_GREATER_OR_EQUAL` | `67108864` | 比较符号 |
| `gg.SIGN_LESS_OR_EQUAL` | `134217728` | 比较符号 |
| `gg.SIGN_NOT_EQUAL` | `268435456` | 比较符号 |
| `gg.TAB_MEMORY_EDITOR` | `3` | 界面标签页 |
| `gg.TAB_SAVED_LIST` | `2` | 界面标签页 |
| `gg.TAB_SEARCH` | `1` | 界面标签页 |
| `gg.TAB_SETTINGS` | `0` | 界面标签页 |
| `gg.TYPE_AUTO` | `127` | 数据类型 |
| `gg.TYPE_BYTE` | `1` | 数据类型 |
| `gg.TYPE_DOUBLE` | `64` | 数据类型 |
| `gg.TYPE_DWORD` | `4` | 数据类型 |
| `gg.TYPE_FLOAT` | `16` | 数据类型 |
| `gg.TYPE_QWORD` | `32` | 数据类型 |
| `gg.TYPE_WORD` | `2` | 数据类型 |
| `gg.TYPE_XOR` | `8` | 数据类型 |
| `gg.VERSION` | — | 运行时提供 |
| `gg.VERSION_INT` | — | 运行时提供 |

## 无 root 时的行为

GameGuardian 的 API 约定是**返回 true 或错误字符串**，不用 pcall。
Glua 严格遵循这一点：

```lua
-- 判断返回值类型，而不是用 pcall
local r = gg.searchNumber('100', gg.TYPE_DWORD)
if type(r) == 'string' then
    print('失败:', r)
    -- 输出: 失败: 错误: gg.searchNumber 需要读写目标进程内存，当前设备未 root
else
    -- 搜索成功，继续 getResults
    local n = gg.getResultsCount()
    print('找到', n, '个结果')
end
```

| 分类 | 无 root 时 |
|---|---|
| 提示与交互 | 正常 |
| 文本与编码 | 正常 |
| 脚本信息 | 正常 |
| 文件与变量 | 正常（本地文件） |
| 列表管理 | 正常（本地存储） |
| 速度与时间 | 返回错误字符串 |
| 内存操作 | 返回错误字符串 |
| 数值读写 | 返回错误字符串 |
| 内存区域 | 返回错误字符串 |
| 结果管理 | 返回错误字符串 |
| 进程控制 | 返回错误字符串 |
| 内存搜索 | 返回错误字符串 |

## 完整示例

### 数值搜索与修改

```lua
-- 需要 root
local function editScore(target)
    gg.clearResults()

    local ok = gg.searchNumber(tostring(target), gg.TYPE_DWORD)
    if type(ok) == 'string' then
        gg.toast('搜索失败: ' .. ok)
        return false
    end

    local count = gg.getResultsCount()
    if count == 0 then
        gg.toast('没找到')
        return false
    end

    local results = gg.getResults(count)
    for i, r in ipairs(results) do
        r.value = 99999
    end
    gg.setValues(results)
    gg.toast(string.format('已修改 %d 处', count))
    return true
end

editScore(100)
```

### 交互式菜单

```lua
-- 无 root 也能运行
local items = {'小数值', '大数值', '退出'}
local pick = gg.choice(items)

if pick == '小数值' then
    gg.alert('你选择了小数值')
elseif pick == '大数值' then
    gg.alert('你选择了大数值')
else
    print('取消或退出')
end
```

### 带输入框

```lua
local input = gg.prompt(
    {'目标地址', '新数值'},
    {'0x1234', '100'},
    {'text', 'number'}
)

if input then
    print('地址:', input[1])
    print('数值:', tonumber(input[2]))
end
```

### 遍历内存区域

```lua
local ranges = gg.getRanges()
print('当前区域掩码:', ranges)

-- 只搜索 C 堆
gg.setRanges(gg.REGION_C_HEAP)
gg.searchNumber('100', gg.TYPE_DWORD)

-- 恢复全部
gg.setRanges(gg.REGION_ALL)
```
