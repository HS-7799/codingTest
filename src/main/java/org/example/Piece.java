package org.example;


import java.util.ArrayList;
import java.util.List;

public class Piece {
    private String couleur;
    private Position position;

    private String nom;

    public Piece(String nom, String couleur) {
        this.couleur = couleur;
        this.nom = nom;
        this.position = null;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "couleur='" + couleur + '\'' +
                "nom='" + nom + '\'' +
                ", position=" + position +
                '}';
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Position getPosition() {
        return position;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Deplacement> mouvementsPossible(Position[][] positions) {
        return new ArrayList<>();
    }
}
