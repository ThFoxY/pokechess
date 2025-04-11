package pokemons;
// Tortank.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tortank extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tortank() {
    this.num = 9;
    this.nom = "Tortank";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 79;
    this.att = 83;
    this.def = 100;
    this.vit = 78;
  }

  // Named:
  public Tortank (String nom) {
    this.num = 9;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 79;
    this.att = 83;
    this.def = 100;
    this.vit = 78;
  }
}