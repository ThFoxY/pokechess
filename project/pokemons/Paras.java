package pokemons;
// Paras.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Paras extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Paras() {
    this.num = 46;
    this.nom = "Paras";
    this.type1 = Type.INSECTE;
    this.type2 = Type.PLANTE;
    this.pv = 35;
    this.att = 70;
    this.def = 55;
    this.vit = 25;
  }

  // Named:
  public Paras (String nom) {
    this.num = 46;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.PLANTE;
    this.pv = 35;
    this.att = 70;
    this.def = 55;
    this.vit = 25;
  }
}