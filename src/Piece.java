// Piece.java
// David MELOCCO (TD2 / TPC)

import pokemons.*;
import java.util.ArrayList;

/**
 * Création d'une pièce.
 */
public class Piece {
// Attributs :
    private Pokemon pokemon;
    private int joueur;
    private Position position;

// Constructeurs :
    /**
     * Par défaut.
     */
    public Piece() {
        this.pokemon = new Pikachu();
        this.joueur = 1;
        this.position = new Position("A1");
    }

    /**
     * Par copie.
     * @param piece
     */
    public Piece(Piece piece) {
        this.pokemon = piece.pokemon;
        this.joueur = piece.joueur;
        this.position = new Position(piece.position);
    }

    /**
     * Selon un pokémon, un joueur et des coordonnées x et y.
     * @param pokemon
     * @param joueur
     * @param x
     * @param y
     */
    public Piece(Pokemon pokemon, int joueur, int x, int y) {
        // Erreur :
        if (
            (pokemon == null) || 
            (joueur < 0 || joueur > 2) || 
            (x < 0 || x > 8) || 
            (y < 0 || y > 8)) {
            System.out.println("Oups ! Mauvaise manipulation.");
            System.exit(1);
        }

        this.pokemon = pokemon;
        this.joueur = joueur;
        this.position = new Position(x, y);
    }

    /**
     * Selon un pokémon, un joueur et une position.
     * @param pokemon
     * @param joueur
     * @param position
     */
    public Piece(Pokemon pokemon, int joueur, Position position) {
        // Erreur :
        if (
            (pokemon == null) || 
            (joueur < 0 || joueur > 2) || 
            (position == null)) {
            System.out.println("Oups ! Mauvaise manipulation.");
            System.exit(1);
        }

        this.pokemon = pokemon;
        this.joueur = joueur;
        this.position = new Position(position);
    }

    /**
     * Selon un pokémon, un joueur et une case de l'échiquier.
     * @param pokemon
     * @param joueur
     * @param case
     */
    public Piece(Pokemon pokemon, int joueur, String position) {
        // Erreur :
        if (
            (pokemon == null) || 
            (joueur < 0 || joueur > 2) || 
            (position == null)) {
            System.out.println("Oups ! Mauvaise manipulation.");
            System.exit(1);
        }

        this.pokemon = pokemon;
        this.joueur = joueur;
        this.position = new Position(position);
    }

// Méthodes :
    // ----- GETTERS -----

    /**
     * Renvoie le type de pokémon d'une pièce.
     * @return un objet de type Pokemon.
     */
    public Pokemon getPokemon() { return this.pokemon; }

    /**
     * Renvoie le joueur d'une pièce.
     * @return un entier pour le joueur (1 ou 2).
     */
    public int getJoueur() { return this.joueur; }

    /**
     * Renvoie la position d'une pièce.
     * @return un objet de type Position.
     */
    public Position getPosition() { return this.position; }

    /**
     * Renvoie les déplacements possibles d'une pièce sur l'échiquier.
     * Principe : avec deux boucles imbriquées, on vérifie les cases aux alentours de la pièce.
     * ! Méthode abstraite si les déplacements possibles diffèrent entre les pokémon.
     * @param arene
     * @return une liste dynamique contenant des objets de type Position.
     */
    public ArrayList<Position> getDeplacementPossible(Plateau arene) {
        ArrayList<Position> deplacements = new ArrayList<>();
        int x = this.getPosition().getX();
        int y = this.getPosition().getY();
        
        for (int ligne = x - 1; ligne < x + 2; ligne++) {
            for (int colonne = y - 1; colonne < y + 2; colonne++) {
                // Si la case existe :
                if (ligne >= 0 && ligne <= 8 && colonne >= 0 && colonne <= 8) {
                    Piece caseEnCours = arene.getCase(ligne, colonne);

                    // Si la case ne contient pas de pokémon :
                    if (caseEnCours == null)
                        // Ajout de la position dans la liste des déplacements possibles de la pièce.
                        deplacements.add(new Position(ligne, colonne));
                }
            }
        }
        return deplacements;
    }

    /**
     * Renvoie les confrontations possibles d'une pièce sur l'échiquier.
     * Principe : avec deux boucles imbriquées, on vérifie les cases aux alentours de la pièce.
     * ! Méthode abstraite si les déplacements possibles diffèrent entre les pokémon.
     * @param arene
     * @return une liste dynamique contenant des objets de type Position.
     */
    public ArrayList<Position> getAttaquePossible(Plateau arene) {
        ArrayList<Position> confrontations = new ArrayList<>();
        int x = this.getPosition().getX();
        int y = this.getPosition().getY();
        
        for (int ligne = x - 1; ligne < x + 2; ligne++) {
            for (int colonne = y - 1; colonne < y + 2; colonne++) {
                // Si la case existe :
                if (ligne >= 0 && ligne <= 8 && colonne >= 0 && colonne <= 8) {
                    Piece caseEnCours = arene.getCase(ligne, colonne);

                    // Si la case contient un pokémon :
                    if (caseEnCours != null && caseEnCours.getJoueur() != this.joueur)
                        // Ajout de la position du pokémon à confronter dans la liste des confrontations possibles.
                        confrontations.add(arene.getCase(ligne, colonne).getPosition());
                }
            }
        }
        return confrontations;
    }

    // ----- SETTERS -----

    /**
     * Met à jour la position d'une pièce selon des coordonnées x et y.
     * @param x
     * @param y
     */
    public void setPosition(int x, int y) { this.position = new Position(x, y); }

    /**
     * Met à jour la position d'une pièce selon une position.
     * @param position
     */
    public void setPosition(Position position) { this.position = new Position(position); }

    /**
     * Met à jour la position d'une pièce selon un case de l'échiquier.
     * @param position
     */
    public void setPosition(String position) { this.position = new Position(position); }

    // ----- REDÉFINIES -----

    /**
     * Méthode equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        
        Piece piece = (Piece) o;
        return (
            (this.pokemon.equals(piece.pokemon)) &&
            (this.joueur == piece.joueur) && 
            (this.position.equals(piece.position)));
    }

    /**
     * Méthode toString.
     */
    @Override
    public String toString() {
        return new String(
            this.getPokemon().getEspece() + " du joueur " + 
            this.getJoueur() + " en " + 
            this.getPosition());
    }
}