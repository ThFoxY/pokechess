package pokemons;
// Dracaufeu.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dracaufeu extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Dracaufeu() {
    this.num = 6;
    this.nom = "Dracaufeu";
    this.type1 = Type.FEU;
    this.type2 = Type.VOL;
    this.pv = 78;
    this.att = 84;
    this.def = 78;
    this.vit = 100;
  }

  // Named:
  public Dracaufeu (String nom) {
    this.num = 6;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.VOL;
    this.pv = 78;
    this.att = 84;
    this.def = 78;
    this.vit = 100;
  }
}