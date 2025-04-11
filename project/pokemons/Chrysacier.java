package pokemons;
// Chrysacier.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Chrysacier extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Chrysacier() {
    this.num = 11;
    this.nom = "Chrysacier";
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 20;
    this.def = 55;
    this.vit = 30;
  }

  // Named:
  public Chrysacier (String nom) {
    this.num = 11;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 20;
    this.def = 55;
    this.vit = 30;
  }
}