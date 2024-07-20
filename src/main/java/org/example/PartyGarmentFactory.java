package org.example;

// PartyGarmentFactory.java
public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pant createPant() {
        return new PartyPant();
    }

    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
