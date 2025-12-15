## Stage 3 - 核心 API（异常、泛型、集合）（逐题辅导）

目标：自定义异常、泛型类/方法，熟练 List/Set/Map/Queue。  
包路径：`com.example.cert21.stage3_core_api`

### 题目清单与辅导

1) 自定义异常  
- 做什么：`InvalidAgeException`；设置年龄时校验，非法抛出。  
- 提示：继承 `RuntimeException`；在 setter 校验。  
- 参考答案要点：
```java
class InvalidAgeException extends RuntimeException {
  InvalidAgeException(String msg){ super(msg); }
}
void setAge(int age){ if(age<0 || age>150) throw new InvalidAgeException("bad age"); this.age=age; }
```

2) 泛型盒子 `GenericBox<T>`  
- 做什么：存取任意类型；`get/set`。  
- 提示：字段 `T value;`。  
- 参考答案要点：
```java
class GenericBox<T> { private T value;
  public GenericBox(T v){ this.value=v; }
  public T get(){ return value; }
  public void set(T v){ this.value=v; }
}
```

3) 任务清单（`ArrayList`）  
- 做什么：增、列、删任务并打印。  
- 提示：`List<String> tasks = new ArrayList<>();`。  
- 参考答案要点：
```java
tasks.add("Learn if");
tasks.remove("Learn if");
for (String t: tasks) System.out.println(t);
```

4) 学生成绩表（`HashMap`）  
- 做什么：增删改查，打印。  
- 提示：`Map<String,Integer> scores = new HashMap<>();`。  
- 参考答案要点：
```java
scores.put("Alice", 90);
scores.get("Alice");
scores.remove("Bob");
scores.replace("Alice", 95);
```

5) 排队叫号（`Queue`/`LinkedList`）  
- 做什么：入队、出队、查看队头。  
- 提示：`Queue<String> q = new LinkedList<>(); q.offer(...); q.poll(); q.peek();`。

### 提交与检查
- 源码放 `src/main/java/com/example/cert21/stage3_core_api`。
- 每题写 `main` 打印验证；完成即 `git commit -m "Stage3 完成题X"`。


