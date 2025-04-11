package pokemons;
// Rapasdepic.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rapasdepic extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Rapasdepic() {
    this.num = 22;
    this.nom = "Rapasdepic";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 65;
    this.att = 90;
    this.def = 65;
    this.vit = 100;
  }

  // Named:
  public Rapasdepic (String nom) {
    this.num = 22;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 65;
    this.att = 90;
    this.def = 65;
    this.vit = 100;
  }
}