package pokemons;
// Nosferapti.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nosferapti extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Nosferapti() {
    this.num = 41;
    this.nom = "Nosferapti";
    this.type1 = Type.POISON;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 55;
  }

  // Named:
  public Nosferapti (String nom) {
    this.num = 41;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 55;
  }
}