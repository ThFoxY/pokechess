package pokemons;
// Tartard.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tartard extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tartard() {
    this.num = 62;
    this.nom = "Tartard";
    this.type1 = Type.EAU;
    this.type2 = Type.COMBAT;
    this.pv = 90;
    this.att = 85;
    this.def = 95;
    this.vit = 70;
  }

  // Named:
  public Tartard (String nom) {
    this.num = 62;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.COMBAT;
    this.pv = 90;
    this.att = 85;
    this.def = 95;
    this.vit = 70;
  }
}