package pokemons;
// Bulbizarre.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Bulbizarre extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Bulbizarre() {
    this.num = 1;
    this.nom = "Bulbizarre";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 49;
    this.def = 49;
    this.vit = 45;
  }

  // Named:
  public Bulbizarre (String nom) {
    this.num = 1;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 49;
    this.def = 49;
    this.vit = 45;
  }
}