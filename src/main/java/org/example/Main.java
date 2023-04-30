package org.example;

public class Main {
    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();

        // add some toys
        toyManager.addToy(new Toy(1, "Teddy Bear", 10, 30.0));
        toyManager.addToy(new Toy(2, "LEGO Set", 5, 20.0));
        toyManager.addToy(new Toy(3, "Barbie Doll", 7, 25.0));
        toyManager.addToy(new Toy(4, "Hot Wheels Car", 15, 25.0));

        // update weight of one toy
        toyManager.updateToyWeight(1, 40.0);

        // award a toy
        toyManager.awardToy();
    }
}