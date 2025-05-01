/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;


public class Operateur {
    private String nom;
    private String prenom;
    private String code; // Peut faire partie d'une superclasse "Personne", comme vous voulez
    private int etat; // 0=libre, 1=occupé

    public Operateur(String nom, String prenom, String code, int etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.code = code;
        this.etat = etat;
    }
    
    // faire ajouter et modifer operateur dans l'interface

    public void afficherOperateur() {
        System.out.println("=== Opérateur ===");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Code : " + code);
        System.out.println("État : " + etat);
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCode() {
        return code;
    }

    public int getEtat() {
        return etat;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}