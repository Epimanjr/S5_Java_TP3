/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Maxime BLAISE
 */
public class Principale {
    
    /**
     * Méthode principale 
     * @param args les arguments
     */
    public static void main(String[] args) {
        // Création d'une liste d'étudiant
        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        
        // Ajout des valeurs
        listeEtudiants.add(new Licence("Maxime BLAISE", "28 rue Aristide Briand", 28, "MIAGE"));
        listeEtudiants.add(new Master("PrenomMaster NomMaster", "29 rue Aristide Briand", 55, "ACSI"));
        listeEtudiants.add(new Licence("Antoine NOSAL", "64 rue du Cardinal Mathieu", 1, "MIAGE"));
        
        // Triage
        Collections.sort(listeEtudiants, (Object o, Object o1) -> {
            Etudiant l1 =  (Etudiant) o;
            Etudiant l2 =  (Etudiant) o1;
            
            if(l1.getNumero() < l2.getNumero()) {
                return -1;
            } else if(l1.getNumero() == l2.getNumero()) {
                return 0;
            } else {
                return 1;
            }
        });
        
        // Affichage
        for(Iterator i = listeEtudiants.iterator() ; i.hasNext() ;) {
            System.out.println(i.next() + "\n");
        }
    }
    
}
