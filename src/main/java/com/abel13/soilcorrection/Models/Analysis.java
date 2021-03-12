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
public class Analysis {
    private TechnicalManager technicalManager;
    private CultivationSystem cultivationSystem;
    private int sampleDepthCm;
    private int resultNumber;
    
    private double phosphor;
    private double potassium;
    private double calcium;
    private double magnesium;
    private double sulfur;
    private double aluminum;
    private double potentialAcidity;
    
    public String getManagerName(){
        return technicalManager.getName();
    }
    
    public String getCultivationDescription() {
        return cultivationSystem.getDescription();
    }
    
    public Analysis(TechnicalManager technicalManager, CultivationSystem cultivationSystem, int sampleDepthCm, int resultNumber, double phosphor, double potassium, double calcium, double magnesium, double sulfur, double aluminum, double potentialAcidity) {
        this.technicalManager = technicalManager;
        this.cultivationSystem = cultivationSystem;
        this.sampleDepthCm = sampleDepthCm;
        this.resultNumber = resultNumber;
        this.phosphor = phosphor;
        this.potassium = potassium;
        this.calcium = calcium;
        this.magnesium = magnesium;
        this.sulfur = sulfur;
        this.aluminum = aluminum;
        this.potentialAcidity = potentialAcidity;
    }
}
