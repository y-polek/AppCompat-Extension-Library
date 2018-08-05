package com.tr4android.support.extension.utils;

import com.vdurmont.emoji.EmojiManager;

import java.util.Locale;

public class TextUtils {

    public static String abbreviate(String text) {
        String[] words = text.split("\\s");

        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < words.length && builder.length() < 2) {
            String word = words[i].trim();
            if (word.length() > 0) builder.append(firstSymbol(word).toUpperCase(Locale.US));
            i++;
        }

        return builder.toString();
    }

    /**
     * Returns first symbol in a string.
     * Supports emojis and unicode code points.
     */
    private static String firstSymbol(String text) {
        if (text.isEmpty()) return "";

        for (int i=text.length(); i>=1; i--) {
            String str = text.substring(0, i);
            if (EmojiManager.isEmoji(str)) return str;
        }

        return new StringBuilder().appendCodePoint(text.codePointAt(0)).toString();
    }
}
