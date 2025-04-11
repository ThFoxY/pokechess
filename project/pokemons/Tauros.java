package pokemons;
// Tauros.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tauros extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tauros() {
    this.num = 128;
    this.nom = "Tauros";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 75;
    this.att = 100;
    this.def = 95;
    this.vit = 110;
  }

  // Named:
  public Tauros (String nom) {
    this.num = 128;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 75;
    this.att = 100;
    this.def = 95;
    this.vit = 110;
  }
}