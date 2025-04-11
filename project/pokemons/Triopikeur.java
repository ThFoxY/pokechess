package pokemons;
// Triopikeur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Triopikeur extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Triopikeur() {
    this.num = 51;
    this.nom = "Triopikeur";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 80;
    this.def = 50;
    this.vit = 120;
  }

  // Named:
  public Triopikeur (String nom) {
    this.num = 51;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 80;
    this.def = 50;
    this.vit = 120;
  }
}