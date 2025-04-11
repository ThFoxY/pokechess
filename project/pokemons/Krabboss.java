package pokemons;
// Krabboss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Krabboss extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Krabboss() {
    this.num = 99;
    this.nom = "Krabboss";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 130;
    this.def = 115;
    this.vit = 75;
  }

  // Named:
  public Krabboss (String nom) {
    this.num = 99;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 130;
    this.def = 115;
    this.vit = 75;
  }
}