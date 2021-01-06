package com.kuntsevich.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @ParameterizedTest
    @MethodSource("dataSource")
    void isPositiveNumber(boolean expected, String number) {
        boolean actual = stringUtils.isPositiveNumber(number);
        assertEquals(expected, actual);
    }

    @Test
    void isPositiveNumber_NullGiven_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.isPositiveNumber(null);
        });
    }

    @Test
    void isPositiveNumber_NonNumberGiven_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.isPositiveNumber("abc");
        });
    }

    @Test
    void isPositiveNumber_EmptyStringGiven_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.isPositiveNumber("");
        });
    }

    @Test
    void isPositiveNumber_BlankStringGiven_ExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.isPositiveNumber("  ");
        });
    }

    static Stream<Arguments> dataSource() {
        return Stream.of(
                Arguments.arguments(true, "123"),
                Arguments.arguments(true, "123.123"),
                Arguments.arguments(true, "9999"),
                Arguments.arguments(false, "-123"),
                Arguments.arguments(false, "0"),
                Arguments.arguments(false, "-0")
        );
    }
}