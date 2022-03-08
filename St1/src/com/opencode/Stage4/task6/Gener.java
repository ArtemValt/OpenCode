package com.opencode.Stage4.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gener {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7));

    public void generate(int n) {
        for (int i = 10; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                list.add(i);
            }
        }
    }

    public void show() {
        for (int i = 0; i < list.size(); i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(list.get(i) + "\t");
        }
    }
}
