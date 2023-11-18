package by.academy.HomeWork;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int number ;
    public Student() {
        super();
    }
    public Student(String name, String surname, int age, int number) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", age=" + age +
                ", number=" + number + '\'' +
                '}';
    }
}





