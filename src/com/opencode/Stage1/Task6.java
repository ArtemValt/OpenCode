package com.opencode.Stage1;

import java.util.Arrays;

public class Task6 {
    public void task6(String st) {
        String str = st;
        int result = 0;
        String chars = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += str.lastIndexOf(c) != str.indexOf(c) ? 1 : 0;
            chars += str.lastIndexOf(c) != str.indexOf(c) ? c : "";
        }

        char[] ch = chars.toCharArray();
        Arrays.sort(ch);
        String s = String.valueOf(ch);
        for (int i = 0; i < ch.length; ) {
            System.out.println("Этот символ = "+ ch[i] + " встречается " + (s.lastIndexOf(ch[i]) - s.indexOf(ch[i]) + 1) + " раза");
            i += (s.lastIndexOf(ch[i]) - s.indexOf(ch[i]) + 1);
        }

    }
}