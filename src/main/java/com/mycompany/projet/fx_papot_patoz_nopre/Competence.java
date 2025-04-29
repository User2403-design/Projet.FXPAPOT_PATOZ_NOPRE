/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.fx_papot_patoz_nopre;

import java.util.ArrayList;

/**
 *
 * @author chloe
 */
public class Competence extends Operateur  {
    
private int niveauExpertise ;
private int dateAffectation;
    
    public int getNiveauExpertise() {
        return niveauExpertise;
    }

    public void setNiveauExpertise(int niveauExpertise) {
        this.niveauExpertise = niveauExpertise;
    }

    public int getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(int dateAffectation) {
        this.dateAffectation = dateAffectation;
    }
    
   

    public Competence(String nom, String prenom, String code, ArrayList<String> competence, boolean etat) {
        super(nom, prenom, code, competence, etat);
    }
    
}
