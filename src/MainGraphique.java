// MainGraphique.java
// David MELOCCO (TD2 / TPC)

import MG2D.Fenetre;
import MG2D.Souris;
import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Ligne;
import MG2D.geometrie.Carre;
import MG2D.geometrie.Texture;
import MG2D.geometrie.Texte;

import java.util.ArrayList;
import java.awt.Font;
import java.io.File;

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
    public static Font chargerPolice() {
        Font policePokemon = null;
        try {
            policePokemon = Font.createFont(Font.TRUETYPE_FONT, new File("PokemonClassic.ttf"));
            policePokemon = policePokemon.deriveFont(Font.BOLD, 14f);
        } catch (Exception e) {
            e.printStackTrace();
            policePokemon = new Font("Monospaced", Font.BOLD, 14);
        }
        return policePokemon;
    }

    /**
     * Création de l'échiquier.
     * @param fenetre
     * @param arene
     */
    public static void echiquier(Fenetre fenetre, Plateau arene, int joueur) {
        if (joueur == 1) {
            fenetre.setBackground(Couleur.ROUGE);
        } else {
            fenetre.setBackground(Couleur.BLEU);
        }

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
                new Texture("images/" + pokemon.getPokemon().getNumero() + ".png", 
                new Point( (TAILLE_CASE * 2) + pokemon.getPosition().getX() * TAILLE_CASE, pokemon.getPosition().getY() * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
            );
            
            fenetre.ajouter(
                new Texte(
                    Couleur.ROUGE, 
                    new String("" + pokemon.getPokemon().getPV()), 
                    chargerPolice(), 
                    new Point( (TAILLE_CASE * 2) + pokemon.getPosition().getX() * TAILLE_CASE + 20, pokemon.getPosition().getY() * TAILLE_CASE + 10))
            );
        }

        // Pokémon du joueur 2 :
        ArrayList<Piece> pokemon2 = arene.getPiecesJoueur2();

        for (Piece pokemon : pokemon2) {
            fenetre.ajouter(
                new Texture("images/" + pokemon.getPokemon().getNumero() + ".png", 
                new Point( (TAILLE_CASE * 2) + pokemon.getPosition().getX() * TAILLE_CASE, pokemon.getPosition().getY() * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
            );

            fenetre.ajouter(
                new Texte(
                    Couleur.BLEU, 
                    new String("" + pokemon.getPokemon().getPV()), 
                    chargerPolice(), 
                    new Point( (TAILLE_CASE * 2) + pokemon.getPosition().getX() * TAILLE_CASE + 20, pokemon.getPosition().getY() * TAILLE_CASE + 10))
            );
        }

        fenetre.rafraichir();
    }

    public static void changement(Fenetre fenetre, Plateau arene, int x, int y) {
        Couleur couleur;
        if ((x + y) % 2 == 1) {
            couleur = Couleur.BLANC;
        } else {
            couleur = Couleur.GRIS;
        }
        fenetre.ajouter(
            new Carre(
                couleur, 
                new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), 
                TAILLE_CASE, 
                true
            )
        );

        Piece pokemon = arene.getCase(x, y);
        if (pokemon != null) {
            fenetre.ajouter(
                new Texture("images/" + pokemon.getPokemon().getNumero() + ".png", 
                new Point( (TAILLE_CASE * 2) + pokemon.getPosition().getX() * TAILLE_CASE, pokemon.getPosition().getY() * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
            );
        }
    }

    /**
     * Mise à jour des éléments graphiques.
     * @param fenetre
     * @param arene
     */
    public static void rafraichir(Fenetre fenetre, Plateau arene, int joueur) {
        fenetre.effacer();
        echiquier(fenetre, arene, joueur);
        pokemon(fenetre, arene);
    }

    public static void afficherDeplacements(Fenetre fenetre, ArrayList<Position> deplacements, Position position) {
        for (Position possibilites : deplacements) {
            int x = possibilites.getX();
            int y = possibilites.getY();

            if (x < position.getX() && y == position.getY())
                fenetre.ajouter(
                    new Texture("images/arrows/left.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (x > position.getX() && y == position.getY())
                fenetre.ajouter(
                    new Texture("images/arrows/right.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (y < position.getY() && x == position.getX())
                fenetre.ajouter(
                    new Texture("images/arrows/down.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (y > position.getY() && x == position.getX())
                fenetre.ajouter(
                    new Texture("images/arrows/up.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (x < position.getX() && y < position.getY())
                fenetre.ajouter(
                    new Texture("images/arrows/down_left.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (x < position.getX() && y > position.getY())
                fenetre.ajouter(
                    new Texture("images/arrows/up_left.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (x > position.getX() && y < position.getY())
                fenetre.ajouter(
                    new Texture("images/arrows/down_right.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
            if (x > position.getX() && y > position.getY())
                fenetre.ajouter(
                    new Texture("images/arrows/up_right.png", new Point( (TAILLE_CASE * 2) + x * TAILLE_CASE, y * TAILLE_CASE), TAILLE_CASE, TAILLE_CASE)
                );
        }
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Échecs Pokémon par David Melocco", TAILLE_ECRAN_X, TAILLE_ECRAN_Y);
        Souris souris = fenetre.getSouris();
        Plateau arene = new Plateau();
        int joueur = 1;

        rafraichir(fenetre, arene, joueur);

        Piece pokemonDepart = null;
        Position positionArrivee = null;

        while(true) {
            while(pokemonDepart == null) {
                while(!souris.getClicGauche()) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                }

                int x = (souris.getPosition().getX() / TAILLE_CASE) - 2;
                int y = souris.getPosition().getY() / TAILLE_CASE;
                
                if ( (x >= 0) && (x <= 8) && (y >= 0) && (y <= 8) ) {
                    if (arene.getCase(x, y) != null && arene.getCase(x, y).getJoueur() == joueur) {
                        pokemonDepart = arene.getCase(x, y);
                    }
                }
            }

            ArrayList<Position> possibilites = pokemonDepart.getDeplacementPossible(arene);

            if (!possibilites.isEmpty()) {
                afficherDeplacements(fenetre, possibilites, pokemonDepart.getPosition());
                fenetre.rafraichir();
            }

            while(positionArrivee == null) {
                while(!souris.getClicGauche()) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                }

                int x = (souris.getPosition().getX() / TAILLE_CASE) - 2;
                int y = souris.getPosition().getY() / TAILLE_CASE;

                if ( (x >= 0) && (x <= 8) && (y >= 0) && (y <= 8) ) {
                    positionArrivee = new Position(x, y);
                }
            }

            if (possibilites.contains(positionArrivee)) {
                pokemonDepart.setPosition(positionArrivee);

                pokemonDepart = null;
                positionArrivee = null;

                if (joueur == 1)
                    joueur = 2;
                else
                    joueur = 1;
            } else {
                pokemonDepart = null;
                positionArrivee = null;
            }

            echiquier(fenetre, arene, joueur);
            fenetre.rafraichir();
        }
    }
}