package pokemons;
// Rafflesia.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rafflesia extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Rafflesia() {
    this.num = 45;
    this.nom = "Rafflesia";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 75;
    this.att = 80;
    this.def = 85;
    this.vit = 50;
  }

  // Named:
  public Rafflesia (String nom) {
    this.num = 45;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 75;
    this.att = 80;
    this.def = 85;
    this.vit = 50;
  }
}