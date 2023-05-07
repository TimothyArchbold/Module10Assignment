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
interface Top {
    String getType();
}

// Concrete Product implementation 1
class CasualTop implements Top {
    public String getType() {
        return "Casual Top";
    }
}

// Concrete Product implementation 2
class ProfessionalTop implements Top {
    public String getType() {
        return "Professional Top";
    }
}
