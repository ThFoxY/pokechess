package pokemons;
// Carabaffe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Carabaffe extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Carabaffe() {
    this.num = 8;
    this.nom = "Carabaffe";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 59;
    this.att = 63;
    this.def = 80;
    this.vit = 58;
  }

  // Named:
  public Carabaffe (String nom) {
    this.num = 8;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 59;
    this.att = 63;
    this.def = 80;
    this.vit = 58;
  }
}