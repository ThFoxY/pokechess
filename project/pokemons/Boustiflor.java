package pokemons;
// Boustiflor.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Boustiflor extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Boustiflor() {
    this.num = 70;
    this.nom = "Boustiflor";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 65;
    this.att = 90;
    this.def = 50;
    this.vit = 55;
  }

  // Named:
  public Boustiflor (String nom) {
    this.num = 70;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 65;
    this.att = 90;
    this.def = 50;
    this.vit = 55;
  }
}