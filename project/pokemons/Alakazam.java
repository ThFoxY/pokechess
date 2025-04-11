package pokemons;
// Alakazam.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Alakazam extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Alakazam() {
    this.num = 65;
    this.nom = "Alakazam";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 50;
    this.def = 45;
    this.vit = 120;
  }

  // Named:
  public Alakazam (String nom) {
    this.num = 65;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 50;
    this.def = 45;
    this.vit = 120;
  }
}