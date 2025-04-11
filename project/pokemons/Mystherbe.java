package pokemons;
// Mystherbe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Mystherbe extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Mystherbe() {
    this.num = 43;
    this.nom = "Mystherbe";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 50;
    this.def = 55;
    this.vit = 30;
  }

  // Named:
  public Mystherbe (String nom) {
    this.num = 43;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 50;
    this.def = 55;
    this.vit = 30;
  }
}