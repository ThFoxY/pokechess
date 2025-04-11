package pokemons;
// Florizarre.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Florizarre extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Florizarre() {
    this.num = 3;
    this.nom = "Florizarre";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 82;
    this.def = 83;
    this.vit = 80;
  }

  // Named:
  public Florizarre (String nom) {
    this.num = 3;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 82;
    this.def = 83;
    this.vit = 80;
  }
}