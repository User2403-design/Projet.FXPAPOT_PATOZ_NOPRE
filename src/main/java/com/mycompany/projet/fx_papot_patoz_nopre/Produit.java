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
public class Produit {
    private String codeProduit ;
    private String dProduit;
    private ArrayList<Gamme> listeGamme; // Gamme ou String en para
    
    public Produit(String codeProduit, String dProduit, ArrayList<Gamme> gammeselect ) {
        this.codeProduit = codeProduit;
        this.dProduit = dProduit;
        this.listeGamme = new ArrayList(gammeselect);
    }
    
    // a compléter
    //public boolean LancerFabricationProduit (){
        
    //}
    
    public void afficherProduit(){
        System.out.println("code du produit:"+codeProduit);
        System.out.println("désignation du produit:"+dProduit);
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public String getdProduit() {
        return dProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public void setdProduit(String dProduit) {
        this.dProduit = dProduit;
    }
    
}
