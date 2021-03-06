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



public abstract class Animal {
    protected String type;
    protected String name;
    private int runMax;
    private int swimMax;
    private float jumpMax;


    Animal(String type, String name, int runMax, int swimMax, float jumpMax) {
        this.type = type;
        this.name = name;
        this.runMax = (int)(runMax*0.8+(Math.random()*runMax*0.4));
        this.swimMax = (int)(swimMax*0.8+(Math.random()*swimMax*0.4));
        this.jumpMax =(float)(jumpMax*0.8+(Math.random()*jumpMax*0.4));
    }

    public String getName() {
        return name;
    }

    public int getRunMax() {return runMax;}
    public int getSwimMax() {return swimMax;}
    public float getJumpMax() {return jumpMax;}

    public boolean run(int runLength) {
        if (runLength<=runMax) {
            return true;
        } else {
            return false;
        }
    }


    public boolean swim(int swimLength) {
        if (swimLength<=swimMax) {
            return true;
        } else {
            return false;
        }
    }


    public boolean jump(float jumpHeight) {
        if (jumpHeight<=jumpMax) {
            return true;
        } else {
            return false;
        }
    }


}
