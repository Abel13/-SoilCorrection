/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abel13.soilcorrection.Models;

/**
 *
 * @author abeldutra
 */
public class TechnicalManager {
    private String name;
    
    public String getName(){
        return name;
    }
        
    public TechnicalManager(String name) {
        this.name = name;
    }
}
