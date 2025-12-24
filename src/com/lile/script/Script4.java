package com.lile.script;

/**
 * String Operations and Text Blocks
 * 练习项：字符串操作与文本块
 * 
 * 重点练习知识点：
 * 1. 字符串字面量与常量池（String Pool）
 * 2. intern()方法的使用和常量池引用
 * 3. 字符串比较（== 与 equals的区别）
 * 4. Java 15+ 文本块（Text Blocks）的使用
 * 5. 字符串常用方法：indexOf(), charAt(), toUpperCase(), substring(), lastIndexOf()
 * 6. StringBuilder类的使用：replace(), length(), capacity()
 * 7. 字符串格式化：formatted()方法和String.format()
 */
public class Script4 {
    String teaTxt = "Tea";
    String b = "Tea";
    String c = new String("Tea");

    String p1 = """
    product 101
  "Hot Tea"
      price 1.99
""";

    String p2 = "product: %d, %s ,price: %2.2f";

    public static void main(String[] args) {
        Script4 script4 = new Script4();
        script4.c.intern();
        System.out.println("字面量公用常量池:" + (script4.teaTxt == script4.c));
        System.out.println("堆对象和常量池:" + (script4.teaTxt == script4.b));
        script4.c = script4.c.intern();
        System.out.println("返回常量池中引用再和常量池中的比较:" + (script4.teaTxt == script4.c));

        script4.c = script4.teaTxt + ' ' + script4.b;
        System.out.println(script4.c);

        System.out.println(script4.c.indexOf('T', 1));
        System.out.println(script4.c.charAt(script4.c.length() - 1));

        System.out.println(script4.c.toUpperCase());

        System.out.println(script4.c.substring(script4.c.lastIndexOf('T'), script4.c.lastIndexOf('T') + 2));

        System.out.println(script4.p1);

        StringBuilder txt = new StringBuilder(script4.c);
        System.out.println(txt.length());
        System.out.println(txt.capacity());
        txt.replace(script4.c.indexOf('T'),script4.c.indexOf('T') + 3,"What is the price of");
        System.out.println(txt.toString());
        System.out.println(txt.length());
        System.out.println(txt.capacity());

        System.out.println(script4.p2.formatted(101,"Tea",1.255f));
        System.out.println(String.format(script4.p2,101,"Tea",1.255f));
    }
}
