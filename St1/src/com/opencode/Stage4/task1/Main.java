package com.opencode.Stage4.task1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Введите число N: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] array = new int[n][n];
            int minR = 0,maxR = n - 1, minC = 0, maxC = n - 1;
            int count = 1;
            boolean breakFlag = false;
            boolean secondCircle = false;
            while (!breakFlag) {
                if (secondCircle) {
                    maxC--;
                }

                for (int i = minC; i <= maxC; i++) {
                    array[minR][i] = count;
                    count++;
                }
                minR++;
                if (secondCircle) {
                    maxR--;
                }

                for (int i = minR; i <= maxR; i++) {
                    array[i][maxC] = count;
                    count++;
                }
                maxC--;
                if (secondCircle) {
                    minC++;
                }

                for (int i = maxC; i >= minC; i--) {
                    array[maxR][i] = count;
                    count++;
                }
                maxR--;
                minR++;

                for (int i = maxR; i >= minR; i--) {
                    array[i][minC] = count;
                    count++;
                }
                minC++;

                secondCircle = true;
                if (maxC < 0 || maxR < 0) {
                    breakFlag = true;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d ", array[i][j]);
                }
                System.out.println("");
            }
        }
    }
