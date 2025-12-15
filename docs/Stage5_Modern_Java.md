## Stage 5 - 现代 Java 特性（逐题辅导）

目标：熟练 Lambda、Stream、Optional，掌握 record、模式匹配等 Java 21 特性。  
包路径：`com.example.cert21.stage5_modern_java`

### 题目清单与辅导

1) Stream 过滤/排序/分组  
- 做什么：对 `List<Person>` 过滤年龄 >18，按姓名排序，按城市分组。  
- 提示：`filter`、`sorted(Comparator.comparing(...))`、`Collectors.groupingBy`。  
- 参考答案要点：
```java
List<Person> adults = people.stream()
  .filter(p -> p.age() > 18)
  .sorted(Comparator.comparing(Person::name))
  .toList();
Map<String,List<Person>> byCity = people.stream()
  .collect(Collectors.groupingBy(Person::city));
```

2) 成绩表用 Stream 分析  
- 做什么：对成绩求平均、最高，按及格/不及格分组。  
- 提示：`mapToInt`，`Collectors.partitioningBy(score>=60)`。  
- 参考答案要点：
```java
double avg = scores.stream().mapToInt(i->i).average().orElse(0);
int max = scores.stream().mapToInt(i->i).max().orElse(0);
Map<Boolean,List<Integer>> passFail = scores.stream()
  .collect(Collectors.partitioningBy(s -> s >= 60));
```

3) `record` 数据载体  
- 做什么：定义 `record Person(String name, int age, String city)`，创建并打印。  
- 提示：record 自动生成构造、访问器、`toString`。  
- 参考答案要点：
```java
record Person(String name, int age, String city) {}
```

4) `switch` 模式匹配（Java 21）  
- 做什么：对 `Object obj` 用模式匹配 switch，不同类型输出不同文本。  
- 提示：`case String s -> ...; case Integer i -> ...; case null -> ...; default -> ...;`  
- 参考答案要点：
```java
String result = switch (obj) {
  case String s  -> "string " + s;
  case Integer i -> "int " + i;
  case null      -> "null";
  default        -> "other";
};
```

### 提交与检查
- 源码放 `src/main/java/com/example/cert21/stage5_modern_java`。  
- 每题写 main 验证；完成即 `git commit -m "Stage5 完成题X"`。


