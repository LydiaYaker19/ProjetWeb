package com.example.projetweb;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "nom")
    String nom;

    @Column(name = "prenom")
    String prenom;

    @Column(name = "note1")
    public int note1;

    @Column(name = "note2")
    public int note2;

    @Column(name = "note3")
    public int note3;

    public Student(int id, String nom, String prenom, int note1, int note2, int note3) {
        this.id  = id;
        this.nom = nom;
        this.prenom= prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getnote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 =note1;
    }

    public int getnote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 =note2;
    }

    public int getnote3() {
        return note3;    }

    public void setNote3(int note3) {
        this.note3 =note3;
    }

}
