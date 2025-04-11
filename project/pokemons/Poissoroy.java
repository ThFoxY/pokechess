package pokemons;
// Poissoroy.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Poissoroy extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Poissoroy() {
    this.num = 119;
    this.nom = "Poissoroy";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 92;
    this.def = 65;
    this.vit = 68;
  }

  // Named:
  public Poissoroy (String nom) {
    this.num = 119;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 92;
    this.def = 65;
    this.vit = 68;
  }
}