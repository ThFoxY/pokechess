package pokemons;
// Kabuto.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kabuto extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Kabuto() {
    this.num = 140;
    this.nom = "Kabuto";
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 30;
    this.att = 80;
    this.def = 90;
    this.vit = 55;
  }

  // Named:
  public Kabuto (String nom) {
    this.num = 140;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 30;
    this.att = 80;
    this.def = 90;
    this.vit = 55;
  }
}