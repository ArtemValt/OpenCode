package com.opencode.Stage4.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println("Введите количество копий N");
        int n = sc.nextInt();
        System.out.println("Ввкдите ограничение на общую длину L");
        int l = sc.nextInt();
        System.out.println("Введите максимально количество слов М");
        int m = sc.nextInt();
        Func4 f = (str1, n1, l1, m1) -> {
            str1 = str1.substring(0, l1);
            String[] strings = str1.split(" ");
            List<String> stringList = Arrays.stream(strings).limit(m1).collect(Collectors.toList());
            String text = String.join(",", stringList);
            for (int i = 0; i < n1; i++) {
                System.out.println(i + 1 + ") " + text);
            }
        };
        f.fucn(str,n,l,m);
    }
}
