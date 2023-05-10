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
        // horizontal, x fix, y varie
        for (int j = y + 1; j < positions.length; j++) {
            if (positions[x][j].getPiece() == null) {
                deplacements.add(new Deplacement(x,j));
            } else {
                break;
            }
        }
        for (int j = y - 1; j >= 0; j--) {
            if (positions[x][j].getPiece() == null) {
                deplacements.add(new Deplacement(x,j));
            } else {
                break;
            }
        }
        // vertical, x varie, y fix
        for (int i = x + 1; i < positions.length; i++) {
            if (positions[i][y].getPiece() == null) {
                deplacements.add(new Deplacement(i,y));
            } else {
                break;
            }
        }
        for (int i = x - 1; i >= 0; i--) {
            if (positions[i][y].getPiece() == null) {
                deplacements.add(new Deplacement(i,y));
            } else {
                break;
            }
        }
        return deplacements;
    }
}
