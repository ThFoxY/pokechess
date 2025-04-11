package pokemons;
// Galopa.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Galopa extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Galopa() {
    this.num = 78;
    this.nom = "Galopa";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 100;
    this.def = 70;
    this.vit = 105;
  }

  // Named:
  public Galopa (String nom) {
    this.num = 78;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 100;
    this.def = 70;
    this.vit = 105;
  }
}