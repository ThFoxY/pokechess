package pokemons;
// Artikodin.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Artikodin extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Artikodin() {
    this.num = 144;
    this.nom = "Artikodin";
    this.type1 = Type.GLACE;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 85;
    this.def = 100;
    this.vit = 85;
  }

  // Named:
  public Artikodin (String nom) {
    this.num = 144;
    this.nom = nom;
    this.type1 = Type.GLACE;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 85;
    this.def = 100;
    this.vit = 85;
  }
}