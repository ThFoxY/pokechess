// Plateau.java
// David MELOCCO (TD2 / TPC)

import pokemons.*;
import java.util.ArrayList;

/**
 * Création d'une arène.
 */
public class Plateau {
// Attributs :
    private ArrayList<Piece> arene;

// Constructeurs :
    /**
     * Par défaut.
     */
    public Plateau() {
        this.arene = new ArrayList<Piece>();
        // Joueur 1 :
            // A1 à I1
            arene.add(new Piece(
                new Salameche(), 1, "A1"));
            arene.add(new Piece(
                new Carapuce(), 1, "B1"));
            arene.add(new Piece(
                new Bulbizarre(), 1, "C1"));
            
            arene.add(new Piece(
                new Sulfura(), 1, "D1"));
            arene.add(new Piece(
                new Mewtwo(), 1, "E1"));
            arene.add(new Piece(
                new Electhor(), 1, "F1"));

            arene.add(new Piece(
                new Bulbizarre(), 1, "G1"));
            arene.add(new Piece(
                new Carapuce(), 1, "H1"));
            arene.add(new Piece(
                new Salameche(), 1, "I1"));

            // A2 à I2
            arene.add(new Piece(
                new Reptincel(), 1, "A2"));
            arene.add(new Piece(
                new Carabaffe(), 1, "B2"));
            arene.add(new Piece(
                new Herbizarre(), 1, "C2"));
            
            arene.add(new Piece(
                new Dracolosse(), 1, "D2"));
            arene.add(new Piece(
                new Artikodin(), 1, "E2"));
            arene.add(new Piece(
                new Dracolosse(), 1, "F2"));

            arene.add(new Piece(
                new Herbizarre(), 1, "G2"));
            arene.add(new Piece(
                new Carabaffe(), 1, "H2"));
            arene.add(new Piece(
                new Reptincel(), 1, "I2"));

            // D3 à F3
            arene.add(new Piece(
                new Dracaufeu(), 1, "D3"));
            arene.add(new Piece(
                new Tortank(), 1, "E3"));
            arene.add(new Piece(
                new Florizarre(), 1, "F3"));
        
        // Joueur 2 :
            // A9 à I9
            arene.add(new Piece(
                new Salameche(), 2, "A9"));
            arene.add(new Piece(
                new Carapuce(), 2, "B9"));
            arene.add(new Piece(
                new Bulbizarre(), 2, "C9"));
            
            arene.add(new Piece(
                new Sulfura(), 2, "D9"));
            arene.add(new Piece(
                new Mewtwo(), 2, "E9"));
            arene.add(new Piece(
                new Electhor(), 2, "F9"));

            arene.add(new Piece(
                new Bulbizarre(), 2, "G9"));
            arene.add(new Piece(
                new Carapuce(), 2, "H9"));
            arene.add(new Piece(
                new Salameche(), 2, "I9"));

            // A8 à I8
            arene.add(new Piece(
                new Reptincel(), 2, "A8"));
            arene.add(new Piece(
                new Carabaffe(), 2, "B8"));
            arene.add(new Piece(
                new Herbizarre(), 2, "C8"));
            
            arene.add(new Piece(
                new Dracolosse(), 2, "D8"));
            arene.add(new Piece(
                new Artikodin(), 2, "E8"));
            arene.add(new Piece(
                new Dracolosse(), 2, "F8"));

            arene.add(new Piece(
                new Herbizarre(), 2, "G8"));
            arene.add(new Piece(
                new Carabaffe(), 2, "H8"));
            arene.add(new Piece(
                new Reptincel(), 2, "I8"));

            // D7 à F7
            arene.add(new Piece(
                new Florizarre(), 2, "D7"));
            arene.add(new Piece(
                new Tortank(), 2, "E7"));
            arene.add(new Piece(
                new Dracaufeu(), 2, "F7"));
    }

    // TODO : Constructeur selon deux fichiers.

// Méthodes :
    // ----- GETTERS -----

    /**
     * Renvoie l'arène et ses pokémon.
     * @return
     */
    public ArrayList<Piece> getArene() { return this.arene; }

    /**
     * Renvoie la pièce située à des coordonnées x et y.
     * @param x
     * @param y
     * @return un objet de type Pokemon, sinon null.
     */
    public Piece getCase(int x, int y) {
        for (Piece pokemon : arene) {
            if(pokemon.getPosition().equals(new Position(x, y)))
                return pokemon;
        }
        return null;
    }

    /**
     * Renvoie la pièce située à une position.
     * @param position
     * @return un objet de type Pokemon, sinon null.
     */
    //TODO : à corriger.
    public Piece getCase(Position position) { return this.getCase(new Position(position.getX(), position.getY())); }

    /**
     * Renvoie la pièce située sur une case de l'échiquier.
     * @param position
     * @return un objet de type Pokemon, sinon null.
     */
    //TODO : à corriger.
    public Piece getCase(String position) {
        //! Vérifier en cas d'erreur.
        return this.getCase(new Position(position));
    }

    /**
     * Renvoie les pièces du joueur 1.
     * @return une liste dynamique des pokémon du joueur 1.
     */
    public ArrayList<Piece> getPiecesJoueur1() {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece piece : arene) {
            if(piece.getJoueur() == 1)
                pieces.add(piece);
        }
        return pieces;
    }

    /**
     * Renvoie les pièces du joueur 2.
     * @return une liste dynamique des pokémon du joueur 2.
     */
    public ArrayList<Piece> getPiecesJoueur2() {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece piece : arene) {
            if(piece.getJoueur() == 2)
                pieces.add(piece);
        }
        return pieces;
    }

    // ----- REDÉFINIES -----

    // Méthode toString.
    public String toString() {
        String informations = new String();
        for (Piece piece : arene)
            informations += piece.getPosition() + " | " 
            + piece.getJoueur() + " | " 
            + piece.getPokemon() + "\n";
        return informations;
    }
}
