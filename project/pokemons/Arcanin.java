package pokemons;
// Arcanin.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Arcanin extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Arcanin() {
    this.num = 59;
    this.nom = "Arcanin";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 110;
    this.def = 80;
    this.vit = 95;
  }

  // Named:
  public Arcanin (String nom) {
    this.num = 59;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 110;
    this.def = 80;
    this.vit = 95;
  }
}