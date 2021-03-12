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
public class CultivationSystem {
    private int kind;
    private String description;

    public int getKind(){
        return kind;
    }
    
    public String getDescription(){
        return description;
    }
    
    public CultivationSystem(int kind, String description){
        this.kind = kind;
        this.description = description;
    }
}
