// MainGraphique.java
// David MELOCCO (TD2 / TPC)

// Imports des bibliothèques (MG2D) nécessaires uniquement pour l'optimisation.
import MG2D.Fenetre;
import MG2D.Souris;
import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Rectangle;
import MG2D.geometrie.Carre;
import MG2D.geometrie.Texture;
import MG2D.geometrie.Texte;

// Imports d'utilitaires Java pour les tableaux dynamiques et l'affichage de police d'écriture personnalisée.
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
    public static Font chargerPolice(int taille) {
        Font policePokemon = null;
        try {
            policePokemon = Font.createFont(Font.TRUETYPE_FONT, new File("assets/PokemonClassic.ttf"));
            policePokemon = policePokemon.deriveFont(Font.BOLD, taille);
        } catch (Exception e) {
            policePokemon = new Font("Monospaced", Font.BOLD, taille);
        }
        return policePokemon;
    }

    /**
     * Création de l'échiquier.
     * @param fenetre
     * @param arene
     */
    public static void echiquier(Fenetre fenetre, Plateau arene, int joueur) {
        Texture dracaufeu;
        Texture tortank;

        // Si aucun des Mewtwo n'a été battu :
        if (arene.getMewtwo(1) != null && arene.getMewtwo(2) != null) {
            // Affichage des bannières :
            if (joueur == 1) {
                dracaufeu = new Texture("assets/arene/dracaufeu.png", new Point(0, 0));
                fenetre.ajouter(dracaufeu);
                dracaufeu = new Texture("assets/arene/dracaufeu.png", new Point(540, 0));
                fenetre.ajouter(dracaufeu);
            } else {
                tortank = new Texture("assets/arene/tortank.png", new Point(0, 0));
                fenetre.ajouter(tortank);
                tortank = new Texture("assets/arene/tortank.png", new Point(540, 0));
                fenetre.ajouter(tortank);
            }
        // Si un des Mewtwo a été battu :
        } else {
            // Affichage des bannières du joueur victorieux :
            if (arene.getMewtwo(1) == null) {
                tortank = new Texture("assets/arene/tortank.png", new Point(0, 0));
                fenetre.ajouter(tortank);
                tortank = new Texture("assets/arene/tortank.png", new Point(540, 0));
                fenetre.ajouter(tortank);
            } else {
                dracaufeu = new Texture("assets/arene/dracaufeu.png", new Point(0, 0));
                fenetre.ajouter(dracaufeu);
                dracaufeu = new Texture("assets/arene/dracaufeu.png", new Point(540, 0));
                fenetre.ajouter(dracaufeu);
            }
        }

        // Création de l'échiquier :
        for (int ligne = 0; ligne < TAILLE_ECHIQUIER; ligne++) {
            for (int colonne = 0; colonne < TAILLE_ECHIQUIER; colonne++) {
                if ((ligne + colonne) % 2 == 1) {
                    fenetre.ajouter(
                        new Carre(Couleur.BLANC, 
                        new Point( (TAILLE_CASE * 2) + ligne * TAILLE_CASE, colonne * TAILLE_CASE), 
                        TAILLE_CASE, 
                        true)
                    );
                    fenetre.ajouter(
                        new Carre(Couleur.NOIR, 
                        new Point( (TAILLE_CASE * 2) + ligne * TAILLE_CASE, colonne * TAILLE_CASE), 
                        TAILLE_CASE, 
                        false)
                    );
                } else {
                    fenetre.ajouter(
                        new Carre(Couleur.GRIS, 
                        new Point( (TAILLE_CASE * 2) + ligne * TAILLE_CASE, colonne * TAILLE_CASE), 
                        TAILLE_CASE, 
                        true)
                    );
                    fenetre.ajouter(
                        new Carre(Couleur.NOIR, 
                        new Point( (TAILLE_CASE * 2) + ligne * TAILLE_CASE, colonne * TAILLE_CASE), 
                        TAILLE_CASE, 
                        false)
                    );
                }
            }
        }

        fenetre.rafraichir();
    }

    /**
     * Affiche les Pokémon des deux joueurs.
     * @param fenetre
     * @param arene
     */
    public static void pokemon(Fenetre fenetre, Plateau arene) {
        // Nettoie l'arène des Pokémon battus :
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
                    chargerPolice(14), 
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
                    chargerPolice(14), 
                    new Point( (TAILLE_CASE * 2) + pokemon.getPosition().getX() * TAILLE_CASE + 20, pokemon.getPosition().getY() * TAILLE_CASE + 10))
            );
        }

        fenetre.rafraichir();
    }

    /**
     * Affiche l'écran de fin.
     * @param fenetre
     * @param arene
     */
    public static void fin(Fenetre fenetre, Plateau arene) {
        Rectangle boite;
        Texte texte;

        // Si le joueur a perdu :
        if (arene.getMewtwo(1) == null) {
            boite = new Rectangle(Couleur.BLEU, new Point(0, 0), 240, 180, true);
            texte = new Texte(Couleur.BLANC, new String("PERDU !"), chargerPolice(20), new Point( (TAILLE_ECRAN_X / 2), (TAILLE_ECRAN_Y / 2)));
        // Si le joueur est vainqueur :
        } else {
            boite = new Rectangle(Couleur.ROUGE, new Point(0, 0), 240, 180, true);
            texte = new Texte(Couleur.BLANC, new String("VICTOIRE !"), chargerPolice(20), new Point( (TAILLE_ECRAN_X / 2), (TAILLE_ECRAN_Y / 2)));
        }
        fenetre.ajouter(boite);
        boite.translater( (TAILLE_ECRAN_X / 2) - (boite.getLargeur() / 2), (TAILLE_ECRAN_Y / 2) - (boite.getHauteur() / 2));
        fenetre.ajouter(texte);
    }

    /**
     * Affiche les déplacements possibles via des flèches directionnelles.
     * @param fenetre
     * @param deplacements
     * @param position
     */
    public static void afficherDeplacements(Fenetre fenetre, ArrayList<Position> deplacements, Position position) {
        // Pour les déplacements possibles :
        for (Position possibilites : deplacements) {
            // Compare la position de la case de déplacement par rapport à la position où le Pokémon se situe :
            int x = Integer.compare(possibilites.getX(), position.getX());
            int y = Integer.compare(possibilites.getY(), position.getY());

            /*
            Choix de la direction.
            Explication -> les fichiers ont des noms composés spécifiques (haut, haut_gauche/droite, bas, bas_gauche/droite).
            */
            String direction = "";

            if (y < 0)
                direction += "bas";
            if (y > 0)
                direction += "haut";
            if (x < 0) {
                // Si la case se situe à gauche :
                if (direction.isEmpty())
                    direction += "gauche";
                // Sinon, la case se situe dans l'angle gauche.
                else
                    direction += "_gauche";
            }
            if (x > 0) {
                // Si la case se situe à droite :
                if (direction.isEmpty())
                    direction += "droite";
                // Sinon, la case se situe dans l'angle droit.
                else
                    direction += "_droite";
            }

            // Affiche la flèche de déplacement :
            if (!direction.isEmpty()) {
                String chemin = "assets/fleches/" + direction + ".png";
                Point point = new Point(
                    (TAILLE_CASE * 2) + possibilites.getX() * TAILLE_CASE, 
                    possibilites.getY() * TAILLE_CASE);
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
        echiquier(fenetre, arene, joueur);
        pokemon(fenetre, arene);
    }

    public static void main(String[] args) {
        // Création de la fenêtre :
        Fenetre fenetre = new Fenetre("PokéChess (release v.01)", TAILLE_ECRAN_X, TAILLE_ECRAN_Y);
        Souris souris = fenetre.getSouris();

        /*
        Mode de jeux :
        -> Plateau par défaut.
        -> Selon deux fichiers.
        */
        // Plateau arene = new Plateau();
        Plateau arene = new Plateau("../pokemon_j1.txt", "../pokemon_j2.txt");

        int joueur = 1; // Joueur qui joue le coup.
        rafraichir(fenetre, arene, joueur);

        Piece pokemonDepart = null;
        Position positionArrivee = null;

        // Tant qu'aucun Mewtwo n'a été battu :
        while(arene.getMewtwo(1) != null && arene.getMewtwo(2) != null) {
            // Tant que le joueur n'a pas choisi de Pokémon à déplacer :
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
                    // Si la case a un Pokémon et qu'il appartient au joueur qui joue le coup :
                    if (arene.getCase(x, y) != null && arene.getCase(x, y).getJoueur() == joueur) {
                        pokemonDepart = arene.getCase(x, y);    // Pokémon saisi pour le déplacer.
                    }
                }
            }

            // Création des possibilités de déplacements/d'attaques.
            ArrayList<Position> possibilites = pokemonDepart.getDeplacementPossible(arene);
            ArrayList<Position> confrontations = pokemonDepart.getAttaquePossible(arene);

            // Si le Pokémon peut se déplacer :
            if (!possibilites.isEmpty()) {
                // Afficher les déplacements possibles et rafraîchir l'échiquier :
                afficherDeplacements(fenetre, possibilites, pokemonDepart.getPosition());
                fenetre.rafraichir();
            }

            // Tant que le joueur n'a pas déplacé le Pokémon choisi :
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
                    if (possibilites.contains(new Position(x, y)) || confrontations.contains(new Position(x, y)))
                        positionArrivee = new Position(x, y);   // Case de déplacement.
                } 
            }

            // Si la case de déplacement est disponible où si une confrontation est possible :
            if (possibilites.contains(positionArrivee) || confrontations.contains(positionArrivee)) {
                // Si c'est une confrontation :
                if (confrontations.contains(positionArrivee)) {
                    // Récupérer le Pokémon confronté :
                    Piece pokemonAttaque = arene.getCase(positionArrivee.getX(), positionArrivee.getY());

                    // Combat des deux Pokémon :
                    pokemonDepart.getPokemon().attaque(pokemonAttaque.getPokemon());
                }

                // Si le Pokémon déplacé est encore vivant :
                if (pokemonDepart.getPokemon().getPV() > 0) {
                    pokemonDepart.setPosition(positionArrivee); // Déplacement sur la case.
                }

                // Réinitialise le Pokémon choisi et la case de déplacement :
                pokemonDepart = null;
                positionArrivee = null;

                // Échange le tour :
                if (joueur == 1)
                    joueur = 2;
                else
                    joueur = 1;
            }

            rafraichir(fenetre, arene, joueur);
            fenetre.rafraichir();
        }

        // Fin du jeu :
        rafraichir(fenetre, arene, joueur);
        fin(fenetre, arene);
    }
}