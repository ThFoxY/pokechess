package pokemons;
// Aeromite.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Aeromite extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Aeromite() {
    this.num = 49;
    this.nom = "Aeromite";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 70;
    this.att = 65;
    this.def = 60;
    this.vit = 90;
  }

  // Named:
  public Aeromite (String nom) {
    this.num = 49;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 70;
    this.att = 65;
    this.def = 60;
    this.vit = 90;
  }
}