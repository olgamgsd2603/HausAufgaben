package HA;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Alex",35);

        System.out.println(person);
        System.out.println(person1.fullName +" "+ person1.age);

        person.move();
        person1.talk();
    }

}
