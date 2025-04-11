import pokemons.*;
import java.util.ArrayList;

// Piece.java
// David MELOCCO (TD2 / TPC)

public class Piece {
    private Pokemon pokemon;
    private int player;
    private Position position;

// Constructors:
    // Default: sets a default Pokemon at A1.
    public Piece() {
        this.pokemon = new Pikachu();
        this.player = 1;
        this.position = new Position("A1");
    }

    // Copy: takes a Piece objet as a parameter
    public Piece(Piece piece) {
        this.pokemon = piece.pokemon;
        this.player = piece.player;
        this.position = piece.position;
    }

    // Numeric format:
    public Piece(Pokemon pokemon, int player, int posX, int posY) {
        if (player < 0 || player > 2 || posX < 0 || posX > 8 || posY < 0 || posX > 8) {
            System.out.println("Oops, wrong values! :3");
            System.exit(1);
        }
        this.pokemon = pokemon;
        this.player = player;
        this.position = new Position(posX, posY);
    }

    // Takes a Position object:
    public Piece(Pokemon pokemon, int player, Position position) {
        if (player < 0 || player > 2) {
            System.out.println("Oops, wrong values! :3");
            System.exit(1);
        }
        this.pokemon = pokemon;
        this.player = player;
        this.position = position;
    }

    // Letter format:
    public Piece(Pokemon pokemon, int player, String position) {
        if (player < 0 || player > 2) {
            System.out.println("Oops, wrong values! :3");
            System.exit(1);
        }
        this.pokemon = pokemon;
        this.player = player;
        this.position = new Position(position);
    }

// Getters:
    // Returns position:
    public Position getPosition() {
        return this.position;
    }

    // Returns player (1 or 2):
    public int getPlayer() {
        return this.player;
    }

    // Returns Pokemon:
    public Pokemon getPokemon() {
        return this.pokemon;
    }

    // Checks if the Pokémon can move:
    public ArrayList<Position> getDeplacementPossible(Plateau p) {
        ArrayList<Position> moves = new ArrayList<>();
        int piecePosX = this.getPosition().getX();
        int piecePosY = this.getPosition().getY();
        
        for (int x = piecePosX - 1; x < piecePosX + 2; x++) {
            for (int y = piecePosY - 1; y < piecePosY + 2; y++) {
                if (x >= 0 && x <= 8 && y >= 0 && y <= 8) {
                    if (p.getCase(x, y) == null) {
                        moves.add(new Position(x, y));
                    }
                }
            }
        }
        return moves;
    }

    public ArrayList<Position> getAttaquePossible(Plateau p) {
        ArrayList<Position> attacks = new ArrayList<>();
        int piecePosX = this.getPosition().getX();
        int piecePosY = this.getPosition().getY();
        
        for (int x = piecePosX - 1; x < piecePosX + 2; x++) {
            for (int y = piecePosY - 1; y < piecePosY + 2; y++) {
                if (x >= 0 && x <= 8 && y >= 0 && y <= 8) {
                    if (p.getCase(x, y) != null) {
                        attacks.add(p.getCase(x, y).getPosition());
                    }
                }
            }
        }
        return attacks;
    }

// Methods:
    // equals method:
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Piece piece = (Piece) obj;
        return (this.position.equals(piece.position));
    }

    // toString method:
    @Override
    public String toString() {
        return new String(this.getPokemon() + " of player " + this.getPlayer() + " at " + this.getPosition());
    }
}
