package pokemons;
// Amonistar.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Amonistar extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Amonistar() {
    this.num = 139;
    this.nom = "Amonistar";
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 70;
    this.att = 60;
    this.def = 125;
    this.vit = 55;
  }

  // Named:
  public Amonistar (String nom) {
    this.num = 139;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 70;
    this.att = 60;
    this.def = 125;
    this.vit = 55;
  }
}