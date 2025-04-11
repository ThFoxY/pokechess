package pokemons;
// Pyroli.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Pyroli extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Pyroli() {
    this.num = 136;
    this.nom = "Pyroli";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 130;
    this.def = 60;
    this.vit = 65;
  }

  // Named:
  public Pyroli (String nom) {
    this.num = 136;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 130;
    this.def = 60;
    this.vit = 65;
  }
}