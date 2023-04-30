package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyManager {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public Toy chooseToy() {
        Random random = new Random();
        double totalWeight = 0.0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        double randomWeight = random.nextDouble() * totalWeight;
        double currentWeight = 0.0;
        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (currentWeight >= randomWeight) {
                return toy;
            }
        }
        return null;
    }

    public void awardToy() {
        Toy toy = chooseToy();
        if (toy == null || toy.getQuantity() == 0) {
            System.out.println("No toys available to award.");
            return;
        }
        toy.setQuantity(toy.getQuantity() - 1);
        toys.remove(toy);
        try {
            FileWriter writer = new FileWriter("awarded_toys.txt", true);
            writer.write(toy.getName() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
