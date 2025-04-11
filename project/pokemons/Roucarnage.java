package pokemons;
// Roucarnage.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Roucarnage extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Roucarnage() {
    this.num = 18;
    this.nom = "Roucarnage";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 83;
    this.att = 80;
    this.def = 75;
    this.vit = 91;
  }

  // Named:
  public Roucarnage (String nom) {
    this.num = 18;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 83;
    this.att = 80;
    this.def = 75;
    this.vit = 91;
  }
}