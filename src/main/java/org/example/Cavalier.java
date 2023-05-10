package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cavalier extends Piece {
    public Cavalier(String nom, String couleur) {
        super(nom, couleur);
    }

    public List<Deplacement> mouvementsPossible(Position[][] positions) {
        System.out.println("mouvements possible pour " + this.getNom() + " : ");
        return new ArrayList<>();
    }
}
