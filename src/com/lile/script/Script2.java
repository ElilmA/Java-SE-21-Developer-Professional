package com.lile.script;

/**
 * Traditional Switch Statement with Fall-through
 * 练习项：传统switch语句与fall-through机制
 * 
 * 重点练习知识点：
 * 1. 传统switch语句的语法结构
 * 2. case标签的fall-through（穿透）机制
 * 3. break语句的作用和使用场景
 * 4. 浮点数运算和复合赋值运算符（+=）
 */
public class Script2 {
    int period = 4;
    float amount = 10;
    float rate = 0.05f;

    public float calculateInterest() {
        switch (period) {
            case 4:
                amount += amount * 0.2f;
                break;
            case 3:
                amount += amount * rate;
            case 2:
                amount += amount * rate;
            case 1:
                amount += amount * rate;
        }
        return amount;
    }

    public static void main(String[] args) {
        Script2 script2 = new Script2();
        System.out.println("Interest: " + script2.calculateInterest());
    }
}
