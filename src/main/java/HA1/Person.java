package HA;

public class Person {

    String fullName;
    int age;

    public void move(){
        System.out.println(fullName + " идёт");
    }
    public void talk(){
        System.out.println(fullName + " говорит");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
