package com.lile.script;

/**
 * Character Case Conversion
 * 练习项：字符大小写转换
 * 
 * 重点练习知识点：
 * 1. if-else条件语句的使用
 * 2. 三元运算符（Ternary Operator）的嵌套使用
 * 3. 字符类型（char）的ASCII码运算（大小写转换：+/-32）
 * 4. StringBuilder类的使用和字符串拼接
 */
public class Script1 {

    public char getapitalLetter(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char)(c - 32);
        }else if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }else {
            return c;
        }
    }

    public char getapitalLetterTernary(char c) {
        return (c >= 'a' && c <= 'z') ? (char)(c - 32) : (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
    }

    public String getString(){
        StringBuilder stringBuilder = new StringBuilder("lile");
        stringBuilder.append(getapitalLetter('a'));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        char random = (char)(Math.random() * 100);
        Script1 charDemo = new Script1();
        System.out.println("If-Else: " + charDemo.getapitalLetter(random));
        System.out.println("Ternary: " + charDemo.getapitalLetterTernary(random));
        System.out.println(charDemo.getString());
    }
}
