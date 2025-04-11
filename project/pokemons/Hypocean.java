package pokemons;
// Hypocean.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Hypocean extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Hypocean() {
    this.num = 117;
    this.nom = "Hypocean";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 65;
    this.def = 95;
    this.vit = 85;
  }

  // Named:
  public Hypocean (String nom) {
    this.num = 117;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 65;
    this.def = 95;
    this.vit = 85;
  }
}