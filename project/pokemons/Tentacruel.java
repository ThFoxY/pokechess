package pokemons;
// Tentacruel.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tentacruel extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tentacruel() {
    this.num = 73;
    this.nom = "Tentacruel";
    this.type1 = Type.EAU;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 70;
    this.def = 65;
    this.vit = 100;
  }

  // Named:
  public Tentacruel (String nom) {
    this.num = 73;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 70;
    this.def = 65;
    this.vit = 100;
  }
}