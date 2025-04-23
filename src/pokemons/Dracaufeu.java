package pokemons;
// Dracaufeu.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dracaufeu extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Dracaufeu");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
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

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
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