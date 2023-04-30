package org.example;

public class Main {
    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();

        toyManager.addToy(new Toy(1, "Teddy Bear", 10, 30.0));
        toyManager.addToy(new Toy(2, "LEGO Set", 5, 20.0));
        toyManager.addToy(new Toy(3, "Barbie Doll", 7, 25.0));
        toyManager.addToy(new Toy(4, "Hot Wheels Car", 15, 25.0));

        toyManager.updateToyWeight(1, 40.0);

        toyManager.awardToy();
    }
}