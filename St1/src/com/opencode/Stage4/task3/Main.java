package com.opencode.Stage4.task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цифру");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Taskfo3 f = (s) ->{
            if(a%13==0)
                return true;
            else
                return false;
        };
        System.out.println("Делится ли ваше число без остатка \t" +f.meth(a));
    }
}