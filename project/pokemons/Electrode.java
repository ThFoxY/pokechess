package pokemons;
// Electrode.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Electrode extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Electrode() {
    this.num = 101;
    this.nom = "Electrode";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 50;
    this.def = 70;
    this.vit = 140;
  }

  // Named:
  public Electrode (String nom) {
    this.num = 101;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 50;
    this.def = 70;
    this.vit = 140;
  }
}