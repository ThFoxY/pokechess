package pokemons;
// Dardargnan.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dardargnan extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Dardargnan() {
    this.num = 15;
    this.nom = "Dardargnan";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 65;
    this.att = 80;
    this.def = 40;
    this.vit = 75;
  }

  // Named:
  public Dardargnan (String nom) {
    this.num = 15;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 65;
    this.att = 80;
    this.def = 40;
    this.vit = 75;
  }
}