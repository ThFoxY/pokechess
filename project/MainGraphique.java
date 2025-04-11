// MainGraphique.java
// David MELOCCO (TD2 / TPC)

import MG2D.Fenetre;
import MG2D.Couleur;
import MG2D.geometrie.Rectangle;
import MG2D.geometrie.Texte;
import MG2D.geometrie.Texture;
import MG2D.geometrie.Ligne;
import MG2D.geometrie.Point;

import java.util.ArrayList;
import java.awt.Font;

/**
 * Création de l'interface graphique via MG2D.
 */
public class MainGraphique {
// Constants:
    public static final int SCREEN_SIZE_X = 600;
    public static final int SCREEN_SIZE_Y = 700;
    public static final int TOP_HEIGHT = 100;
    public static final int COLUMN_ROW = 9;
    public static final int SPACING = 66;
    public static final int REFRESH_RATE = 16;
    public static final Font FONT = new Font("Calibri", Font.TYPE1_FONT, 24);

// Attributes:
    public static Fenetre window = new Fenetre("Échecs Pokémon", SCREEN_SIZE_X, SCREEN_SIZE_Y);
    public static boolean loop = true;

// Methods:
    /**
     * Initializes the top of grid.
     * @param color a color for the top.
     */
    public static void initTop(Couleur color) {
        Rectangle top = new Rectangle(color, new Point(0, SCREEN_SIZE_Y - TOP_HEIGHT), SCREEN_SIZE_X, TOP_HEIGHT, true);
        window.ajouter(top);

        Texte turn = new Texte(Couleur.BLANC, "Au joueur rouge de jouer", FONT, new Point(top.getLargeur() / 2, top.getHauteur() / 2 + SCREEN_SIZE_Y - TOP_HEIGHT));
        window.ajouter(turn);
    }

    /**
     * Initializes the grid.
     * @param color a color for the lines.
     */
    public static void drawGrid(Couleur color) {
        for(int i = 0; i < COLUMN_ROW; i++) {
            Ligne line = new Ligne(color, new Point(i * SPACING, 0), new Point(i * SPACING, SCREEN_SIZE_Y - TOP_HEIGHT));
            window.ajouter(line);
        }

        for(int i = 0; i < COLUMN_ROW; i++) {
            Ligne line = new Ligne(color, new Point(0, i * SPACING), new Point(SCREEN_SIZE_X, i * SPACING));
            window.ajouter(line);
        }
    }

    public static void initArena(Plateau p) {
        ArrayList<Piece> arena = p.getArena();
        for (Piece pokemon : arena) {
            Texture pok = new Texture("images/" + pokemon.getPokemon().getNombre() + ".png", new Point(pokemon.getPosition().getX() * 66, pokemon.getPosition().getY() * 66), SPACING, SPACING);
            window.ajouter(pok);

            if(pokemon.getPlayer() == 1) {
                Texte pokPV = new Texte(Couleur.ROUGE, "" + pokemon.getPokemon().getPV() + "", FONT, new Point( (pokemon.getPosition().getX() * 66) + 16, (pokemon.getPosition().getY() * 66) + 16) );
                window.ajouter(pokPV);
            }else {
                Texte pokPV = new Texte(Couleur.VERT, "" + pokemon.getPokemon().getPV() + "", FONT, new Point( (pokemon.getPosition().getX() * 66) + 16, (pokemon.getPosition().getY() * 66) + 16) );
                window.ajouter(pokPV);
            }
        }
    }

    public static void main(String[] args) {
        Plateau arena = new Plateau();

        initTop(Couleur.VERT);
        drawGrid(Couleur.NOIR);
        initArena(arena);

        while(loop) {
            try {
                Thread.sleep(REFRESH_RATE);
            } catch (Exception e) {
                System.out.println("An error as occured!");
                System.exit(1);
            }

            window.rafraichir();
        }
    }
}