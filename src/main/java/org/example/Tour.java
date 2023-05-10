package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tour extends Piece {
    public Tour(String nom, String couleur) {
        super(nom, couleur);
    }

    public List<Deplacement> mouvementsPossible(Position[][] positions) {
        System.out.println("mouvements possible pour " + this.getNom() + " : ");
        int x = this.getPosition().getX();
        int y = this.getPosition().getY();

        List<Deplacement> deplacements = new ArrayList<>();
        for (int j = 0; j< positions.length;j++) {
            if (positions[x][j].getPiece() != null) {
                break;
            } else {
                deplacements.add(new Deplacement(x, j));
            }
        }

        for (int i = 0; i< positions.length;i++) {
            if (positions[i][y].getPiece() == null) {
                deplacements.add(new Deplacement(i, y));
            }
        }

        return deplacements;
    }
}
