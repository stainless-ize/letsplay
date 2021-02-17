package ng.gov.oagf;

public class Fruits {

    public int number_of_fruit_types;
    // create constructor

    public Fruits(int number_of_fruits_types) {
        this.number_of_fruit_types = number_of_fruits_types;
    }

    public void mango() {

        System.out.println("You bought mango");

    }

    public void apple() {

        System.out.println("You bought an apple");

    }


    public void orange() {

        System.out.println("You bought orange");

    }


    public static void main(String[] args) {

        //Create object of fruits class (Instantiation)
        Fruits fruitObject = new Fruits(5);
        fruitObject.mango();
    }

}