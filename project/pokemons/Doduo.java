package pokemons;
// Doduo.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Doduo extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Doduo() {
    this.num = 84;
    this.nom = "Doduo";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 35;
    this.att = 85;
    this.def = 45;
    this.vit = 75;
  }

  // Named:
  public Doduo (String nom) {
    this.num = 84;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 35;
    this.att = 85;
    this.def = 45;
    this.vit = 75;
  }
}