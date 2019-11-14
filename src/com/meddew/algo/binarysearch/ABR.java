package com.meddew.algo.binarysearch;

        import java.io.*;

public class ABR {
    private Noeud racine;

    public ABR() {
        this.racine = null;
    }

    public ABR(String file) {
        construire(file);
    }

    public void construire(String file){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";

            while((str = bufferedReader.readLine()) != null){
                System.out.println(str);
                inserer(str);
            }

        } catch (IOException e){
            e.printStackTrace();

        }
    }

    public Noeud inserer(Noeud rac, String mot){
        if (rac == null) {
            Noeud nouveau = new Noeud(mot);
            return nouveau;
        }
        if (mot.compareTo(rac.getMot()) < 0)
            rac.setFg(inserer(rac.getFg(), mot));
        else if (mot.compareTo(rac.getMot()) == 0)
            rac.setNbOcc(rac.getNbOcc() + 1);
        else
            rac.setFd(inserer(rac.getFd(), mot));
        return rac;
    }

    public void inserer(String mot){
        racine = inserer(racine, mot);
    }

    public int hauteur() {
        return hauteur(racine);
    }

    private int hauteur(Noeud rac) {
        if (rac == null) return -1;
        int hg = hauteur(rac.getFg());
        int hd = hauteur(rac.getFd());
        if (hg < hd) return hd + 1;
        return hg + 1;
    }

    public void ecrireListeTriee() {
        ecrireListeTriee(racine);
    }

    public void ecrireListeTriee(Noeud rac) {
        if (rac != null) {
            ecrireListeTriee(rac.getFg());
            System.out.println(rac.getMot() + " (" + rac.getNbOcc() + " fois)");
            ecrireListeTriee(rac.getFd());
        }
    }
}
