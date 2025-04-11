package pokemons;
// Ptitard.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ptitard extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Ptitard() {
    this.num = 60;
    this.nom = "Ptitard";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 50;
    this.def = 40;
    this.vit = 90;
  }

  // Named:
  public Ptitard (String nom) {
    this.num = 60;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 50;
    this.def = 40;
    this.vit = 90;
  }
}