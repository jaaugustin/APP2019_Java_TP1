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
public class Personne {
    String nom;
    String prenom;
    int anNaissance;
    private static int compteurPers;  //compteur du nombre d'instances de Personne
    
    public Personne(String nom, String prenom, int anNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        compteurPers++;
    }
    
    public Personne(){
        nom = null;
        prenom = "";
        anNaissance = 0;
        compteurPers++;
    }
    
    int calculerAge(){
        return (2018 - anNaissance);
    }
    
//    void afficher(){
//        System.out.println("Nom : "+ nom +"Prénom : "+ prenom+" Age :"+ calculerAge());
//    }
//    
    
    @Override
    public String toString(){
        return ("Nom : "+ nom +"Prénom : "+ prenom+" Age :"+ calculerAge());
        
    }
    
    static void afficherNbPersonnes(){
        System.out.println("Nb d'objets créés : "+ compteurPers);
    }
    
}
