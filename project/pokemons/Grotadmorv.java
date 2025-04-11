package pokemons;
// Grotadmorv.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Grotadmorv extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Grotadmorv() {
    this.num = 89;
    this.nom = "Grotadmorv";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 105;
    this.def = 75;
    this.vit = 50;
  }

  // Named:
  public Grotadmorv (String nom) {
    this.num = 89;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 105;
    this.def = 75;
    this.vit = 50;
  }
}