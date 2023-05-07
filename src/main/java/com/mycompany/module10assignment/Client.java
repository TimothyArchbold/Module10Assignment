/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author timarchbold
 */
// Client code
public class Client {
    private GarmentFactory factory;
    private Top top;
    private Pants pants;
    private Shoes shoes;

    public Client(GarmentFactory factory) {
        this.factory = factory;
        this.top = factory.createTop();
        this.pants = factory.createPants();
        this.shoes = factory.createShoes();
    }

    public void printGarment() {
        System.out.println("Garment: " + top.getType() + ", " + pants.getType() + ", " + shoes.getType());
    }
}
