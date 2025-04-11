package pokemons;
// Miaouss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Miaouss extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Miaouss() {
    this.num = 52;
    this.nom = "Miaouss";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 90;
  }

  // Named:
  public Miaouss (String nom) {
    this.num = 52;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 90;
  }
}