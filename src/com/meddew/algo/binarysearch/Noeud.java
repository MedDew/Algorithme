package com.meddew.algo.binarysearch;

public class Noeud {
    private String mot;
    private int nbOcc;
    private Noeud fd;
    private Noeud fg;

    public Noeud(String mot) {
        this.mot = mot;
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public int getNbOcc() {
        return nbOcc;
    }

    public void setNbOcc(int nbOcc) {
        this.nbOcc = nbOcc;
    }

    public Noeud getFd() {
        return fd;
    }

    public void setFd(Noeud fd) {
        this.fd = fd;
    }

    public Noeud getFg() {
        return fg;
    }

    public void setFg(Noeud fg) {
        this.fg = fg;
    }
}
