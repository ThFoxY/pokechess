package pokemons;
// Leviator.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Leviator extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Leviator() {
    this.num = 130;
    this.nom = "Leviator";
    this.type1 = Type.EAU;
    this.type2 = Type.VOL;
    this.pv = 95;
    this.att = 125;
    this.def = 79;
    this.vit = 81;
  }

  // Named:
  public Leviator (String nom) {
    this.num = 130;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.VOL;
    this.pv = 95;
    this.att = 125;
    this.def = 79;
    this.vit = 81;
  }
}