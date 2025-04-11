package pokemons;
// Hypnomade.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Hypnomade extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Hypnomade() {
    this.num = 97;
    this.nom = "Hypnomade";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 85;
    this.att = 73;
    this.def = 70;
    this.vit = 67;
  }

  // Named:
  public Hypnomade (String nom) {
    this.num = 97;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 85;
    this.att = 73;
    this.def = 70;
    this.vit = 67;
  }
}