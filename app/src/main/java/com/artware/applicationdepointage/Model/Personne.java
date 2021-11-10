package com.artware.applicationdepointage.Model;

public class Personne {

    private int matricule;
    private String nom;
    private String prenom;
    private Boolean checked;

    public Personne(int matricule, String nom, String prenom, Boolean checked) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.checked = checked;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Boolean getChecked(){
        return checked;
    }

    public void setChecked(){
        this.checked = !checked;
    }

}
