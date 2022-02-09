package Lessons_3;


public class Person {

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Petrenko Olha Ivanovna", "teacher", "petrenko@mail.com", "80985551012", 3000, 47);
        emp[1] = new Employee("Ivanov Ivan Ivanovich", "architect", "ivanov898@mail.com", "80931226396", 12000, 42);
        emp[2] = new Employee("Kuzmenko Boris Petrivich", "barber", "kuzmich@mail.com", "80981557894", 7000, 29);
        emp[3] = new Employee("Tonenko Yuliia Ivanovna", "astronavt", "tonenkoyuliia@mail.com", "80984561236", 25700, 41);
        emp[4] = new Employee("Shevchenko Taras Bogdanovich", "postman", "shevaukr@mail.com", "80964789523", 1200, 67);
        for (Employee employee : emp)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}

class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        return ("FIO: " + name + " Position:" + position + " E-mail:" + email + " Phone:" + phone + " Salary:" + salary + " Age:" + age);
    }
    }
