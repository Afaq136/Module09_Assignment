package org.example;

// CasualGarmentFactory.java
public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pant createPant() {
        return new CasualPant();
    }

    @Override
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
