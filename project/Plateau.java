import java.util.ArrayList;
import pokemons.*;

// Plateau.java
// David MELOCCO (TD2 / TPC)

/**
 * Creates an arena with pokemons.
 */
public class Plateau {
    private ArrayList<Piece> arena;

// Constructors:
    /**
     * Default:
    */
    public Plateau() {
        this.arena = new ArrayList<Piece>(81);
        // Player:
            // First row:
            arena.add(new Piece(new Salameche(), 1, "A1"));
            arena.add(new Piece(new Carapuce(), 1, "B1"));
            arena.add(new Piece(new Bulbizarre(), 1, "C1"));
            
            arena.add(new Piece(new Sulfura(), 1, "D1"));
            arena.add(new Piece(new Mewtwo(), 1, "E1"));
            arena.add(new Piece(new Electhor(), 1, "F1"));

            arena.add(new Piece(new Bulbizarre(), 1, "G1"));
            arena.add(new Piece(new Carapuce(), 1, "H1"));
            arena.add(new Piece(new Salameche(), 1, "I1"));

            // Second row:
            arena.add(new Piece(new Reptincel(), 1, "A2"));
            arena.add(new Piece(new Carabaffe(), 1, "B2"));
            arena.add(new Piece(new Herbizarre(), 1, "C2"));
            
            arena.add(new Piece(new Dracolosse(), 1, "D2"));
            arena.add(new Piece(new Artikodin(), 1, "E2"));
            arena.add(new Piece(new Dracolosse(), 1, "F2"));

            arena.add(new Piece(new Herbizarre(), 1, "G2"));
            arena.add(new Piece(new Carabaffe(), 1, "H2"));
            arena.add(new Piece(new Reptincel(), 1, "I2"));

            // Third row:
            arena.add(new Piece(new Dracaufeu(), 1, "D3"));
            arena.add(new Piece(new Tortank(), 1, "E3"));
            arena.add(new Piece(new Florizarre(), 1, "F3"));
        
        // Opponent:
            // First row:
            arena.add(new Piece(new Salameche(), 2, "A9"));
            arena.add(new Piece(new Carapuce(), 2, "B9"));
            arena.add(new Piece(new Bulbizarre(), 2, "C9"));
            
            arena.add(new Piece(new Sulfura(), 2, "D9"));
            arena.add(new Piece(new Mewtwo(), 2, "E9"));
            arena.add(new Piece(new Electhor(), 2, "F9"));

            arena.add(new Piece(new Bulbizarre(), 2, "G9"));
            arena.add(new Piece(new Carapuce(), 2, "H9"));
            arena.add(new Piece(new Salameche(), 2, "I9"));

            // Second row:
            arena.add(new Piece(new Reptincel(), 2, "A8"));
            arena.add(new Piece(new Carabaffe(), 2, "B8"));
            arena.add(new Piece(new Herbizarre(), 2, "C8"));
            
            arena.add(new Piece(new Dracolosse(), 2, "D8"));
            arena.add(new Piece(new Artikodin(), 2, "E8"));
            arena.add(new Piece(new Dracolosse(), 2, "F8"));

            arena.add(new Piece(new Herbizarre(), 2, "G8"));
            arena.add(new Piece(new Carabaffe(), 2, "H8"));
            arena.add(new Piece(new Reptincel(), 2, "I8"));

            // Third row:
            arena.add(new Piece(new Florizarre(), 2, "D7"));
            arena.add(new Piece(new Tortank(), 2, "E7"));
            arena.add(new Piece(new Dracaufeu(), 2, "F7"));
    }

// Getters:
    /**
     * Returns all the Pokémons in the arena.
     * @return a dynamic array containing each pieces.
     */
    public ArrayList<Piece> getArena() {
        return this.arena;
    }

// Methods:
    /**
     * Returns the piece at the specified position: with x and y
     * @param xPos x value of a position
     * @param yPos y value of a position
     * @return a Pokémon (if there is one at the specified position) otherwise 'null').
     */
    public Piece getCase(int xPos, int yPos) {
        for (Piece pokemon : arena) {
            if(pokemon.getPosition().equals(new Position(xPos, yPos))) {
                return pokemon;
            }
        }
        return null;
    }

    /**
     * Returns the piece at the specified position: with a Position objet.
     * @param pos a Position objet.
     * @return a Pokémon (if there is one at the specified position otherwise 'null').
     */
    public Piece getCase(Position pos) {
        return this.getCase(pos.getX(), pos.getY());
    }

    /**
     * Returns the piece at the specified position: with letter format.
     * @param pos a position in letter format.
     * @return a Pokémon (if there is one at the specified position otherwise 'null').
     */
    public Piece getCase(String pos) {
        return this.getCase(new Position(pos));
    }

    /**
     * Returns all the pieces of the player.
     * @return a dynamic array of all the pieces.
     */
    public ArrayList<Piece> getPiecesJoueur1() {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece pokemon : arena) {
            if(pokemon.getPlayer() == 1) {
                pieces.add(pokemon);
            }
        }
        return pieces;
    }

    /**
     * Returns all the pieces of the opponent.
     * @return a dynamic array of all the pieces.
     */
    public ArrayList<Piece> getPiecesJoueur2() {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece pokemon : arena) {
            if(pokemon.getPlayer() == 2) {
                pieces.add(pokemon);
            }
        }
        return pieces;
    }

    // toString method:
    public String toString() {
        String data = new String();
        for (Piece pokemon : arena) {
            data += pokemon.getPosition() + " | " + pokemon.getPlayer() + " | " + pokemon.getPokemon() + "\n";
        }
        return data;
    }
}
