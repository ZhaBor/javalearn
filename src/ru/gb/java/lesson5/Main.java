/*
1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное;
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В
   качестве параметра каждому методу передается величина, означающая или длину
   препятствия (для бега и плавания) или высоту (для прыжков);
3. У каждого животного есть ограничения на действия (бег: кот 200 м, собака 500 м,
   лошадь 1500 м, птица 5 м; прыжок: кот 2 м, собака 0,5 м, лошадь 3 м, птица 0,2 м;
   плавание: кот и птица не умеют плавать, собака 10 м, лошадь 100 м);
4. При попытке животного выполнить одно из этих действий оно должно сообщить результат
   (например dog1.run(150); результат "Собака пробежала");
5. ** Добавить животным разброс в ограничениях. Т.е. у одной собаки ограничение на бег может
   быть 400 м, у другой 600 м.
 */

package ru.gb.java.lesson5;

public class Main {
    public static void main(String [] args) {
        System.out.println("Homework 1 - 5");
        Dog d1 = new Dog(
                "Sharik",
                500,
                10,
                0.5f);
        Cat c1 = new Cat(
                "Barsik",
                200,
                0,
                2.0f);
        Animal[] animals={d1,c1};
        triatlon(animals);

    }


    public static void triatlon(Animal[] arr) {
        for (int i=0;i<arr.length;i++) {
            int runLength = 250;
            int swimLength = 8;
            float jumpHeight = 0.8f;
            if (arr[i].run(runLength)) {
                System.out.println(arr[i].type + " " + arr[i].getName() + " succesfully ran " + runLength + " m");
            } else {
                System.out.println(arr[i].type + " " + arr[i].getName() + " failed to run " + runLength + " m");
            }
            if (arr[i].jump(jumpHeight)) {
                System.out.println(arr[i].type + " " + arr[i].getName() + " succesfully jumped " + jumpHeight + " m");
            } else {
                System.out.println(arr[i].type + " " + arr[i].getName() + " failed to jump " + jumpHeight + " m");
            }
            if (arr[i].swim(swimLength)) {
                System.out.println(arr[i].type + " " + arr[i].getName() + " succesfully swimmed " + swimLength + " m");
            } else {
                System.out.println(arr[i].type + " " + arr[i].getName() + " failed to swim " + swimLength + " m");
            }
        }
    }
}
