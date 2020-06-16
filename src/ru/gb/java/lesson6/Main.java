/*
1. Создать 2 текстовых файла 50-100 символов в каждом;
2. Написать программу, "склеивающую"  эти файлы, т.е. вначале идёт текст из первого файла, потом текст из второго;
3.* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (только латиница);
4.** Написать метод, проверяющий, есть ли указанное слово в папке (требуется почитать реализацию класса File).
 */

package ru.gb.java.lesson6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String file1 = "c:/repo/javalearn/src/ru/gb/java/lesson6/1.txt";
        String file2 = "c:/repo/javalearn/src/ru/gb/java/lesson6/2.txt";
        String clued = "clued";
        clued =clued + concatenation(file1);
        clued =clued + concatenation(file2);

        System.out.println(clued);


    }
    public static String concatenation(String file) {
        StringBuilder r = new StringBuilder();
        try {

            FileInputStream fis = new FileInputStream(file);
            int b;
            while ((b=fis.read())!=-1) {

                r.append((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return r.toString();
    }
}




