package com.meddew.algo.binarysearch;

public class ABRMain {
    public static void main(String args[]){
        ABR abr1 = new ABR("C:\\Users\\Mehdi\\Documents\\shoolmarks\\Algorithme\\src\\com\\meddew\\algo\\hiver");
        ABR abr = new ABR();
        abr.inserer("Patrick");
        abr.inserer("Jean-Claude");
        abr.inserer("Ada");
        abr.inserer("Laurent");
        abr.inserer("Fabrice");
        abr.ecrireListeTriee();
        System.out.println("L'arbre est de hauteur " + abr.hauteur());

        System.out.println("\nNouvel arbre");
        abr = new ABR(args[0]);
        abr.ecrireListeTriee();
        System.out.println("L'arbre est de hauteur " + abr.hauteur());
        System.out.println("Fichier " + args[0] + " inexistant ou non correct");
    }
}
