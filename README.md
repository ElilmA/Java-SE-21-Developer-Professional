## Java SE 21 Developer Professional 认证学习项目说明

本项目定位为：**从零到通过 Oracle Java SE 21 Developer Professional 认证** 的系统化、自学友好型训练营。  
你只需要按顺序完成每个阶段的任务，不需要自己设计路线。

---

## 一、整体项目结构

项目根目录结构建议如下（你当前所在目录即为根目录）：

```text
Java-SE-21-Developer-Professional/
├── README.md                      ← 本学习总说明（傻瓜式指南）
├── pom.xml                        ← Maven 项目配置（后续自动或手动生成）
├── src
│   ├── main
│   │   └── java
│   │       └── com.example.cert21
│   │           ├── stage1_basics
│   │           ├── stage2_oop
│   │           ├── stage3_core_api
│   │           ├── stage4_advanced
│   │           ├── stage5_modern_java
│   │           └── stage6_mock_exam
│   └── test
│       └── java
│           └── com.example.cert21
│               └── tests
├── docs
│   ├── Stage1_Basics.md
│   ├── Stage2_OOP.md
│   ├── Stage3_Core_API.md
│   ├── Stage4_Advanced.md
│   ├── Stage5_Modern_Java.md
│   └── Stage6_Mock_Exam.md
└── submissions
    ├── stage1_basics
    ├── stage2_oop
    ├── stage3_core_api
    ├── stage4_advanced
    ├── stage5_modern_java
    └── stage6_mock_exam
```

> **你现在需要做的事：** 不用自己新建全部目录，按本 README 后面的步骤操作，我会一步步告诉你怎么创建和使用这些结构。

---

## 二、学习阶段总览（6 大阶段）

- **阶段 1：Java 基础语法与开发环境（Stage1_Basics）**  
  **目标**：能写出基本的 Java 控制台程序，理解变量、流程控制、方法、数组、基本调试。

- **阶段 2：面向对象与核心语言机制（Stage2_OOP）**  
  **目标**：熟练掌握类、对象、封装、继承、多态、抽象类、接口、内部类，理解封装与设计的基本思想。

- **阶段 3：核心 API 与异常、泛型、集合（Stage3_Core_API）**  
  **目标**：熟悉异常处理、常用类（String、包装类、时间 API）、泛型、集合框架，为考试打下核心 API 基础。

- **阶段 4：并发、IO/NIO、模块系统等高级主题（Stage4_Advanced）**  
  **目标**：掌握线程和并发基础、IO/NIO 文件和网络读写、模块化基础，能读懂和实现常见并发与 IO 代码。

- **阶段 5：现代 Java（函数式、Stream、记录类、模式匹配等）（Stage5_Modern_Java）**  
  **目标**：使用 Lambda、Stream、Optional、record、sealed classes 等现代特性编写简洁代码。

- **阶段 6：考试冲刺与模拟题（Stage6_Mock_Exam）**  
  **目标**：熟悉考试风格，完成多套模拟试题，总结错题，达到 **真题至少 75%+ 正确率**。

---

## 三、工具准备（一次性操作）

- **必备软件**
  - **JDK 21**：Oracle JDK 或 Temurin/OpenJDK 均可，要求版本为 21。
  - **构建工具**：Maven（推荐使用 3.9+）。
  - **IDE**：IntelliJ IDEA Community / Ultimate 均可。
  - **Git**（可选但强烈推荐）：用于提交和管理本项目代码。

- **检查 JDK 与 Maven 是否可用**

在终端或 PowerShell 中输入：

```bash
java -version
mvn -v
```

能看到版本号且无报错即可。

---

## 四、项目初始化与代码提交方式

### 4.1 使用 Maven 初始化项目（推荐）

在当前目录（`Java-SE-21-Developer-Professional`）下打开终端，执行：

```bash
mvn -B archetype:generate ^
  -DgroupId=com.example.cert21 ^
  -DartifactId=java-se21-cert ^
  -DarchetypeArtifactId=maven-archetype-quickstart ^
  -DinteractiveMode=false
```

> Windows PowerShell 如果换行有问题，可以去掉换行符 `^`，把命令写成一行执行。

执行后会生成一个标准 Maven 项目结构，你可以：

- 将生成的 `java-se21-cert` 目录内容移动/合并到当前项目根目录，  
  或者  
- 直接在 `java-se21-cert` 目录内继续按本 README 的分阶段结构学习。

**傻瓜式建议：**  
不想折腾结构的话，就直接在 `java-se21-cert/src/main/java` 下按下面的阶段包名来建包即可。

### 4.2 代码提交与版本管理（建议）

- **步骤 1：在项目根目录初始化 Git**

```bash
git init
```

- **步骤 2：每完成一个小练习就提交一次**

```bash
git add .
git commit -m "完成 Stage1 变量和流程控制练习"
```

- **步骤 3：如有 GitHub / Gitee 账号，可创建远程仓库**
  - 在网站新建仓库；
  - 按平台提示执行 `git remote add origin ...` 和 `git push`。

> **记住：** 每完成一个阶段，至少做一次完整提交，并在提交信息中写清楚「完成 StageX」。

---

## 五、分阶段详细练习指引（傻瓜式步骤）

下文只给出 **清晰的操作步骤与练习要求**，详细知识点请放在对应的 `docs/StageX_*.md` 中自行扩展。

### 5.1 阶段 1：Java 基础语法（Stage1_Basics）

- **阶段目标**
  - 能独立编写：输入、输出、条件判断、循环、方法调用。
  - 熟悉基本数据类型、运算符、数组。

- **目录与包建议**
  - 包名：`com.example.cert21.stage1_basics`
  - 建议类：
    - `HelloWorld`
    - `VariablesAndTypes`
    - `ControlFlow`
    - `MethodsAndParameters`
    - `ArraysPractice`

- **必做练习（按顺序来）**
  1. **HelloWorld**
     - 在 `HelloWorld` 中输出：你的名字、当前日期、想通过本证书的原因。
  2. **变量与数据类型**
     - 在 `VariablesAndTypes` 中声明各种基本类型变量，做加减乘除运算，并打印结果。
  3. **流程控制练习**
     - 写一个程序：
       - 读取用户输入的整数（假设来自命令行参数或固定变量），判断奇偶、正负、范围（0–100、>100）。
  4. **循环练习**
     - 打印 1–100 所有数字的和。
     - 打印 1–100 所有偶数。
  5. **方法与参数**
     - 写一个类，包含：
       - 计算阶乘的方法；
       - 判断素数的方法；
       - 计算数组平均值的方法。
  6. **数组练习**
     - 实现一个简单的「成绩统计」程序：给定一组成绩数组，输出最高分、最低分、平均分。

- **代码存放与提交方式**
  - 源码统一放在：`src/main/java/com/example/cert21/stage1_basics`。
  - 如果想保留阶段成果快照，可把你觉得满意的版本额外复制到：`submissions/stage1_basics/`。
  - 完成全部练习后：
    - 运行所有 main 方法测试；
    - `git add . && git commit -m "完成 Stage1 基础语法练习"`。

---

### 5.2 阶段 2：面向对象（Stage2_OOP）

- **阶段目标**
  - 能定义合理的类与对象；
  - 理解封装、继承、多态；
  - 正确使用抽象类、接口、构造方法、this/super。

- **目录与包建议**
  - 包名：`com.example.cert21.stage2_oop`
  - 建议类：
    - `Person`, `Student`, `Teacher`
    - `Account`, `SavingAccount`, `CreditAccount`
    - 接口：`Movable`, `Drawable`

- **必做练习**
  1. **课堂人物模型**
     - 创建 `Person`（姓名、年龄）；
     - `Student` 和 `Teacher` 继承 `Person`；
     - 重写 `toString()` 打印基本信息；
     - 在 main 中创建多个对象并打印。
  2. **银行账户模型**
     - 抽象类 `Account`：属性（账号、余额）、方法（`deposit`、`withdraw`）。
     - `SavingAccount` 和 `CreditAccount` 继承 `Account`，实现不同的取款规则。
  3. **接口与多态**
     - 定义接口 `Movable`（`move()`）和 `Drawable`（`draw()`）；
     - 定义类 `Car`、`Bike`、`Circle`、`Rectangle` 等，实现上述接口；
     - 使用接口引用调用实现类方法，体会多态。

- **提交方式**
  - 源码：`src/main/java/com/example/cert21/stage2_oop`。
  - 阶段快照（可选）：`submissions/stage2_oop/`。
  - 提交信息建议：`git commit -m "完成 Stage2 面向对象练习"`。

---

### 5.3 阶段 3：异常、泛型、集合等核心 API（Stage3_Core_API）

- **阶段目标**
  - 熟练使用 `try-catch-finally`、`throws`、自定义异常；
  - 理解泛型类与泛型方法；
  - 熟悉 `List`、`Set`、`Map`、`Queue` 及常见实现类。

- **目录与包建议**
  - 包名：`com.example.cert21.stage3_core_api`

- **必做练习（示例）**
  1. 自定义异常：`InvalidAgeException`，在设置年龄时校验。
  2. 编写一个 `GenericBox<T>`，支持存取任意类型对象。
  3. 使用 `ArrayList` 实现「任务清单」；
  4. 使用 `HashMap` 实现「学生成绩表」，支持增删改查；
  5. 使用 `LinkedList` 或 `Queue` 模拟排队叫号系统。

- **提交方式**
  - 源码：`src/main/java/com/example/cert21/stage3_core_api`。
  - 提交信息建议：`git commit -m "完成 Stage3 核心 API 练习"`。

---

### 5.4 阶段 4：并发、IO/NIO、模块系统（Stage4_Advanced）

- **阶段目标**
  - 能写出基本多线程程序，理解线程生命周期；
  - 使用 `synchronized`、`Lock` 等简单同步工具；
  - 使用 `java.io` 与 `java.nio` 读写文件；
  - 了解 Java 模块化（module-info.java）。

- **目录与包建议**
  - 包名：`com.example.cert21.stage4_advanced`

- **必做练习（示例）**
  1. 多线程打印数字：两个线程分别打印奇数和偶数；
  2. 模拟银行账户并发存取钱，观察同步和不同步的差异；
  3. 使用 `BufferedReader/Writer` 复制文本文件；
  4. 使用 `Files` 和 NIO Path API 遍历目录，统计某后缀文件数量；
  5. 创建一个简单模块化项目，包含 `module-info.java`。

- **提交方式**
  - 源码：`src/main/java/com/example/cert21/stage4_advanced`。
  - 提交信息建议：`git commit -m "完成 Stage4 并发与 IO 练习"`。

---

### 5.5 阶段 5：现代 Java 特性（Stage5_Modern_Java）

- **阶段目标**
  - 熟练使用 Lambda、方法引用；
  - 掌握 `Stream` API 的常见操作（filter/map/reduce/collect 等）；
  - 使用 `Optional` 避免 NPE；
  - 理解并能使用 Java 21 相关特性（如 records、pattern matching 等）。

- **目录与包建议**
  - 包名：`com.example.cert21.stage5_modern_java`

- **必做练习（示例）**
  1. 使用 Stream 对一组 `Person` 数据过滤、分组、排序；
  2. 将前面阶段的某个「学生成绩表」改造为使用 Stream 分析成绩；
  3. 使用 `record` 定义不可变数据载体类；
  4. 使用 `switch` pattern matching 简化多分支判断。

- **提交方式**
  - 源码：`src/main/java/com/example/cert21/stage5_modern_java`。
  - 提交信息建议：`git commit -m "完成 Stage5 现代 Java 特性练习"`。

---

### 5.6 阶段 6：模拟考试与错题整理（Stage6_Mock_Exam）

- **阶段目标**
  - 了解真实考试题型与时间压力；
  - 通过多轮模拟题强化薄弱点；
  - 真题/模拟题正确率稳定在 **75%–80% 以上**。

- **建议做法**
  - 从市面上（Oracle 官方/第三方）找 3–5 套高质量模拟题；
  - 每套题按正式考试时间做一遍；
  - 每套题做完后：
    - 统计错误题目编号；
    - 看官方/权威解析；
    - 在本项目 `docs/Stage6_Mock_Exam.md` 中记录：题目考点 + 自己的错误原因 + 正确结论。

- **提交方式**
  - 可以在 `src/main/java/com/example/cert21/stage6_mock_exam` 中写一些用于验证概念的小程序；
  - 错题与总结统一写入：`docs/Stage6_Mock_Exam.md`；
  - 提交信息建议：`git commit -m "完成 Stage6 模拟题与错题总结"`。

---

## 六、最终预期能力（达成标准）

当你认真完成上述 6 个阶段的代码练习与文档记录后，你应具备：

- **语言基础**：对 Java 语法、面向对象、常用 API 有扎实掌握；
- **实践能力**：能从零实现中小型控制台项目，读懂规范 Java 代码；
- **考试能力**：
  - 熟悉考试大纲涉及的所有技术点；
  - 能在模拟题中达到 75%–80% 以上正确率；
  - 对每个错题都有书面反思与知识点总结。

> **接下来你可以做的事：**
> 1. 按 4.1 小节初始化 Maven 项目；
> 2. 在 `src/main/java` 中创建 `com.example.cert21.stage1_basics` 包；
> 3. 写出你的第一个 `HelloWorld`，然后告诉我你已经跑通，我可以继续帮你细化每个阶段的具体练习与参考实现。


