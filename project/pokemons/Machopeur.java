package pokemons;
// Machopeur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Machopeur extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Machopeur() {
    this.num = 67;
    this.nom = "Machopeur";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 100;
    this.def = 70;
    this.vit = 45;
  }

  // Named:
  public Machopeur (String nom) {
    this.num = 67;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 100;
    this.def = 70;
    this.vit = 45;
  }
}