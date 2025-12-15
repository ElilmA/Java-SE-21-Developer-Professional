## Stage 2 - 面向对象编程（逐题辅导）

目标：熟练类/对象、封装、继承、多态、抽象类、接口。  
包路径：`com.example.cert21.stage2_oop`

### 题目清单与辅导

1) 课堂人物模型  
- 做什么：`Person`（姓名、年龄），子类 `Student`、`Teacher`；重写 `toString()` 并在 main 打印。  
- 提示：构造器用 `super(...)`；`@Override toString()`。  
- 参考答案要点：
```java
class Person { String name; int age; Person(String n,int a){this.name=n;this.age=a;}
  @Override public String toString(){ return name + " (" + age + ")";}}
class Student extends Person { Student(String n,int a){ super(n,a); } }
class Teacher extends Person { Teacher(String n,int a){ super(n,a); } }
```

2) 银行账户模型  
- 做什么：抽象类 `Account`（账号、余额，`deposit/withdraw`），子类 `SavingAccount`、`CreditAccount` 不同取款规则。  
- 提示：`abstract class`；`protected double balance`; 在子类检查取款条件。  
- 参考答案要点：
```java
abstract class Account {
  protected String number; protected double balance;
  Account(String n,double b){number=n;balance=b;}
  void deposit(double amt){ balance += amt; }
  abstract boolean withdraw(double amt);
}
class SavingAccount extends Account {
  SavingAccount(String n,double b){ super(n,b); }
  boolean withdraw(double amt){ if(amt<=balance){ balance-=amt; return true;} return false; }
}
class CreditAccount extends Account {
  private double limit = 1000;
  CreditAccount(String n,double b){ super(n,b); }
  boolean withdraw(double amt){ if(balance + limit >= amt){ balance -= amt; return true;} return false; }
}
```

3) 接口与多态  
- 做什么：接口 `Movable`（`move()`）、`Drawable`（`draw()`）；类 `Car/Bike` 实现 `Movable`，`Circle/Rectangle` 实现 `Drawable`；用接口引用演示多态。  
- 提示：`Movable m = new Car(); m.move();`  
- 参考答案要点：
```java
interface Movable { void move(); }
interface Drawable { void draw(); }
class Car implements Movable { public void move(){ System.out.println("Car move"); } }
class Bike implements Movable { public void move(){ System.out.println("Bike move"); } }
class Circle implements Drawable { public void draw(){ System.out.println("Circle"); } }
class Rectangle implements Drawable { public void draw(){ System.out.println("Rectangle"); } }
```

### 提交与检查
- 源码放 `src/main/java/com/example/cert21/stage2_oop`。
- 每完成一题就运行 `main` 验证，再 `git add . && git commit -m "Stage2 完成题X"`。


