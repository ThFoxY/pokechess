package pokemons;
// Aquali.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Aquali extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Aquali() {
    this.num = 134;
    this.nom = "Aquali";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 130;
    this.att = 65;
    this.def = 60;
    this.vit = 65;
  }

  // Named:
  public Aquali (String nom) {
    this.num = 134;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 130;
    this.att = 65;
    this.def = 60;
    this.vit = 65;
  }
}