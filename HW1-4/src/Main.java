/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
2. Конструктор класса должен заполнять эти поля при создании объекта;
3. Внутри класса "Сотрудник" написать методы, которые возвращают значение каждого поля;
4. Вывести при помощи методов из пункта 3 ФИО и должность;
5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только
 о сотрудниках старше 40 лет;
6.* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
7.* Вывести средние арифметические возраст и зарплаты;
8.*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
 присваивался личный уникальный идентификационный порядковый номер.
*/

public class Main {
    final static int WISE_AGE = 45;
    final static int ADDITION = 5000;
    public static void main(String[] args) {
        System.out.println("HomeWork3");
        Employee Tom = new Employee("Tom Crouse", "Runner", "Iphone", 500000, 48);
        System.out.println("Meet with " + Tom.getName() + ", our new " + Tom.getPosition() + "!");
        Employee Mark = new Employee("Mark Strong", "Sorter", "Nokia", 150000, 52);
        Employee Anna = new Employee("Anna Romanova", "Imperor", "Loud Voice", 1000000, 25);
        Employee Sasha = new Employee("Alexandra Grey", "Actress", "Pink", 100000, 33);
        Employee Saddam = new Employee("Saddam Huseyn", "Dictator", "TAP-57", 700000, 66);
        Employee[] office = new Employee[]{Tom, Mark, Anna, Sasha, Saddam};
        for (int i = 0; i < office.length; i++) {
            if (office[i].getAge() > 40) {
                System.out.println(office[i].getName() + " is older than 40");
            }
        }
        raiseSalary(office);
        System.out.println("Mean age in our company "+meanAge(office));
        System.out.println("Mean salary in our company "+meanSalary(office));
    }
//6.* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
    public static void raiseSalary(Employee[] arr) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getAge()>WISE_AGE) {
                System.out.println(arr[i].getName()+" before "+WISE_AGE+" had salary "+arr[i].getSalary());
                arr[i].setSalary(arr[i].getSalary()+ADDITION);
                System.out.println("Now salary for "+arr[i].getName()+" equals "+arr[i].getSalary());
            }
        }
    }
//7.* Вывести средние арифметические возраст и зарплаты;
    public static int meanAge(Employee[] arr) {
        int summAge=0;
        for (int i=0;i<arr.length;i++) {
            summAge+=arr[i].getAge();
        }
        return summAge/arr.length;
    }
    public static int meanSalary(Employee[] arr) {
        int summSalary=0;
        for (int i=0;i<arr.length;i++) {
            summSalary+=arr[i].getSalary();
        }
        return summSalary/arr.length;
    }

}
