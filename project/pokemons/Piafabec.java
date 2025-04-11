package pokemons;
// Piafabec.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Piafabec extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Piafabec() {
    this.num = 21;
    this.nom = "Piafabec";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 60;
    this.def = 30;
    this.vit = 70;
  }

  // Named:
  public Piafabec (String nom) {
    this.num = 21;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 60;
    this.def = 30;
    this.vit = 70;
  }
}