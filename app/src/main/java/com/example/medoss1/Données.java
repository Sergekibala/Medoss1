package com.example.medoss1;

public class Données {

    String id, nom, prenom, codeTradP, categorie, adresseComplete,
            codePostal, specialite, mail;


    public Données() {

    }

    public Données(String id, String nom, String prenom,
                   String codeTradP, String categorie, String
                   adresseComplete, String codePostal, String
                   specialite, String mail) {


        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.codeTradP = codeTradP;
        this.categorie = categorie;
        this.adresseComplete = adresseComplete;
        this.codePostal = codePostal;
        this.specialite = specialite;
        this.mail = mail;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCodeTradP() {
        return codeTradP;
    }

    public void setCodeTradP(String codeTradP) {
        this.codeTradP = codeTradP;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getAdresseComplete() {
        return adresseComplete;
    }

    public void setAdresseComplete(String adresseComplete) {
        this.adresseComplete = adresseComplete;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}