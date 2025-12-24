package com.lile.script;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Script7 {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
        String offerPattern = resourceBundle.getString("offer");
        String datePattern = resourceBundle.getString("dateFormat");
        System.out.println(offerPattern);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String price = numberFormat.format(12.5);
        String format = MessageFormat.format(offerPattern, "tea", price, 0.08, LocalDate.now());
        System.out.println(format);
        numberFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.GERMANY);
        percentFormat.setMaximumFractionDigits(2);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT+8"));
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern, Locale.GERMANY);
        String priceTxt = numberFormat.format(99.9);
        String rateTxt = percentFormat.format(0.22);
        String timeTxt = dateFormatter.format(zonedDateTime);
        format = MessageFormat.format(offerPattern, priceTxt, rateTxt, timeTxt);
        System.out.println(format);
    }
}
