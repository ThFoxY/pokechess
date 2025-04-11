package pokemons;
// Aspicot.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Aspicot extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Aspicot() {
    this.num = 13;
    this.nom = "Aspicot";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 50;
  }

  // Named:
  public Aspicot (String nom) {
    this.num = 13;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 50;
  }
}