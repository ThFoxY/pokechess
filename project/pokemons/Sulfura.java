package pokemons;
// Sulfura.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Sulfura extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Sulfura() {
    this.num = 146;
    this.nom = "Sulfura";
    this.type1 = Type.FEU;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 100;
    this.def = 90;
    this.vit = 90;
  }

  // Named:
  public Sulfura (String nom) {
    this.num = 146;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 100;
    this.def = 90;
    this.vit = 90;
  }
}