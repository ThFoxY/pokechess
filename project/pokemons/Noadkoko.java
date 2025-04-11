package pokemons;
// Noadkoko.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Noadkoko extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Noadkoko() {
    this.num = 103;
    this.nom = "Noadkoko";
    this.type1 = Type.PLANTE;
    this.type2 = Type.PSY;
    this.pv = 95;
    this.att = 95;
    this.def = 85;
    this.vit = 55;
  }

  // Named:
  public Noadkoko (String nom) {
    this.num = 103;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.PSY;
    this.pv = 95;
    this.att = 95;
    this.def = 85;
    this.vit = 55;
  }
}