package pokemons;
// Krabby.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Krabby extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Krabby() {
    this.num = 98;
    this.nom = "Krabby";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 105;
    this.def = 90;
    this.vit = 50;
  }

  // Named:
  public Krabby (String nom) {
    this.num = 98;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 105;
    this.def = 90;
    this.vit = 50;
  }
}