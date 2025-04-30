package pokemons;

// Pokemon.java
// David MELOCCO (TD2 / TPC)

public abstract class Pokemon {
    protected int num, type1, type2, pv, att, def, vit;
    protected String nom;

    /**
     * Méthode abstraite qui récupère l'espèce d'un pokémon.
     * @return une chaîne de caractères contenant l'espèce du pokémon.
     */
    public abstract String getEspece();

// Constructeurs :
    /**
     * Par défaut, un pokémon de type Pikachu.
     */
    public Pokemon() {
        this.num = 25;
        this.nom = "Pikachu";
        this.type1 = Type.ELECTRIK;
        this.type2 = Type.SANS;
        this.pv = 35;
        this.att = 55;
        this.def = 30;
        this.vit = 90;
    }

    /**
     * Par copie.
     * @param pokemon
     */
    public Pokemon(Pokemon pokemon) {
        this.num = pokemon.num;
        this.nom = new String(pokemon.nom);
        this.type1 = pokemon.type1;
        this.type2 = pokemon.type2;
        this.pv = pokemon.pv;
        this.att = pokemon.att;
        this.def = pokemon.def;
        this.vit = pokemon.vit;
    }

    /**
     * Selon des caractéristiques.
     * @param num entier : numéro de l'espèce
     * @param nom chaîne de caractères : nom du pokémon.
     * @param type1 chaîne de caractères : premier type.
     * @param type2 chaîne de caractères : deuxième type (SANS -> n'a pas de deuxième type).
     * @param pv entier : points de vie.
     * @param att entier : points d'attaque.
     * @param def entier : points de défense.
     * @param vit entier : points de vitesse.
     */
    public Pokemon(int num, String nom, String type1, String type2, int pv, int att, int def, int vit) {
        this.num = num;
        this.nom = nom;
        this.type1 = Type.getIndiceType(type1);
        this.type2 = Type.getIndiceType(type2);
        this.pv = pv;
        this.att = att;
        this.def = def;
        this.vit = vit;
    }

    /**
     * Selon des caractéristiques.
     * @param num entier : numéro de l'espèce
     * @param nom chaîne de caractères : nom du pokémon.
     * @param type1 entier : premier type.
     * @param type2 entier : deuxième type (15 -> n'a pas de deuxième type).
     * @param pv entier : points de vie.
     * @param att entier : points d'attaque.
     * @param def entier : points de défense.
     * @param vit entier : points de vitesse.
     */
    public Pokemon(int num, String nom, int type1, int type2, int pv, int att, int def, int vit) {
        this.num = num;
        this.nom = nom;
        this.type1 = type1;
        this.type2 = type2;
        this.pv = pv;
        this.att = att;
        this.def = def;
        this.vit = vit;
    }
    
// Méthodes :
    // ----- GETTERS -----

    /**
     * Renvoie le numéro d'espèce du pokémon.
     * @return un entier.
     */
    public int getNumero() { return this.num; }

    /**
     * Renvoie le nom du pokémon.
     * @return une chaîne de caractères.
     */
    public String getNom() { return new String(this.nom); }

    /**
     * Renvoie le premier type du pokémon.
     * @return une chaîne de caractères.
     */
    public String getType1() { return new String(Type.getNomType(this.type1)); }

    /**
     * Renvoie le deuxième type du pokémon.
     * @return une chaîne de caractères.
     */
    public String getType2() { return new String(Type.getNomType(this.type2)); }

    /**
     * Renvoie le nombre de points de vie.
     * @return un entier.
     */
    public int getPV() { return this.pv; }

    /**
     * Renvoie le nombre de points d'attaque.
     * @return un entier.
     */
    public int getATT() { return this.att; }

    /**
     * Renvoie le nombre de points de défense.
     * @return un entier.
     */
    public int getDEF() { return this.def; }

    /**
     * Renvoie le nombre de points de vitesse.
     * @return un entier.
     */
    public int getVIT() { return this.vit; }

    /**
     * Méthode d'attaque contre un autre pokémon.
     * @param p un objet de type Pokemon.
     */
    public void attaque(Pokemon pokemon) {
        double degats;
        double coef;
    
        // Si le premier pokémon est plus rapide :
        if (this.vit >= pokemon.vit) {
            System.out.println(this.nom + " attaque en premier.");
    
            coef = Type.getEfficacite(this.type1, pokemon.type2);
    
            degats = (this.att - pokemon.def) * coef;
            if (coef == 0) {
                degats = 0;
                System.out.println("C'est inefficace !");
            } else if (degats <= 0) {
                degats = 1;
            }

            pokemon.pv -= degats;
            if (pokemon.pv < 0)
                pokemon.pv = 0;
            System.out.println("💢 " + this.nom + " inflige " + degats + " de dégâts à " + pokemon.nom + ".");
    
            // Contre-attaque du second pokémon :
            if (pokemon.pv > 0) {
                System.out.println(pokemon.nom + " contre-attaque.");

                coef = Type.getEfficacite(pokemon.type1, this.type2);
    
                degats = (pokemon.att - this.def) * coef;
                if (coef == 0) {
                    degats = 0;
                    System.out.println("C'est inefficace !");
                } else if (degats <= 0) {
                    degats = 1;
                }

                this.pv -= degats;
                if (this.pv < 0)
                    this.pv = 0;
                System.out.println("💢 " + pokemon.nom + " inflige " + degats + " de dégâts à " + this.nom + ".");
            }
    
        } else {
            // Si le second pokémon est plus rapide :
            System.out.println(pokemon.nom + " attaque en premier.");
    
            coef = Type.getEfficacite(pokemon.type1, this.type2);
    
            degats = (pokemon.att - this.def) * coef;
            if (coef == 0) {
                degats = 0;
                System.out.println("C'est inefficace !");
            } else if (degats <= 0) {
                degats = 1;
            }

            this.pv -= degats;
            if (this.pv < 0)
                this.pv = 0;
            System.out.println("💢 " + pokemon.nom + " inflige " + degats + " de dégâts à " + this.nom + ".");
    
            if (this.pv > 0) {
                System.out.println(this.nom + " contre-attaque.");
                coef = Type.getEfficacite(this.type1, pokemon.type2);
    
                degats = (this.att - pokemon.def) * coef;
                if (coef == 0) {
                    degats = 0;
                    System.out.println("C'est inefficace !");
                } else if (degats <= 0) {
                    degats = 1;
                }

                pokemon.pv -= degats;
                if (pokemon.pv < 0)
                    pokemon.pv = 0;
                System.out.println("💢 " + this.nom + " inflige " + degats + " de dégâts à " + pokemon.nom + ".");
            }
        }
    }    

    // ----- REDÉFINIES -----

    /**
     * Méthode equals.
     * @param pokemon
     * @return un booléen.
     */
    public boolean equals(Pokemon pokemon) {
        if(
            this.num == pokemon.num && 
            this.nom.equals(pokemon.nom) && 
            this.type1 == pokemon.type1 && 
            this.type2 == pokemon.type2 && 
            this.pv == pokemon.pv && 
            this.att == pokemon.att && 
            this.def == pokemon.def && 
            this.vit == pokemon.vit)
            return true;
        return false;
    }

    /**
     * Méthode toString.
     */
    @Override
    public String toString() {
        return new String(
            "Espèce : " + this.getEspece() + 
            "\nNom : " + this.getNom() + 
            "\nTypes : " + this.getType1() + " | " + this.getType2() + 
            "\nPV : " + this.getPV() + 
            "\nATT : " + this.getATT() + 
            "\nDEF : " + this.getDEF() + 
            "\nVIT : " + this.getVIT()
        );
    }
}