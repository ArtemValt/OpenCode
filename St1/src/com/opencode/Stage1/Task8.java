package com.opencode.Stage1;
public class Task8 {
    private String [] tocens;
    private  int pos=0;
    public Task8(String str){
        this.tocens=str.split(" ");

    }

    public double calculate() {
        double first = mult();
        while (pos<tocens.length){
            String oper = tocens[pos];
            if(!oper.equals("+") && !oper.equals("-"))
                break;
            else
                pos++;
            double second = mult();
            if(oper.equals("+"))
                first+=second;
            else
                first-=second;
        }
        return first;
    }
    public double mult(){
        double first = Double.parseDouble(tocens[pos++]);
        while (pos<tocens.length){
            String oper = tocens[pos];
            if(!oper.equals("*") && !oper.equals("/"))
                break;
            else
                pos++;
            double second = Double.parseDouble(tocens[pos++]);
            if(oper.equals("*"))
                first*=second;
            else
                first/=second;
        }
        return first;
    }
}
