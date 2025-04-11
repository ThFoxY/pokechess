package pokemons;
// Lamantine.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Lamantine extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Lamantine() {
    this.num = 87;
    this.nom = "Lamantine";
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 90;
    this.att = 70;
    this.def = 80;
    this.vit = 70;
  }

  // Named:
  public Lamantine (String nom) {
    this.num = 87;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 90;
    this.att = 70;
    this.def = 80;
    this.vit = 70;
  }
}