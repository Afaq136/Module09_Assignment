package org.example;

// ProfessionalGarmentFactory.java
public class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }

    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}

