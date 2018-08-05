package com.tr4android.support.extension.utils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TextUtilsTest {

    @Test
    public void testAbbreviateSingleWord() {
        assertEquals("A", TextUtils.abbreviate("Abc"));
    }

    @Test
    public void testAbbreviateTwoWords() {
        assertEquals("AB", TextUtils.abbreviate("Abc Bcd"));
    }

    @Test
    public void testAbbreviateThreeWords() {
        assertEquals("AB", TextUtils.abbreviate("Abc Bcd Cde"));
    }

    @Test
    public void testAbbreviateEmptyString() {
        assertEquals("", TextUtils.abbreviate(""));
    }

    @Test
    public void testAbbreviateWhitespacesOnly() {
        assertEquals("", TextUtils.abbreviate(" \t \t"));
    }

    @Test
    public void testAbbreviateIsCapitalized() {
        assertEquals("AB", TextUtils.abbreviate("abc bcd"));
    }

    @Test
    public void testAbbreviateStartsWithWhitespace() {
        assertEquals("AB", TextUtils.abbreviate(" Abc Bcd"));
    }

    @Test
    public void testAbbreviateTabSeparated() {
        assertEquals("AB", TextUtils.abbreviate("Abc\tBcd"));
    }

    @Test
    public void testAbbreviateLongWhitespace() {
        assertEquals("AB", TextUtils.abbreviate("Abc    \tBcd"));
    }

    @Test
    public void testEmoji() {
        assertEquals("🇺🇸", TextUtils.abbreviate("🇺🇸 NAS"));
    }
}