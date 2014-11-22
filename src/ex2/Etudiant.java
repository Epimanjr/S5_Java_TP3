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
public class Etudiant {

    /**
     * Nom de l'étudiant.
     */
    private String nom;

    /**
     * Adresse de l'étudiant.
     */
    private String adresse;

    /**
     * Numéro de l'étudiant.
     */
    private int numero;

    /**
     * Construit un étudiant en fonction de son nom, son adresse et son numéro
     *
     * @param nom Nom de l'étudiant
     * @param adresse Adresse de l'étudiant
     * @param numero Numéro de l'étudiant
     */
    public Etudiant(String nom, String adresse, int numero) {
        this.nom = nom;
        this.adresse = adresse;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return ("Etudiant numéro " + numero + "\nNom : " + nom + "\nAdresse : " + adresse);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        return this.numero == other.numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.numero;
        return hash;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
