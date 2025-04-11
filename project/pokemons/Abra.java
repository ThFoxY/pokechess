package pokemons;
// Abra.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Abra extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Abra() {
    this.num = 63;
    this.nom = "Abra";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 25;
    this.att = 20;
    this.def = 15;
    this.vit = 90;
  }

  // Named:
  public Abra (String nom) {
    this.num = 63;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 25;
    this.att = 20;
    this.def = 15;
    this.vit = 90;
  }
}