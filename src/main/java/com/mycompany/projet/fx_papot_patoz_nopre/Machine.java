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
    private float duree; // pas besoin de durée si ????
    private String etat; // "operationnel", "en arrêt", etc.
    private String type;
    
    public Machine (String refmachine, String dmachine, float x, float y, float cout, String type){
        super(refmachine,dmachine);
        this.x = x;
        this.y = y;
        this.coût = cout;
        this.etat = "operationnel"; // on crée une machine donc elle forcément ope non? 
        this.type = type;    
    }
    
    public float duree (Produit p){
            //écrire operation 
            return duree;
    }
    @Override
    public float coutOperation(float dureeOperation){
        return dureeOperation * coût;
    }
    @Override
    public void afficherEquipement() { // j'avais mis afficherMachine au début mais marcher pas car faut implement toute les methode de la classe Eq si on peut veut Machine soit pas une classe ab
        System.out.println("Référence Machine: " + refEquipement);
        System.out.println("Désignation: " + dEquipement);
        System.out.println("Type: " + type);
        System.out.println("Coût horaire: " + coût);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Durée d'opération (produit spécifique) : " + duree);// à changé 
    }
    public String getRefmachine(){
        return refEquipement;
    }

    public String getDmachine() {
        return dEquipement;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getCoût() {
        return coût;
    }

    public float getDurée() {
        return duree;
    }

    public String getType() {
        return type;
    }

    public void setRefmachine(String refmachine) {
        this.refEquipement = refmachine;
    }

    public void setDmachine(String dmachine) {
        this.dEquipement = dmachine;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setCoût(float coût) {
        this.coût = coût;
    }

    public void setDurée(float durée) {
        this.duree = durée;
    }

    public void setType(String type) {
        this.type = type;
    }
}
   