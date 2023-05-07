/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author timarchbold
 */
// Abstract Product interface
interface Shoes {
    String getType();
}

// Concrete Product implementation 1
class CasualShoes implements Shoes {
    public String getType() {
        return "Casual Shoes";
    }
}

// Concrete Product implementation 2
class ProfessionalShoes implements Shoes {
    public String getType() {
        return "Professional Shoes";
    }
}
