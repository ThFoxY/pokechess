package pokemons;
// Dodrio.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dodrio extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Dodrio() {
    this.num = 85;
    this.nom = "Dodrio";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 110;
    this.def = 70;
    this.vit = 100;
  }

  // Named:
  public Dodrio (String nom) {
    this.num = 85;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 110;
    this.def = 70;
    this.vit = 100;
  }
}