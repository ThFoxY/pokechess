package pokemons;
// Kadabra.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kadabra extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Kadabra() {
    this.num = 64;
    this.nom = "Kadabra";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 105;
  }

  // Named:
  public Kadabra (String nom) {
    this.num = 64;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 105;
  }
}