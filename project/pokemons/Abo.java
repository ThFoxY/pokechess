package pokemons;
// Abo.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Abo extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Abo() {
    this.num = 23;
    this.nom = "Abo";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 60;
    this.def = 44;
    this.vit = 55;
  }

  // Named:
  public Abo (String nom) {
    this.num = 23;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 60;
    this.def = 44;
    this.vit = 55;
  }
}