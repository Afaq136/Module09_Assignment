package org.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        clientCode(new ProfessionalGarmentFactory());
        clientCode(new CasualGarmentFactory());
        clientCode(new PartyGarmentFactory());
    }

    public static void clientCode(GarmentFactory factory) {
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        System.out.println(top.display() + ", " + pant.display() + ", " + shoe.display());
    }
}
