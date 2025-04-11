package pokemons;
// Fantominus.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Fantominus extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Fantominus() {
    this.num = 92;
    this.nom = "Fantominus";
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 30;
    this.att = 35;
    this.def = 30;
    this.vit = 80;
  }

  // Named:
  public Fantominus (String nom) {
    this.num = 92;
    this.nom = nom;
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 30;
    this.att = 35;
    this.def = 30;
    this.vit = 80;
  }
}