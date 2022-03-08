package com.opencode.Stage1;

public class Task4 {
    public String  outMassiv(int n){
        int[] sc = new int[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sc.length; i++) {
            sc[i] = i;
            if (sc[i] %10==1){
                sb.append("\n");
            }
            sb.append(i);
            sb.append(" ");
        }
        String str = sb.toString()+" ";
        return str;
    }
}