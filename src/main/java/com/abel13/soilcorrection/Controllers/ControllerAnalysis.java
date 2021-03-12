/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abel13.soilcorrection.Controllers;

import com.abel13.soilcorrection.Models.Analysis;
import com.abel13.soilcorrection.Models.CultivationSystem;
import com.abel13.soilcorrection.Models.SoilTexture;
import com.abel13.soilcorrection.Models.TechnicalManager;
import jdk.jshell.spi.ExecutionControl;

/**
 *
 * @author abeldutra
 */
public class ControllerAnalysis {
    private Analysis analysis;
    private TechnicalManager technicalManager;
    private CultivationSystem cultivationSystem;
    
    private SoilTexture soilTexture;
    
    ControllerAnalysis() {
         //Data provided by view
        technicalManager = new TechnicalManager("Pedro Cecere Filho");
        cultivationSystem = new CultivationSystem(1, "Plantio Direto");
        
        analysis = new Analysis(technicalManager, cultivationSystem, 20, 761, 8.59, 
                0.15, 5.76, 1.63, 3.67, 0, 5.35);
        
        soilTexture = new SoilTexture(1, "Argiloso", "+40% de argila");
    }
    
    public double getIdealPhosphor() {
        switch(soilTexture.getKind()){
            case 1:
                return 9.0;
            case 2:
                return 12.0;
            default:
                return 0;
        }
    }
    
    public double getIdealPotassium() {
        //=SE(C6=1;"0,35";SE(C6=2;"0,25";""))
        switch(soilTexture.getKind()){
            case 1:
                return 0.35;
            case 2:
                return 0.25;
            default:
                return 0;
        }
    }
    
    public double getIdealCalcium() {
        //=SE(C6=1;"6,0";SE(C6=2;"4,0";""))
        switch(soilTexture.getKind()){
            case 1:
                return 6.0;
            case 2:
                return 4.0;
            default:
                return 0;
        }
    }
    
    public double getIdealMagnesium() {
        //=SE(C6=1;"1,5";SE(C6=2;"1,0";""))
        switch(soilTexture.getKind()){
            case 1:
                return 1.5;
            case 2:
                return 1.0;
            default:
                return 0;
        }
    }
    
    public double getIdealSulfur() {
        //=SE(C6=1;"9,0";SE(C6=2;"6,0";""))
        switch(soilTexture.getKind()){
            case 1:
                return 9.0;
            case 2:
                return 6.0;
            default:
                return 0;
        }
    }
    
    public double getIdealAluminum() {
        return 0;
    }
    
    public double getIdealPotentialAcidity() {
        return 0;
    }
    
}
