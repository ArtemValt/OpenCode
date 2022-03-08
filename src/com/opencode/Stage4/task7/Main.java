package com.opencode.Stage4.task7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            System.out.println("Введите текст");
            List<String> tekst = new ArrayList<>();
            char[] ch = {'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'};
            char[] gch = {'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё'};
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            try (FileWriter writer = new FileWriter("Task7.txt", false)) {
                writer.write(text);
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileReader reader = new FileReader("Task7.txt");
                try {
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print((char) c);
                        tekst.add((char) c + "");
                    }
                    System.out.println();

                } finally {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Файл пустой!");
            }
            Sentence sentence = new Sentence(text);
            List<String> Vowels = new ArrayList<>();
            Taskfo7 vow = (sentence1) -> {
                String txt = sentence.getOriginalSentence();
                for (String buff : txt.trim().split(" ")) {
                    for (int i = 0; i < gch.length; i++) {
                        char c = buff.toLowerCase().charAt(0);
                        if (c == gch[i]) {
                            Vowels.add(buff.charAt(0) + "");
                        }
                    }
                }
                System.out.println("Количество гласных =\t"+Vowels.size());
            };
            List<String> consonants = new ArrayList<>();
            Taskfo7 cons = (sentence1) -> {
                String txt = sentence.getOriginalSentence();
                for (String buff : txt.trim().split(" ")) {
                    for (int i = 0; i < ch.length; i++) {
                        char c = buff.toUpperCase().charAt(0);
                        if ((c==ch[i]))
                            consonants.add(buff.charAt(0) + "");
                    }
                }
                System.out.println("Количество cогласных =\t"+consonants.size());
            };
            Taskfo7 allT = (sentence1) -> {
                int i=Vowels.size()+ consonants.size();
                System.out.println("Общее количество слов =\t" + i);
            };
            vow.task(sentence);
            cons.task(sentence);
            allT.task(sentence);
            OnTxt start = () -> {
                int i = Vowels.size()+ consonants.size();
                FileWriter writer = new FileWriter("Task7res.txt", false);
                writer.write(("Количество cогласных =\t"+consonants.size()));
                writer.write("\n");
                writer.write("Количество гласных =\t"+Vowels.size());
                writer.write("\n");
                writer.write( "Общее количество слов =\t" + i );
                writer.flush();
                writer.close();
            };
            start.txt();
        }
    }