package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenerateurDeCoup {
    private Position[][] positions;
    private int joueur; // 1 joueur blanc, -1 joueur noire

    public GenerateurDeCoup(Position[][] positions, int joueur) {
        this.positions = positions;
        this.joueur = joueur;
    }

    public Position[][] getPositions() {
        return positions;
    }

    public void setPositions(Position[][] positions) {
        this.positions = positions;
    }

    public int getJoueur() {
        return joueur;
    }

    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }

    public void genererCoups() {
        // generer des coup pour le joueur courant, 1 joueur blanc, -1 joueur noire
        String couleurDesPieces = this.joueur == 1 ? "Blanc" : "Noir";
        List<Piece> pieces = new ArrayList<>();
        for (int i = 0; i< positions.length;i++) {
            for (int j = 0; j< positions.length; j++) {
                if (positions[i][j].getPiece() != null && positions[i][j].getPiece().getCouleur() == couleurDesPieces) {
                    pieces.add(positions[i][j].getPiece());
                }
            }
        }

        // pour chaque piece afficher les mouvements posssible

        for (Piece piece : pieces) {
            List<Deplacement> deplacements = piece.mouvementsPossible(positions);
            afficherDeplacement(piece, deplacements);
        }
    }

    private void afficherDeplacement(Piece piece, List<Deplacement> deplacements) {
        String nomPiecePosition = trouverLeNomPosition(piece.getPosition().getX(), piece.getPosition().getY());
        for (Deplacement deplacement : deplacements) {
            System.out.println("T" + nomPiecePosition + "-" + trouverLeNomPosition(deplacement.getX(), deplacement.getY()) );
        }
    }

    private String trouverLeNomPosition(int x, int y) {
        String nom = "";
        switch (y) {
            case 0:
                nom += "a";
                break;
            case 1:
                nom += "b";
                break;
            case 2:
                nom += "c";
                break;
            case 3:
                nom += "d";
                break;
            case 4:
                nom += "e";
                break;
            case 5:
                nom += "f";
                break;
            case 6:
                nom += "g";
                break;
            case 7:
                nom += "h";
                break;
        }
        nom = nom + (8 - x);
        return nom;
    }
}
