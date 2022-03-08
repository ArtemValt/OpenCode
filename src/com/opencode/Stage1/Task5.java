package com.opencode.Stage1;
public class Task5{

    public int task() {
        String str = "Hello World!";
        int code = 0;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            code += (int) c;
            System.out.println("Код символа "+c+" = " + (int)c );
        }
        System.out.println("Код предложения = "+code);
        return code;
    }
}