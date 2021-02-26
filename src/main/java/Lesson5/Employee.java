package Lesson5;

public class Employee {
    public String name;
    public String post;
    public String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public Employee (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee (String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printInfo() {
        System.out.println(this);
    }

    public String toString() {return "ФИО: " + name + " Должность: " + post + " Почта: " + email + " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age; }
}
