package com.example.projet;


public class Student {

    int id;


    String nom;


    String prenom;

    public double note1;

    public double note2;


    public double note3;

    public Student(int id, String nom, String prenom, int note1, int note2, int note3) {
        this.id  = id;
        this.nom = nom;
        this.prenom = prenom;
        this.note1 = note1;
        this.note2 = note2;
        this.note3= note3;
    }

    public Student(){
    }

    public int getId() {
        return id;  }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getnote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 =note1;
    }

    public double getnote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 =note2;
    }

    public double getnote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 =note3;
    }

}
