package pokemons;
// Stari.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Stari extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Stari() {
    this.num = 120;
    this.nom = "Stari";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 45;
    this.def = 55;
    this.vit = 85;
  }

  // Named:
  public Stari (String nom) {
    this.num = 120;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 45;
    this.def = 55;
    this.vit = 85;
  }
}