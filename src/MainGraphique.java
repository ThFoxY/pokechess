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
    /**
     * Charge la police d'écriture personnalisée (Pokémon Classic).
     * @return un objet de type Font.
     */
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

    /**
     * Affiche les pokémon des deux joueurs.
     * @param fenetre
     * @param arene
     */
    public static void pokemon(Fenetre fenetre, Plateau arene) {
        arene.nettoyer();

        // Pokémon du joueur 1 :
        ArrayList<Piece> pokemon1 = arene.getPiecesJoueur1();

        for (Piece pokemon : pokemon1) {
            fenetre.ajouter(
                new Texture("assets/" + pokemon.getPokemon().getNumero() + ".png", 
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
                new Texture("assets/" + pokemon.getPokemon().getNumero() + ".png", 
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

    /**
     * Affiche les déplacements possibles.
     * @param fenetre
     * @param deplacements
     * @param position
     */
    public static void afficherDeplacements(Fenetre fenetre, ArrayList<Position> deplacements, Position position) {
        for (Position possibilites : deplacements) {
            int x = Integer.compare(possibilites.getX(), position.getX());
            int y = Integer.compare(possibilites.getY(), position.getY());
    
            String direction = "";
    
            if (y < 0)
                direction += "bas";
            if (y > 0)
                direction += "haut";
            if (x < 0) {
                if (direction.isEmpty())
                    direction += "gauche";
                else
                    direction += "_gauche";
            }
            if (x > 0) {
                if (direction.isEmpty())
                    direction += "droite";
                else
                    direction += "_droite";
            }
    
            if (!direction.isEmpty()) {
                String chemin = "assets/fleches/" + direction + ".png";
                Point point = new Point((TAILLE_CASE * 2) + possibilites.getX() * TAILLE_CASE, possibilites.getY() * TAILLE_CASE);
                fenetre.ajouter(new Texture(chemin, point, TAILLE_CASE, TAILLE_CASE));
            }
        }
    }

    /**
     * Mise à jour des éléments graphiques.
     * @param fenetre
     * @param arene
     */
    public static void rafraichir(Fenetre fenetre, Plateau arene, int joueur) {
        fenetre.effacer();

        if (arene.getMewtwo(1) != null && arene.getMewtwo(2) != null) {
            echiquier(fenetre, arene, joueur);
            pokemon(fenetre, arene);
        } else {
            fenetre.effacer();
        }
    }

    public static void main(String[] args) {
        // Création de la fenêtre :
        Fenetre fenetre = new Fenetre("Échecs Pokémon", TAILLE_ECRAN_X, TAILLE_ECRAN_Y);
        Souris souris = fenetre.getSouris();
        Plateau arene = new Plateau("pokemon_j1.txt", "pokemon_j2.txt");

        // Création de l'écran titre :
        fenetre.rafraichir();

        int joueur = 1; // Joueur qui joue le coup.
        rafraichir(fenetre, arene, joueur);

        Piece pokemonDepart = null;
        Position positionArrivee = null;

        // Tant qu'aucun Mewtwo n'a été battu :
        while(arene.getMewtwo(1) != null && arene.getMewtwo(2) != null) {
            // Tant que le joueur n'a pas choisi de pokémon à déplacer :
            while(pokemonDepart == null) {
                // Attente d'un clic gauche.
                while(!souris.getClicGauche()) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                }

                // Récupère les coordonnées de la souris sur l'échiquier :
                int x = (souris.getPosition().getX() / TAILLE_CASE) - 2;
                int y = souris.getPosition().getY() / TAILLE_CASE;
                
                // Si la souris est sur l'échiquier :
                if ( (x >= 0) && (x <= 8) && (y >= 0) && (y <= 8) ) {
                    // Si la case a un pokémon et qu'il appartient au joueur qui joue le coup :
                    if (arene.getCase(x, y) != null && arene.getCase(x, y).getJoueur() == joueur) {
                        pokemonDepart = arene.getCase(x, y);    // Pokémon saisi pour le déplacer.
                    }
                }
            }

            // Création des possibilités de déplacements/d'attaques.
            ArrayList<Position> possibilites = pokemonDepart.getDeplacementPossible(arene);
            ArrayList<Position> confrontations = pokemonDepart.getAttaquePossible(arene);

            // Si le pokémon peut se déplacer :
            if (!possibilites.isEmpty()) {
                // Afficher les déplacements possibles et rafraîchir l'échiquier :
                afficherDeplacements(fenetre, possibilites, pokemonDepart.getPosition());
                fenetre.rafraichir();
            }

            // Tant que le joueur n'a pas déplacé le pokémon choisi :
            while(positionArrivee == null) {
                // Attente d'un clic gauche.
                while(!souris.getClicGauche()) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                }

                // Récupère les coordonnées de la souris sur l'échiquier :
                int x = (souris.getPosition().getX() / TAILLE_CASE) - 2;
                int y = souris.getPosition().getY() / TAILLE_CASE;

                // Si la souris est sur l'échiquier :
                if ( (x >= 0) && (x <= 8) && (y >= 0) && (y <= 8) ) {
                    positionArrivee = new Position(x, y);   // Case de déplacement.
                }
            }

            if (possibilites.contains(positionArrivee) || confrontations.contains(positionArrivee)) {
                if (confrontations.contains(positionArrivee)) {
                    Piece pokemonAttaque = arene.getCase(positionArrivee.getX(), positionArrivee.getY());

                    while(pokemonDepart.getPokemon().getPV() > 0 && pokemonAttaque.getPokemon().getPV() > 0)
                        pokemonDepart.getPokemon().attaque(pokemonAttaque.getPokemon());
                }

                if (pokemonDepart.getPokemon().getPV() > 0) {
                    pokemonDepart.setPosition(positionArrivee);
                }

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

            rafraichir(fenetre, arene, joueur);
            fenetre.rafraichir();
        }
    }
}