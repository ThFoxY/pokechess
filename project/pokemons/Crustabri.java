package pokemons;
// Crustabri.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Crustabri extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Crustabri() {
    this.num = 91;
    this.nom = "Crustabri";
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 50;
    this.att = 95;
    this.def = 180;
    this.vit = 70;
  }

  // Named:
  public Crustabri (String nom) {
    this.num = 91;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 50;
    this.att = 95;
    this.def = 180;
    this.vit = 70;
  }
}