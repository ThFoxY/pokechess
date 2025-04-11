package pokemons;
// Saquedeneu.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Saquedeneu extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Saquedeneu() {
    this.num = 114;
    this.nom = "Saquedeneu";
    this.type1 = Type.PLANTE;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 55;
    this.def = 115;
    this.vit = 60;
  }

  // Named:
  public Saquedeneu (String nom) {
    this.num = 114;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 55;
    this.def = 115;
    this.vit = 60;
  }
}