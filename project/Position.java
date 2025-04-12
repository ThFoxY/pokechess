// Position.java
// David MELOCCO (TD2 / TPC)

/**
 * Création d'une position.
 */
public class Position {
// Attributs :
    private int x, y;

// Constructeurs :
    /**
     * Par défaut.
     */
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Par copie.
     * @param position
     */
    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
    }

    /**
     * Selon des coordonnées x et y.
     * @param posX
     * @param posY
     */
    public Position(int x, int y) {
        // Erreur :
        if(x < 0 || x > 8 || y < 0 || y > 8) {
            System.out.println("Oups ! Mauvaise manipulation.");
            System.exit(1);
        }
        this.x = x;
        this.y = y;
    }

    /**
     * Selon une case de l'échiquier.
     * Principe : on sélectionne les caractères individuellement, on les soustrait par la valeur ASCII minimale (sur l'échiquier) et on les convertit en entier.
     * @param position
     */
    public Position(String position) {
        //! Vérifier en cas d'erreur.
        this.x = (int) (position.charAt(0) - 'A');
        this.y = (int) (position.charAt(1) - '1');
    }

// Méthode :
    // ----- GETTERS -----

    /**
     * Renvoie la coordonnée x d'une position.
     * @return un entier.
     */
    public int getX() { return this.x; }

    /**
     * Renvoie la coordonnée y d'une position.
     * @return un entier.
     */
    public int getY() { return this.y; }

    // ----- SETTERS -----

    /**
     * Met à jour la coordonnée x d'une position.
     * @param x
     */
    public void setX(int x) {
        // Erreur :
        if(x < 0 || x > 8) {
            System.out.println("Oups ! Mauvaise manipulation.");
            System.exit(1);
        }
        this.x = x;
    }

    /**
     * Met à jour la coordonnée y d'une position.
     * @param y
     */
    public void setY(int y) {
        // Erreur :
        if(y < 0 ||y > 8) {
            System.out.println("Oups ! Mauvaise manipulation.");
            System.exit(1);
        }
        this.y = y;
    }

    // ----- REDÉFINIES -----
    
    /**
     * Méthode equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;
        return (
            (this.x == position.x) && 
            (this.y == position.y));
    }

    /**
     * Méthode toString.
     */
    @Override
    public String toString() {
        // Opération inverse.
        return (char) (this.x + 'A') + "" + (y + 1);
    }
}
