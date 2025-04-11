package pokemons;
// Salameche.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Salameche extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Salameche() {
    this.num = 4;
    this.nom = "Salameche";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 39;
    this.att = 52;
    this.def = 43;
    this.vit = 65;
  }

  // Named:
  public Salameche (String nom) {
    this.num = 4;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 39;
    this.att = 52;
    this.def = 43;
    this.vit = 65;
  }
}