package com.lile.script;

/**
 * Switch Expression (Java 14+)
 * 练习项：Java 14+ switch表达式
 * 
 * 重点练习知识点：
 * 1. switch表达式（switch expression）的语法
 * 2. 箭头语法（->）的使用
 * 3. 多case标签合并（case 1, 2, 3 ->）
 * 4. yield关键字的使用（在switch表达式中返回值）
 * 5. switch表达式作为赋值语句的右侧
 */
public class Script3 {
    int period = 5;
    float amount = 5500;
    float rate = 0;

    public float calculateInterest() {
        float rate = 0.0F;
        rate = switch (period) {
            case 1, 2, 3 -> 0.1F;
            case 4, 5, 6 -> 0.08F;
            case 7, 8, 9, 10 -> 0.07F;
            default -> 0.06F;
        };
        float simpleInterest = amount * period * rate;

        amount += switch (period) {
            case 1, 2, 3, 4, 5:
                yield simpleInterest - 100.00F;
            case 6, 7, 8, 9, 10:
                yield simpleInterest - 150.00F;
            default:
                yield simpleInterest - 200.00F;
        };
        return amount;
    }

    public static void main(String[] args) {
        Script3 switchExpression = new Script3();
        System.out.println("Interest: " + switchExpression.calculateInterest());
    }
}
