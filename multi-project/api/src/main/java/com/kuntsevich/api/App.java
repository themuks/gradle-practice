package com.kuntsevich.api;

import com.kuntsevich.core.Utils;

public class App {
    public static void main(String[] args) {
        boolean isPositive = Utils.isAllPositiveNumbers("12", "79");
        System.out.println(isPositive);
    }
}
