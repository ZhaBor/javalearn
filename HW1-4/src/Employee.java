/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
2. Конструктор класса должен заполнять эти поля при создании объекта;
3. Внутри класса "Сотрудник" написать методы, которые возвращают значение каждого поля;
4. Вывести при помощи методов из пункта 3 ФИО и должность;
5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только
 о сотрудниках старше 40 лет;
6.* Создать метолд, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
7.* Вывести средние арифметические возраст и зарплаты;
8.*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
 присваивался личный уникальный идентификационный порядковый номер.
*/
public class Employee {
    private static int numberTotal;
    private int number;
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int birthYear;
    private static final int CURRENT_YEAR = 2020;

    Employee (String name, String position, String phone, int salary, int age){
        this.number=++numberTotal;
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = CURRENT_YEAR-age;
        System.out.printf(
                "New Employee number %d %s on position %s with phone %s and salary %d was born in %d\n",
                this.number,
                this.getName(),
                this.getPosition(),
                this.getPhone(),
                this.getSalary(),
                this.birthYear);
    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String getPhone(){
        return phone;
    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge(){
        return CURRENT_YEAR-birthYear;
    }

}
