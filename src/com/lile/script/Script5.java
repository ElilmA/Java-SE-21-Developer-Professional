package com.lile.script;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Precise Numeric Calculation and Formatting
 * 练习项：精确数值计算与格式化
 * 
 * 重点练习知识点：
 * 1. BigDecimal类的使用（精确的浮点数计算）
 * 2. BigDecimal的运算方法：subtract(), multiply()
 * 3. setScale()方法和RoundingMode（舍入模式）的使用
 * 4. NumberFormat类的使用：货币格式化、百分比格式化
 * 5. Locale（区域设置）的使用
 * 6. 紧凑数字格式化（CompactNumberFormat）
 */
public class Script5 {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(1.85);
        BigDecimal rate = BigDecimal.valueOf(0.065);
        double numCustomers = 100000;
        price = price.subtract(price.multiply(rate)).setScale(2,RoundingMode.HALF_UP);
        System.out.println(price);
        Locale locale = Locale.UK;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        NumberFormat compactFormat = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
        System.out.println(currencyFormat.format(price));
        System.out.println(percentFormat.format(rate));
        System.out.println(compactFormat.format(numCustomers));
    }
}
