/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author chloe
 */
public class Operateur {
    private String nom;
    private String prenom;
    private String code;// peut aussi faire super classe personne pour regrouper mes 3 attributs
    private ArrayList<String> competence; 
    private boolean etat;
    
    public Operateur (String nom,String prenom, String code, ArrayList<String> competence, boolean etat){
        this.nom = nom;
        this.prenom = prenom;
        this.code = code;
        this.competence = competence;
        this.etat = etat;
    }
    
    public void afficherOperateur(){
        System.out.println("nom"+nom);
        System.out.println("prénom"+prenom);
        System.out.println("code"+code);
        System.out.println("liste des compétences"+ competence);
        System.out.println("état"+etat);
    }
    
    //nécessaire ?
    //public boolean peutUtiliser(String typeMachine) {
    //    return competences.contains(typeMachine);
    //}
    
    public ArrayList<String> getCompetence() {
        return competence;
    }

    public boolean getEtat() {
        return etat;
    }

    public void setCompetence(ArrayList<String> competence) {
        this.competence = competence;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}

