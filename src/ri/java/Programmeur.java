/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ri.java;

/**
 *
 * @author Jacques
 */
public class Programmeur extends Personne {


    float salaire;
    float prime;
    String pseudo;

    float getSalaire() {
        return (this.salaire + this.prime);
    }

    void afficher() {
        System.out.println("Salaire : " + this.salaire + "\n"
                            + "Prime : " + this.prime + "\n"
                            + "Pseudo : " + this.pseudo + "\n"
                            + "Nom : " + super.nom);
    }

    public Programmeur(float salaire, float prime, String pseudo, String nom, String prenom, int anNaissance) {
        super(nom, prenom, anNaissance);
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = pseudo;
    }



    public Programmeur(float salaire, float prime) {
        this.salaire = salaire;
        this.prime = prime;
    }

    public Programmeur(float salaire, float prime, String pseudo) {
        this.salaire = salaire;
        this.prime = prime;
        this.pseudo = pseudo;
    }

    public Programmeur() {
    }


    

    public void actualiserPrime(float prime) {
        this.prime = prime;
    }

    
    
    @Override
    public String toString() {
        String affichage = "Salaire : " + this.salaire + "\n"
                            + "Prime : " + this.prime + "\n"
                            + "Pseudo : " + this.pseudo + "\n"
                            + "Nom : " + super.nom;
        
        return affichage;
    }


    
    

}
