package com.opencode.Stage4.task2;

import java.util.Arrays;

public class Word {
    private char[] word;

    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    public int getSymbolCount() {
        return word.length;
    }

    public Word(String word){
        if(word == null || "".equals(word.trim())) {
            throw new IllegalArgumentException("Пустое слово");
        }
        this.word = word.toCharArray();    }


    public String getOriginalWord() {
        String wordString = new String(word);
        return wordString;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word=" + Arrays.toString(word) +
                '}';
    }
}