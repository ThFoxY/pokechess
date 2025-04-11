package pokemons;
// NidoranM.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class NidoranM extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public NidoranM() {
    this.num = 32;
    this.nom = "NidoranM";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 46;
    this.att = 57;
    this.def = 40;
    this.vit = 50;
  }

  // Named:
  public NidoranM (String nom) {
    this.num = 32;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 46;
    this.att = 57;
    this.def = 40;
    this.vit = 50;
  }
}