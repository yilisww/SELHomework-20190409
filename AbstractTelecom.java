package HW3_OOP_Homework;

public abstract class AbstractTelecom {

    public String [] phoneBrand1 = {"iphone", "Motorola", "Sumsung", "Huawei"};

    public String [] callingSystem = {"Cisco", "Skype", "IBM", "Huawei"};

    public void phonebrand1() {
        System.out.println("We will chose the "+phoneBrand1 [0]+" for this calling");

    }

    public void callingsystem() {
        System.out.println("We will chose the "+ callingSystem [1]+ "calling system for this telecommunication");

    }

}
