package com.kuntsevich.cutil.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    private static final int ZERO = 0;

    public boolean isPositiveNumber(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        float number;
        try {
            number = NumberUtils.createFloat(str);
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't convert given value to digit");
        }
        return number > ZERO;
    }
}
