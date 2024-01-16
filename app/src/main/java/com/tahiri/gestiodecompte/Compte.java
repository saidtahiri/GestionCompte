package com.tahiri.gestiodecompte;

public class Compte {

    private String titulire,devise;
    private double solde;

    public Compte() {
    }

    public Compte(String titulire, String devise, double solde) {
        this.titulire = titulire;
        this.devise = devise;
        this.solde = solde;
    }

    public String getTitulire() {
        return titulire;
    }

    public void setTitulire(String titulire) {
        this.titulire = titulire;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
