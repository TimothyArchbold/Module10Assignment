/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author timarchbold
 */
// Abstract Factory interface
interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}

// Concrete Factory implementation 1
class CasualGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new CasualTop();
    }

    public Pants createPants() {
        return new CasualPants();
    }

    public Shoes createShoes() {
        return new CasualShoes();
    }
}

// Concrete Factory implementation 2
class ProfessionalGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new ProfessionalTop();
    }

    public Pants createPants() {
        return new ProfessionalPants();
    }

    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
