# Git团队协作开发规范文档
## 1. 规范来源
本文档使用前端框架`Angular`的仓库提交规范。
## 2. 规范目的
- 为了更好的管理项目，提高项目的可维护性。
- 为了方便项目的迭代和版本管理。
- 为了更好的管理团队成员的工作。
- 为了保证代码的书写质量。
## 3. 规范内容
### 3.1 分支管理
- `master`分支：主分支，用于发布正式版本，只能从`develop`分支合并。
- `develop`分支：开发分支，用于日常开发，只能从`feature`分支合并。
### 3.2 提交规范
- 提交信息的格式：`<type>(<scope>): <subject>`
- 提交信息的类型：`feat`、`fix`、`docs`、`style`、`refactor`、`test`、`chore`、`revert`。
- 提交信息的范围：`<scope>`用于说明提交的影响范围，比如`<scope>`可以是`component`、`directive`、`service`、`model`、`view`、`controller`、`module`、`route`、`config`、`directive`、`filter`、`template`、`style`、`build`、`ci`、`docs`、`perf`、`refactor`、`test`、`tool`、`vendor`等。
- 提交信息的主题：`<subject>`是提交信息的简短描述，不超过50个字符。
- 提交信息的主体：`<body>`是提交信息的详细描述，可以分为多行，每行不超过72个字符。
- 提交信息的结尾：`<footer>`是提交信息的结尾，可以分为多行，每行不超过72个字符。
### 3.3 提交示例
```bash
# feat: 新增了一个功能
# fix: 修复了一个bug
# docs: 修改了文档
# style: 修改了代码格式
# refactor: 重构了代码
# test: 增加了测试
# chore: 修改了构建流程、或者增删了依赖库、工具等
# revert: 撤销了上一次的提交
# feat(component): 新增了一个组件
# fix(directive): 修复了一个指令
# docs(service): 修改了服务的文档
# style(model): 修改了模型的代码格式
# refactor(view): 重构了视图
# test(controller): 增加了控制器的测试
# chore(module): 修改了模块的构建流程
# revert(route): 撤销了路由的上一次的提交
# feat(component): 新增了一个组件
```
### 3.4 必要说明
```
<type>(<scope>): <subject>
# 空一行
<body>
# 空一行
<footer>
```
- `<type>`和`<subject>`是必需的，`<body>`和`<footer>`是可选的。
- 一般情况下我们只需要写`<type>`、`<scope>`和`<subject>`。
- 如果`<type>`是`feat`、`fix`、`docs`、`style`、`refactor`、`test`、`chore`、`revert`中的任意一个，那么`<scope>`是必需的。
- [强制]每次提交必须有`type`和`subject`，非`docs`、`style`其余类型必须包含`scope`。
### 3.5 提交示例
示例：新增了一个邮件工具类
```
feat(utils): 新增了一个邮件工具类
```
or
```
feat(tool): 新增了一个邮件工具类
```
or
```
feat(工具类): 新增了一个邮件工具类
```
示例：整理了一下代码格式
```
style: 整理了一下代码格式
```
注：`style`类型不需要`scope`。
### 3.6 提交注意
1. 在每次提交之前，先从`develop`分支拉取最新代码，然后再合并到`develop`分支。
2. 如果是改动之前的提交，一定要立即提交，不要等到一次性提交，且提交需要标识`revert`。
3. 如果是新增功能，一定要先提交到`develop`分支，然后再合并到`master`分支。
4. 核心功能的提交，一定要写明`type`和`scope`，非核心功能的提交，一定要写明`type`。
5. 多提交、多合并、多拉取，保证代码的最新性。