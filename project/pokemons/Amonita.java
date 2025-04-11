package pokemons;
// Amonita.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Amonita extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Amonita() {
    this.num = 138;
    this.nom = "Amonita";
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 35;
    this.att = 40;
    this.def = 100;
    this.vit = 35;
  }

  // Named:
  public Amonita (String nom) {
    this.num = 138;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 35;
    this.att = 40;
    this.def = 100;
    this.vit = 35;
  }
}