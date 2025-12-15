## Stage 1 - Java 基础语法与开发环境（逐题辅导）

目标：能写出基本控制台程序，掌握变量/流程控制/循环/方法/数组。
包路径：`com.example.cert21.stage1_basics`

### 题目清单与辅导

1) HelloWorld  
- 做什么：输出你的名字、当前日期、想考证的原因。  
- 提示：`System.out.println(...)`；日期可以先写死。  
- 参考答案要点：
```java
System.out.println("Name: Alice");
System.out.println("Date: 2025-12-08");
System.out.println("Goal: Pass Java SE 21 Dev Pro");
```

2) 变量与数据类型  
- 做什么：声明 `int/long/double/boolean/char/String`，做加减乘除并打印。  
- 提示：整数除法与浮点除法区别。  
- 参考答案要点：
```java
int a = 7, b = 3;
System.out.println(a + b);      //10
System.out.println(a / b);      //2
System.out.println(a / (double) b); //2.333...
```

3) 流程控制：奇偶、正负、范围  
- 做什么：给定整数，判断奇偶、正负、范围（0–100、>100）。  
- 提示：`if/else if/else` + `% 2`。  
- 参考答案要点：
```java
int n = 42;
System.out.println(n % 2 == 0 ? "even" : "odd");
if (n < 0) { ... } else if (n <= 100) { ... } else { ... }
```

4) 循环：求和与偶数打印  
- 做什么：求 1–100 的和；打印 1–100 的偶数。  
- 提示：`for (int i=1; i<=100; i++)`；偶数 `i % 2 == 0`。  
- 参考答案要点：
```java
int sum = 0;
for (int i = 1; i <= 100; i++) sum += i;
System.out.println(sum); //5050
for (int i = 2; i <= 100; i += 2) System.out.println(i);
```

5) 方法与参数  
- 做什么：写三个静态方法：阶乘、判断素数、数组平均值。  
- 提示：阶乘 n==0 返回1；素数检查到 `i*i <= n`；空数组平均值返回 0。  
- 参考答案要点：
```java
static long factorial(int n) { long r=1; for(int i=2;i<=n;i++) r*=i; return r; }
static boolean isPrime(int n) { if(n<=1) return false; for(int i=2;i*i<=n;i++) if(n%i==0) return false; return true; }
static double avg(int[] arr) { if(arr.length==0) return 0; long s=0; for(int v:arr) s+=v; return s*1.0/arr.length; }
```

6) 数组练习：成绩统计  
- 做什么：给定成绩数组，输出最高、最低、平均。  
- 提示：`max/min` 初始化为首元素；遍历更新。  
- 参考答案要点：
```java
int[] scores = {90, 78, 88, 95, 67};
int max = scores[0], min = scores[0]; long sum=0;
for (int s: scores) { if (s>max) max=s; if (s<min) min=s; sum+=s; }
double avg = sum * 1.0 / scores.length;
System.out.println(max + ", " + min + ", " + avg);
```

### 提交与检查
- 源码放 `src/main/java/com/example/cert21/stage1_basics`。
- 每完成 1–2 题即可 `git add . && git commit -m "Stage1 完成题X"`。
- 运行每个 `main` 验证输出正确。


