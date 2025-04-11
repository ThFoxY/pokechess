package pokemons;
// Ronflex.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ronflex extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Ronflex() {
    this.num = 143;
    this.nom = "Ronflex";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 160;
    this.att = 110;
    this.def = 65;
    this.vit = 30;
  }

  // Named:
  public Ronflex (String nom) {
    this.num = 143;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 160;
    this.att = 110;
    this.def = 65;
    this.vit = 30;
  }
}