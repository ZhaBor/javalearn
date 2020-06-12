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

public class Cat extends Animal {

        private int runMax;
        private float jumpMax;
        private String name;
        private int swimMax;
        Cat(String name) {
            super("Cat",name,200,0,2.0f);
                this.name=name;
                this.runMax=super.getRunMax();
                this.swimMax=super.getSwimMax();
                this.jumpMax=super.getJumpMax();
                    System.out.printf("New cat %s ready to run (%d m) and jump (%.2f m) \n",
                    this.name,
                    this.runMax,
                    this.jumpMax);
        }

       // @Override
       // public boolean swim(int swimLength) {
       //         return false;
       // }
}

