package com.kuntsevich.core;

import com.kuntsevich.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        for (String s : str) {
            if (!stringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
