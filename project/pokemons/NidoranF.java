package pokemons;
// NidoranF.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class NidoranF extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public NidoranF() {
    this.num = 29;
    this.nom = "NidoranF";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 47;
    this.def = 52;
    this.vit = 41;
  }

  // Named:
  public NidoranF (String nom) {
    this.num = 29;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 47;
    this.def = 52;
    this.vit = 41;
  }
}