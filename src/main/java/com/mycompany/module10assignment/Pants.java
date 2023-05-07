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
interface Pants {
    String getType();
}

// Concrete Product implementation 1
class CasualPants implements Pants {
    public String getType() {
        return "Casual Pants";
    }
}

// Concrete Product implementation 2
class ProfessionalPants implements Pants {
    public String getType() {
        return "Professional Pants";
    }
}
