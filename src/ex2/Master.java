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
public class Master extends Etudiant {
    
    /**
     * Spécialité de l'étudiant en Master.
     */
    private String specialite;

    /**
     * Construit un étudiant en Master.
     * 
     * @param nom Nom de l'étudiant en Master
     * @param adresse Adresse de l'étudiant en Master
     * @param numero Numéro de l'étudiant en Master
     * @param specialite Spécialité de l'étudiant en Master
     */
    public Master(String nom, String adresse, int numero, String specialite) {
        super(nom, adresse, numero);
        this.specialite = specialite;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEtudiant en MIAGE\nSpécialité : " + specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
}
