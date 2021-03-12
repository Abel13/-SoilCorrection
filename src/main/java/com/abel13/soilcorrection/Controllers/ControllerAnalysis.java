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

/**
 *
 * @author abeldutra
 */
public class ControllerAnalysis {
    Analysis analysis;
    TechnicalManager technicalManager;
    CultivationSystem cultivationSystem;
    
    SoilTexture soilTexture;
    
    ControllerAnalysis() {
         //Data provided by view
        technicalManager = new TechnicalManager("Pedro Cecere Filho");
        cultivationSystem = new CultivationSystem(1, "Plantio Direto");
        
        analysis = new Analysis(technicalManager, cultivationSystem, 20, 761, 8.59, 
                0.15, 5.76, 1.63, 3.67, 0, 5.35);
        
        soilTexture = new SoilTexture(1, "Argiloso", "+40% de argila");
    }
    
    private double CalulateIdealPhosphor() {
        switch(soilTexture.getKind()){
            case 1:
                return 9.0;
            case 2:
                return 12.0;
            default:
                return 0;
        }
    }
}
