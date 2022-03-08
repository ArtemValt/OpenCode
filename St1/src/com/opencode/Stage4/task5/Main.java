package com.opencode.Stage4.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите цифру");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Fibonachi f = (s) -> {
            double tmp = 5 * a * a - 4;
            double tmp1 = 5 * a * a + 4;
            double sq = (long)Math.sqrt(tmp);
            double sq1 = (long)Math.sqrt(tmp1);
            return sq * sq == tmp || sq1 * sq1 == tmp1;
        };
        System.out.println("Является ли ваще число - числом Фибоначчи = \t" + f.fibonac(a));
    }
}