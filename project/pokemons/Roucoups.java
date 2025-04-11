package pokemons;
// Roucoups.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Roucoups extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Roucoups() {
    this.num = 17;
    this.nom = "Roucoups";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 63;
    this.att = 60;
    this.def = 55;
    this.vit = 71;
  }

  // Named:
  public Roucoups (String nom) {
    this.num = 17;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 63;
    this.att = 60;
    this.def = 55;
    this.vit = 71;
  }
}