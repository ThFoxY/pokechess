package pokemons;
// Otaria.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Otaria extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Otaria() {
    this.num = 86;
    this.nom = "Otaria";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 45;
    this.def = 55;
    this.vit = 45;
  }

  // Named:
  public Otaria (String nom) {
    this.num = 86;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 45;
    this.def = 55;
    this.vit = 45;
  }
}