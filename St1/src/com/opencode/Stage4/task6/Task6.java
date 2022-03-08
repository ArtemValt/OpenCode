package com.opencode.Stage4.task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("Введите количество простых чисел ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Gener start = new Gener();
        start.generate(n);
        start.show();
    }
}
