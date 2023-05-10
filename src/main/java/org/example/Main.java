package org.example;

public class Main {
    public static void main(String[] args) {
        int joueurBlanc = 1;
        // initialize le board === mettre les piece dans leurs positions initiale
        Position[][] positions = initialiserEchiquier();
        GenerateurDeCoup generateurDeCoup = new GenerateurDeCoup(positions, joueurBlanc);
        generateurDeCoup.genererCoups();
    }

    private static Position[][] initialiserEchiquier() {
        // au début le board est vide
        Position[][] positions = new Position[8][8];
        for (int x = 0; x<8;x++) {
            for (int y = 0; y<8;y++) {
                positions[x][y] = new Position(x,y);
            }
        }
        // créer les pieces dans le board mais sans positions
        Pion pionNoir = new Pion("pionNoi", "Noir");
        Tour tourBlanche = new Tour("tourBlanche", "Blanc");
        Cavalier premierCavalierBlanc = new Cavalier("premierCavalierBlanc","Blanc");
        Cavalier deuxiemeCavalierBlanc = new Cavalier("premierCavalierBlanc","Blanc");

        // mettre les pieces dans le board

        // mettre le pion noir dans d7
        positions[1][3].setPiece(pionNoir);
        pionNoir.setPosition(positions[1][3]);

        // mettre la tour blanche dans d5
        positions[3][3].setPiece(tourBlanche);
        tourBlanche.setPosition(positions[3][3]);

        // mettre le premier cavalier blanc dans g5
        positions[3][6].setPiece(premierCavalierBlanc);
        premierCavalierBlanc.setPosition(positions[3][6]);

        // mettre le deuxieme cavalier blanc dans d2
        positions[6][3].setPiece(deuxiemeCavalierBlanc);
        deuxiemeCavalierBlanc.setPosition(positions[6][3]);

        return positions;
    }
}