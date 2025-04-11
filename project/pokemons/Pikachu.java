package pokemons;
// Pikachu.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Pikachu extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Pikachu() {
    this.num = 25;
    this.nom = "Pikachu";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 55;
    this.def = 30;
    this.vit = 90;
  }

  // Named:
  public Pikachu (String nom) {
    this.num = 25;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 55;
    this.def = 30;
    this.vit = 90;
  }
}