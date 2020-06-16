/*
1. Создать 2 текстовых файла 50-100 символов в каждом;
2. Написать программу, "склеивающую"  эти файлы, т.е. вначале идёт текст из первого файла, потом текст из второго;
3.* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (только латиница);
4.** Написать метод, проверяющий, есть ли указанное слово в папке (требуется почитать реализацию класса File).
 */

package ru.gb.java.lesson6;


import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String file1 = "c:/repo/javalearn/src/ru/gb/java/lesson6/1.txt";
        String file2 = "c:/repo/javalearn/src/ru/gb/java/lesson6/2.txt";
        String clued = "clued";
        String toFind = "cat";
        clued =clued + concatenation(file1);
        clued =clued + concatenation(file2);

        System.out.println(clued);
        if (search(file1,toFind)) {
            System.out.printf("in file %s finded string %s \n", file1, toFind);
        } else {
            System.out.printf("in file %s string %s was not found \n", file1, toFind);
        }
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

    public static boolean search(String file, String toFind) {
        char[] letters=new char[toFind.length()];
        boolean flag = false;
        int finded=0;
        for(int i=0;i<toFind.length();i++) {
            letters[i]=toFind.charAt(i);
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            int b;
            while((b=fis.read())!=-1) {
                if (((char)b == letters[0]) && (flag==false)) {
                    flag=true;
                    finded++;
                    continue;
                } else if (flag == true && (char)b == letters[finded]) {

                    if ((finded+1)==toFind.length()) {
                        return true;
                    }
                    finded++;
                } else {
                    flag=false;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}




