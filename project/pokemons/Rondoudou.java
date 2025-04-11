package pokemons;
// Rondoudou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rondoudou extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Rondoudou() {
    this.num = 39;
    this.nom = "Rondoudou";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 115;
    this.att = 45;
    this.def = 20;
    this.vit = 20;
  }

  // Named:
  public Rondoudou (String nom) {
    this.num = 39;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 115;
    this.att = 45;
    this.def = 20;
    this.vit = 20;
  }
}