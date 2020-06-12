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
        triatlon(d1);
        triatlon(c1);
    }


    public static void triatlon(Animal a) {
        int runLength=250;
        int swimLength=8;
        float jumpHeight=0.8f;
        if(a.run(runLength)){
            System.out.println(a.type+" "+a.getName()+" succesfully ran "+runLength+" m");
        } else {
            System.out.println(a.type+" "+a.getName()+" failed to run " +runLength+ " m");
        }
        if(a.jump(jumpHeight)){
            System.out.println(a.type+" "+a.getName()+" succesfully jumped "+jumpHeight+" m");
        } else {
            System.out.println(a.type+" "+a.getName()+" failed to jump " +jumpHeight+ " m");
        }
        if(a.swim(swimLength)){
            System.out.println(a.type+" "+a.getName()+" succesfully swimmed "+swimLength+" m");
        } else {
            System.out.println(a.type+" "+a.getName()+" failed to swim " +swimLength+ " m");
        }
    }
}
