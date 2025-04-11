package pokemons;
// Elektek.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Elektek extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Elektek() {
    this.num = 125;
    this.nom = "Elektek";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 83;
    this.def = 57;
    this.vit = 105;
  }

  // Named:
  public Elektek (String nom) {
    this.num = 125;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 83;
    this.def = 57;
    this.vit = 105;
  }
}