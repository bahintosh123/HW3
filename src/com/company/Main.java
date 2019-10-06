package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Maksat";
        names[2] = "Ivan";

        for (int c = 0; c <= 2; c++)

            switch (c){

                case 0:
                    System.out.println(names[c] + " Доброе утро");
                    break;
                case 1:
                    System.out.println(names[c] + " Добрый день");
                    break;
                case 2:
                    System.out.println(names[c] + " Добрый вечер");
                    break;

            }
    }}
