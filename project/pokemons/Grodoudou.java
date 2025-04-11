package pokemons;
// Grodoudou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Grodoudou extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Grodoudou() {
    this.num = 40;
    this.nom = "Grodoudou";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 140;
    this.att = 70;
    this.def = 45;
    this.vit = 45;
  }

  // Named:
  public Grodoudou (String nom) {
    this.num = 40;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 140;
    this.att = 70;
    this.def = 45;
    this.vit = 45;
  }
}