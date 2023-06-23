package HA;

public class Phone {
    String number;
    String model;
    int weight;


    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }
    public String receiveCall(String name){
        String resultName = "Звонит " + name;
        System.out.println(resultName);
        return resultName;
    }
    public String getNumber(){
        System.out.println(number);
        return number;
    }
}
