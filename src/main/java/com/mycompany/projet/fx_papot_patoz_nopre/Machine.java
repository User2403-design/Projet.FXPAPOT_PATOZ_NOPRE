/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.fx_papot_patoz_nopre;

/**
 *
 * @author Justin
 */
public class Machine extends Equipement {
    
    private float x;
    private float y;
    private float coût;
    private float durée; // pas besoin de durée si ????
    private String etat; // "operationnel", "en arrêt", etc.
    private String type;
    
    public Machine (String refmachine, String dmachine, float x, float y, float cout,String etat, String type){
        super(refmachine,dmachine);
        this.x = x;
        this.y = y;
        this.coût = cout;
        this.etat = etat;
        this.type = type;    
    }
    
    public float duree (Produit p){
            //écrire operation 
            return durée;
    }
    @Override
    public float coutOperation(float dureeOperation){
        return dureeOperation * coût;
    }}