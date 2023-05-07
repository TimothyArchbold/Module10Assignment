/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.module10assignment;

/**
 *
 * @author timarchbold
 */
public class Module10Assignment {

    public static void main(String[] args) {
        GarmentFactory factory1 = new CasualGarmentFactory();
        Client client1 = new Client(factory1);
        client1.printGarment();

        GarmentFactory factory2 = new ProfessionalGarmentFactory();
        Client client2 = new Client(factory2);
        client2.printGarment();
    }
}
