package pokemons;
// Poissirene.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Poissirene extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Poissirene() {
    this.num = 118;
    this.nom = "Poissirene";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 45;
    this.att = 67;
    this.def = 60;
    this.vit = 63;
  }

  // Named:
  public Poissirene (String nom) {
    this.num = 118;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 45;
    this.att = 67;
    this.def = 60;
    this.vit = 63;
  }
}