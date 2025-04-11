package pokemons;
// Carapuce.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Carapuce extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Carapuce() {
    this.num = 7;
    this.nom = "Carapuce";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 44;
    this.att = 48;
    this.def = 65;
    this.vit = 43;
  }

  // Named:
  public Carapuce (String nom) {
    this.num = 7;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 44;
    this.att = 48;
    this.def = 65;
    this.vit = 43;
  }
}