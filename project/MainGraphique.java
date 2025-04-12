// MainGraphique.java
// David MELOCCO (TD2 / TPC)

import MG2D.Fenetre;
import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Ligne;
import MG2D.geometrie.Carre;
import MG2D.geometrie.Texture;

import java.util.ArrayList;

/**
 * Création de l'interface graphique via MG2D.
 */
public class MainGraphique {
// Constantes :
    public static final int TAILLE_CASE = 60;
    public static final int TAILLE_ECHIQUIER = 9;
    public static final int TAILLE_ECRAN_X = TAILLE_CASE * 13;
    public static final int TAILLE_ECRAN_Y = TAILLE_CASE * 9;

// Méthodes :
    /**
     * Création de l'échiquier.
     * @param fenetre
     * @param arene
     */
    public static void echiquier(Fenetre fenetre, Plateau arene) {
        for (int ligne = 0; ligne < TAILLE_ECHIQUIER; ligne++) {
            for (int colonne = 0; colonne < TAILLE_ECHIQUIER; colonne++) {
                if ((ligne + colonne) % 2 == 1)
                    fenetre.ajouter(
                        new Carre(Couleur.BLANC, 
                        new Point( (TAILLE_CASE * 2) + ligne * TAILLE_CASE, colonne * TAILLE_CASE), 
                        TAILLE_CASE, 
                        true)
                    );
                else
                    fenetre.ajouter(
                        new Carre(Couleur.GRIS, 
                        new Point( (TAILLE_CASE * 2) + ligne * TAILLE_CASE, colonne * TAILLE_CASE), 
                        TAILLE_CASE, 
                        true)
                    );
            }
        }

        for (int ligne = 0; ligne < TAILLE_ECHIQUIER + 1; ligne++) {
            fenetre.ajouter(
                new Ligne(
                    Couleur.NOIR, 
                    new Point( (TAILLE_CASE * 2), ligne * TAILLE_CASE), 
                    new Point( (TAILLE_CASE * 2) + TAILLE_CASE * 9, ligne * TAILLE_CASE))
            );
        }

        for (int colonne = 0; colonne < TAILLE_ECHIQUIER + 1; colonne++) {
            fenetre.ajouter(
                new Ligne(Couleur.NOIR, 
                new Point( (TAILLE_CASE * 2) + colonne * TAILLE_CASE, 0), 
                new Point( (TAILLE_CASE * 2) + colonne * TAILLE_CASE, TAILLE_CASE * 9))
            );
        }

        fenetre.rafraichir();
    }

    public static void pokemon(Fenetre fenetre, Plateau arene) {
        // Pokémon du joueur 1 :
        ArrayList<Piece> pokemon1 = arene.getPiecesJoueur1();

        for (Piece pokemon : pokemon1) {
            fenetre.ajouter(
                new Texture("images/" + pokemon.getPokemon().getNombre() + ".png", 
                new Point(pokemon.getPosition().getX() * TAILLE_CASE, pokemon.getPosition().getY() * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
            );
        }

        // Pokémon du joueur 2 :
        ArrayList<Piece> pokemon2 = arene.getPiecesJoueur2();

        for (Piece pokemon : pokemon2) {
            fenetre.ajouter(
                new Texture("images/" + pokemon.getPokemon().getNombre() + ".png", 
                new Point(pokemon.getPosition().getX() * TAILLE_CASE, pokemon.getPosition().getY() * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
            );
        }

        fenetre.rafraichir();
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Échecs Pokémon par David Melocco", TAILLE_ECRAN_X, TAILLE_ECRAN_Y);
        Plateau arene = new Plateau();

        echiquier(fenetre, arene);

        while(true) {
            fenetre.rafraichir();
        }
    }
}