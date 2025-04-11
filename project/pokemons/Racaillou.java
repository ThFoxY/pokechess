package pokemons;
// Racaillou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Racaillou extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Racaillou() {
    this.num = 74;
    this.nom = "Racaillou";
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 40;
    this.att = 80;
    this.def = 100;
    this.vit = 20;
  }

  // Named:
  public Racaillou (String nom) {
    this.num = 74;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 40;
    this.att = 80;
    this.def = 100;
    this.vit = 20;
  }
}