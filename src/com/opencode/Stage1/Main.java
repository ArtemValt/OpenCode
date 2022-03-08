package com.opencode.Stage1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 1
        Task1 task1 = new Task1();
        task1.hi();
        //task 2
        Task2 task2 = new Task2();
        System.out.println(task2.intsumruslt(2,2));
        System.out.println(task2.floatminruslt(4.2f, 3.1f));
        System.out.println(task2.intfloaysum(2,3.4f));

        //task 3
        Task3 task3 = new Task3();
        task3.task3()   ;
        //task4
        Task4 task4 = new Task4();
        System.out.println( task4.outMassiv(30));
        System.out.println();
        //task5
        Task5 task5 = new Task5();
        System.out.println(task5.task());
        //task6
        Task6 task6 = new Task6();
        task6.task6("Hello World!");
        //task 7
        Task7 task7 = new Task7();
        task7.task7(100);
        //task 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expr = sc.nextLine();
        Task8 task8 = new Task8(expr);
        System.out.println(task8.calculate());
        //task9
        Task9 task9 = new Task9();
        System.out.println(task9.isPondrom("Лёша на полке клопа нашёл"));
        System.out.println(task9.isPondrom(" Hello World!"));
    }
}
