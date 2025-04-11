package pokemons;
// Papilusion.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Papilusion extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Papilusion() {
    this.num = 12;
    this.nom = "Papilusion";
    this.type1 = Type.INSECTE;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 45;
    this.def = 50;
    this.vit = 70;
  }

  // Named:
  public Papilusion (String nom) {
    this.num = 12;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 45;
    this.def = 50;
    this.vit = 70;
  }
}