package com.epam.utils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        BigDecimal bigDecimal;
        try {
            bigDecimal = new BigDecimal(str);
        } catch (RuntimeException e) {
            return false;
        }
        return bigDecimal.abs().equals(bigDecimal) && bigDecimal.intValue() != 0;
    }
}
