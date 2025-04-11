package pokemons;
// Hypotrempe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Hypotrempe extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Hypotrempe() {
    this.num = 116;
    this.nom = "Hypotrempe";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 40;
    this.def = 70;
    this.vit = 60;
  }

  // Named:
  public Hypotrempe (String nom) {
    this.num = 116;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 40;
    this.def = 70;
    this.vit = 60;
  }
}