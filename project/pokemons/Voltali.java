package pokemons;
// Voltali.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Voltali extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Voltali() {
    this.num = 135;
    this.nom = "Voltali";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 65;
    this.def = 60;
    this.vit = 130;
  }

  // Named:
  public Voltali (String nom) {
    this.num = 135;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 65;
    this.def = 60;
    this.vit = 130;
  }
}