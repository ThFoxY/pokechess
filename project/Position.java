// Position.java
// David MELOCCO (TD2 / TPC)

public class Position {
    private int x, y;

// Constructors:
    // Default: sets x and y to 0
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    // Copy: takes a Position objet as a parameter
    public Position(Position pos) {
        this.x = pos.x;
        this.y = pos.y;
    }

    // Two integers: takes two integers for x and y
    public Position(int posX, int posY) {
        // Error case:
        if(posX < 0 || posX > 8 || posY < 0 || posY > 8) {
            System.out.println("Oops, wrong values!");
            System.exit(1);
        }
        this.x = posX;
        this.y = posY;
    }

    // String: takes a position in letter format:
    public Position(String posCode) {
        this.x = (int) (posCode.charAt(0) - 'A');
        this.y = (int) (posCode.charAt(1) - '1');
    }

// Getters:
    // Gets x:
    public int getX() {
        return this.x;
    }

    // Gets y:
    public int getY() {
        return this.y;
    }

// Setters:
    // Sets x:
    public void setX(int posX) {
        if(posX < 0 || posX > 8) {
            System.out.println("Oops, wrong value!");
            System.exit(1);
        }
        this.x = posX;
    }

    // Sets y:
    public void setY(int posY) {
        if(posY < 0 ||posY > 8) {
            System.out.println("Oops, wrong value!");
            System.exit(1);
        }
        this.y = posY;
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
        Position position = (Position) obj;
        return (this.x == position.x && this.y == position.y);
    }

    // toString method:
    @Override
    public String toString() {
        return (char)(this.x + 'A') + "" + (y + 1);
    }
}
