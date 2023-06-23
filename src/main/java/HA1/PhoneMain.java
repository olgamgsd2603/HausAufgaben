package HA;

public class PhoneMain {
    public static void main(String[] args) {


        Phone phone1 = new Phone("+49123567839", "Ipfone", 100);
        Phone phone2 = new Phone("+49145678912", "Sony", 150);
        Phone phone3 = new Phone("+49987456123", "Samsung", 100);
        Phone name = new Phone();

        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        name.receiveCall("Fin");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();


    }


}
