/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ri.java;

import java.util.Scanner;

/**
 *
 * @author Jacques
 */
public class Start {

    public static void main(String[] args) {
        //4-a
        String prenom;
        String nom;
        String pseudo;
        float salaire;
        float prime;
        int anNaiss;

        //4-b
        Scanner input = new Scanner(System.in);

        //4-c
        System.out.println("Renseignez le pseudo:");
        pseudo = input.nextLine();

        //4-d
        while (!(pseudo.equals("ridev"))) {
            System.out.println("Renseignez à nouveau le pseudo:");
            pseudo = input.nextLine();
        }
        System.out.println("Renseignez le nom :");
        nom = input.nextLine();
        System.out.println("Renseignez le prénom :");
        prenom = input.nextLine();
        System.out.println("Renseignez le salaire:");
        salaire = input.nextFloat();
        System.out.println("Renseignez le prime :");
        prime = input.nextFloat();
        System.out.println("Renseignez l'année de  naiss:  ");
        anNaiss = input.nextInt();

        Programmeur prog = new Programmeur(salaire, prime, pseudo, nom, prenom, anNaiss);

        //4-e
        System.out.println(prog);

    }

}
