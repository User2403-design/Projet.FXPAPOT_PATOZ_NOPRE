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
public class Gamme {
    private String refGamme;
    private ArrayList<Operation> operations;
    private ArrayList<Equipement> equipements;
    
    public Gamme (String refGamme, ArrayList<Operation> operations, ArrayList<Equipement> equipements ){
        this.refGamme = refGamme;
        this.operations = operations;
        this.equipements = equipements;        
    }
    // le constructeur et créeGamme font la mm chose donc on fait qd mm créeGamme ?
    
  
    //jsp laquel des deux est la mieux 
    public void modifierGamme (ArrayList<Operation> operations, ArrayList<Equipement> equipements ){
        this.operations = operations;
        this.equipements = equipements;
        // peut être améliorer car la on change tout mais avec index on pourrait changer qu'ne opé/eq dans la liste
    
    } 

    public void modifierGamme(String refOperation, float nouvelleDuree, Equipement nouvelEquipement) {// on met objet de type opération direct car si on veux juste changer la durée ou l'équipement c'est plus simple
    boolean trouve = false; // pour caractèriser le fait qu'on trouve ou non une opération correspondante à la ref entrée 

    for (Operation op : operations) {
        if (op.getRefOperation().equals(refOperation)) {
            op.setDureeOperation(nouvelleDuree);
            op.setRefEquipement(nouvelEquipement);

            //mis à jour de la liste des equipements si besoin
            if (!equipements.contains(nouvelEquipement)) {
                equipements.add(nouvelEquipement);
            }

            trouve = true;// si on trouve une ope qui correspond à la ref trouve=true donc c'est ok on sort de la boucle 
            System.out.println("Opération modifiée avec succès.");
            break;
        }
    }

    if (!trouve) { // sinon trouve reste false donc on affiche un message d'erreur
        System.out.println("Aucune opération trouvée avec la référence : " + refOperation);
    }
}
    
    public void supprimerGamme(){
        this.refGamme = null;
        this.operations.clear(); // clear = methode qui vide une liste en gardant sa ref (pas besoin de crée nouvelle instance : this.ope = list vide)
        this.equipements.clear();
        // pareil peut supp q'une seul ope si besoin avec index : le faire dans modifier ! 
    }
    public void afficherGamme (){
        System.out.println ("Référence de la Gamme :"+refGamme);
        for (Equipement e : equipements){
            e.afficherEquipement(); //meth de la classe abs Equipement
        }
    }    
    public float coutGamme(){    
        float coutTotal = 0;
        for (Operation op : operations){ //je crois erreur car getRef est un string or coutope se fait sur un type Eq : effectivement
            coutTotal += op.getRefEquipement().coutOperation(op.getDureeOperation());//pr avoir le cout d'une gamme = pls opération on additionne le cout de chaque opé et ce cout est calculé par rapport à la machine(equipement) utilisé dans l'opé donc on recup cet attribut et on lui calcule son cout avec le meth def dans Machine qui prend en para la durée de l'op
        }        
        return coutTotal;         
    }
    
    public float dureeGamme() {
        float dureeTotal = 0;
        for (Operation opr : operations) {
            dureeTotal += opr.getDureeOperation(); // pour chaque opé on récup sa durée (attribut de opé) mais comme privé on utilie get
        }
        return dureeTotal;
    }
    public String getRefGamme() {
        return refGamme;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public ArrayList<Equipement> getEquipements() {
        return equipements;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public void setEquipements(ArrayList<Equipement> equipements) {
        this.equipements = equipements;
    }
    
    
    
}

