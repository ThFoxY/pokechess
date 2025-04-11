package pokemons;
// Akwakwak.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Akwakwak extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Akwakwak() {
    this.num = 55;
    this.nom = "Akwakwak";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 82;
    this.def = 78;
    this.vit = 85;
  }

  // Named:
  public Akwakwak (String nom) {
    this.num = 55;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 82;
    this.def = 78;
    this.vit = 85;
  }
}