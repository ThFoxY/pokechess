package pokemons;
// Herbizarre.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Herbizarre extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Herbizarre() {
    this.num = 2;
    this.nom = "Herbizarre";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 62;
    this.def = 63;
    this.vit = 60;
  }

  // Named:
  public Herbizarre (String nom) {
    this.num = 2;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 62;
    this.def = 63;
    this.vit = 60;
  }
}