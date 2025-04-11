package pokemons;
// Raichu.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Raichu extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Raichu() {
    this.num = 26;
    this.nom = "Raichu";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 90;
    this.def = 55;
    this.vit = 100;
  }

  // Named:
  public Raichu (String nom) {
    this.num = 26;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 90;
    this.def = 55;
    this.vit = 100;
  }
}