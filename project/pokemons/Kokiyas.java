package pokemons;
// Kokiyas.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kokiyas extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Kokiyas() {
    this.num = 90;
    this.nom = "Kokiyas";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 65;
    this.def = 100;
    this.vit = 40;
  }

  // Named:
  public Kokiyas (String nom) {
    this.num = 90;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 65;
    this.def = 100;
    this.vit = 40;
  }
}