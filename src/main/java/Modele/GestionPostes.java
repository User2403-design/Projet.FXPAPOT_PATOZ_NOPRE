/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author chloe
 */
import java.util.ArrayList;
import java.util.List;

public class GestionPostes {
    private List<Poste> postes;

    public GestionPostes() {
        this.postes = new ArrayList<>();
    }

    public void ajouter(Poste poste) {
        postes.add(poste);
    }

    public void afficherToutes() {
        if (postes.isEmpty()) {
            System.out.println("Aucun poste enregistré.");
        } else {
            for (Poste p : postes) {
                System.out.println(p); // ou p.afficherPoste() si tu veux une méthode personnalisée
            }
        }
    }

    public List<Poste> getTous() {
        return postes;
    }
}
