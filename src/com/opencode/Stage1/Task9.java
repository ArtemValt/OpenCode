package com.opencode.Stage1;

public class Task9 {
    public String isPondrom(String str) {
        String s = str.toLowerCase().replaceAll("\\s", "");
        StringBuilder stringBuilder = new StringBuilder(s).reverse();
        String strRev = stringBuilder.toString();
        System.out.println("Исходное предложение = " + s);
        System.out.println("Предложение после реверса = " + strRev);
        return (s.equals(strRev) ? "Это полиндром" : "Это не полиндром");
    }
}
