## Stage 4 - 并发、IO/NIO、模块（逐题辅导）

目标：能写基础多线程；理解同步；会用 IO/NIO；了解模块化。  
包路径：`com.example.cert21.stage4_advanced`

### 题目清单与辅导

1) 两线程打印奇偶  
- 做什么：线程 A 打印奇数，线程 B 打印偶数。  
- 提示：`Runnable` + `new Thread(r).start()`；基础版各自打印即可。  
- 参考答案要点：
```java
Runnable odd = () -> { for(int i=1;i<=10;i+=2) System.out.println("odd "+i); };
Runnable even = () -> { for(int i=2;i<=10;i+=2) System.out.println("even "+i); };
new Thread(odd).start(); new Thread(even).start();
```

2) 并发存取钱  
- 做什么：共享账户，多线程存/取，观察同步差异。  
- 提示：无同步会竞态；用 `synchronized` 包住更新。  
- 参考答案要点：
```java
class BankAccount { private int balance=0;
  public synchronized void deposit(int x){ balance+=x; }
  public synchronized void withdraw(int x){ balance-=x; }
  public int get(){ return balance; }
}
```

3) IO：复制文本文件  
- 做什么：用 `BufferedReader/Writer` 逐行复制。  
- 提示：`try (var r = new BufferedReader(...); var w = new BufferedWriter(...)) { ... }`  
- 参考答案要点：
```java
String line;
while((line = r.readLine()) != null){ w.write(line); w.newLine(); }
```

4) NIO：遍历目录统计后缀  
- 做什么：遍历目录，统计指定后缀文件数。  
- 提示：`Files.walk(Path.of("."))` + `filter(p -> p.toString().endsWith(".txt"))`。  
- 参考答案要点：
```java
long count = Files.walk(Path.of("."))
  .filter(Files::isRegularFile)
  .filter(p -> p.toString().endsWith(".txt"))
  .count();
```

5) 简单模块化  
- 做什么：添加 `module-info.java`，导出一个包。  
- 提示：`module com.example.cert21 { exports com.example.cert21.stage4_advanced; }`

### 提交与检查
- 源码放 `src/main/java/com/example/cert21/stage4_advanced`。  
- 每题跑一下 `main` 或写最小示例；完成即 `git commit -m "Stage4 完成题X"`。


