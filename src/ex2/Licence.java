/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Maxime BLAISE
 */
public class Licence extends Etudiant {
    
    /**
     * Parcours de l'étudiant en licence.
     */
    private String parcours;

    /**
     * Construit un étudiant en licence.
     * 
     * @param nom Nom de l'étudiant en licence
     * @param adresse Adresse de l'étudiant en licence
     * @param numero Numéro de l'étudiant en licence
     * @param parcours Son parcours.
     */
    public Licence(String nom, String adresse, int numero, String parcours) {
        super(nom, adresse, numero);
        this.parcours = parcours;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEtudiant en Licence\nParcours : "+parcours;
    }

    public String getParcours() {
        return parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }
    
    
    
    
}
