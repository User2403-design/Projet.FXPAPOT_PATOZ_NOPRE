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

public class GestionMagasins {
    private List<Magasindebrut> magasins;

    public GestionMagasins() {
        this.magasins = new ArrayList<>();
    }

    public void ajouter(Magasindebrut magasin) {
        magasins.add(magasin);
    }

    public void afficherToutes() {
        if (magasins.isEmpty()) {
            System.out.println("Aucun magasin enregistré.");
        } else {
            for (Magasindebrut m : magasins) {
                System.out.println(m); // ou m.afficherMagasin() si tu préfères une méthode dédiée
            }
        }
    }

    public List<Magasindebrut> getTous() {
        return magasins;
    }
}
