package pokemons;
// Chenipan.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Chenipan extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Chenipan() {
    this.num = 10;
    this.nom = "Chenipan";
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 45;
    this.att = 30;
    this.def = 35;
    this.vit = 45;
  }

  // Named:
  public Chenipan (String nom) {
    this.num = 10;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 45;
    this.att = 30;
    this.def = 35;
    this.vit = 45;
  }
}