package com.opencode.Stage1;
public class Task3 {
    public void task3(){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(!a ^ b);
        System.out.println(a ^ c);
        System.out.println((2 < 5) ^ false);
        System.out.println((2 > 5) ^ true);
        boolean aa = true;
        boolean bb = false;
        boolean cc = true;
        System.out.println(!aa | bb);
        System.out.println(aa | cc);
        System.out.println((2 < 5) | false);
        System.out.println((2 > 5) | true);
    }

}