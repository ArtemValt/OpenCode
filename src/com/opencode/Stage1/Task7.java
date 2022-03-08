package com.opencode.Stage1;

public class Task7 {
        public void task7(int n) {
            String word = "бутылок";

            while (n > 0) {

                System.out.println(n + " " + word + " стояло на столе,одна из них упала и рабилась");
                n--;

                if ((n % 10) > 1 && (n % 10) < 5) {
                    word = "бутылки";
                }

                if ((n % 10) == 1) {
                    word = "бутылка";
                }

                if (((n % 10) >= 5) || ((n % 10) == 0) || (n > 10 && n < 20)) {
                    word = "бутылок";
                }

                if (n == 0) {
                    System.out.println("Не осталось бутылок");
                }
            }
        }
    }