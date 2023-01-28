package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String s : args) {
            if (!isPositiveNumber(s)) {
                return false;
            }
        }

        return true;
    }
}