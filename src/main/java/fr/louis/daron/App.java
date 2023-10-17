package fr.louis.daron;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        //Louis NIÉ
        Scanner clavier = new Scanner(System.in);
        int salaireInit = 400;
        int prime = 250;
        int nbVenteMin = 10;

        System.out.print("Entrez votre nombre de ventes : ");
        int nbVente = clavier.nextInt();

        if (nbVente >= nbVenteMin){
            salaireInit = salaireInit + prime;
            System.out.println("Félicitations, vous avez effectué " + nbVente + " ventes. Votre salaire, avec prime est de : "+ salaireInit + "." );
        }else {
            int reste = nbVenteMin - nbVente;
            System.out.println("Désolé, vous avez effectué " + nbVente + " ventes,il vous en manque "+ reste +" pour avoir les primes. Votre salaire, sans prime est de : "+ salaireInit +"." );
        }
        clavier.close();
    }
    
}
