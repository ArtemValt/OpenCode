package com.opencode.Stage4.task2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        Sentence sentence = new Sentence(str);
        Duble ref = (sent) -> {
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList(str));
            List uniquelist = list.stream().distinct().collect(Collectors.toList());
            return uniquelist;
        };
        System.out.println("Ваш изменненый текст : \n" + String.join(" ", ref.notDuble(sentence)));
    }
}