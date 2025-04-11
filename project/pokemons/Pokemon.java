package pokemons;

// Pokemon.java
// David MELOCCO (TD2 / TPC)

public abstract class Pokemon {
    protected int num, type1, type2, pv, att, def, vit, degats_infliges;
    protected String nom;

    // Abstract method:
    public abstract String getEspece();

// Constructors:
    // Default pokémon:
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

    // Copy:
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

    // Pokémon (with types being str):
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

    // Pokémon (with types being int):
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
    
// Getters:
    // Returns pokémon's name:
    public String getNom() {
        return new String(this.nom);
    }

    // Returns pokémon's number:
    public int getNombre() {
        return this.num;
    }

    // Return health:
    public int getPV() {
        return this.pv;
    }

    // Returns attack:
    public int getAttaque() {
        return this.att;
    }

    // Returns defense:
    public int getDefense() {
        return this.def;
    }

    // Returns speed of attack:
    public int getVitesse() {
        return this.vit;
    }

    // Fighting method:
    public void attaque(Pokemon p) {
        // First pokémon is attacking:
        if(this.vit >= p.vit){
            System.out.println("\t\t" + this.nom + " attaque en premier !");
            degats_infliges = (this.att - p.def);
            if(degats_infliges < 0) {
                degats_infliges = 0;
            }

            p.pv -= degats_infliges;
            if(p.pv < 0) {
                p.pv = 0;
            }
            System.out.println("\t\t💢​  " + this.nom + " a infligé " + degats_infliges + "PV !");

            // Second pokémon is attacking if still alive:
            if(p.pv > 0) {
                System.out.println("\t\t" + p.nom + " attaque à son tour !");
                degats_infliges = (p.att - this.def);
                if(degats_infliges < 0) {
                    degats_infliges = 0;
                }

                this.pv -= degats_infliges;
                if(this.pv < 0) {
                    this.pv = 0;
                }
                System.out.println("\t\t💢​  " + p.nom + " a infligé " + degats_infliges + "PV !");
            }
        // Second pokémon is attacking:
        }else{
            System.out.println("\t\t" + p.nom + " attaque en premier !");
            degats_infliges = (p.att - this.def);
            if(degats_infliges < 0) {
                degats_infliges = 0;
            }

            this.pv -= degats_infliges;
            if(this.pv < 0) {
                this.pv = 0;
            }
            System.out.println("\t\t💢​  " + p.nom + " a infligé " + degats_infliges + "PV !");

            // First pokémon is attacking if still alive:
            if(this.pv > 0) {
                System.out.println("\t\t" + this.nom + " attaque à son tour !");
                degats_infliges = (this.att - p.def);
                if(degats_infliges < 0) {
                    degats_infliges = 0;
                }

                p.pv -= degats_infliges;
                if(p.pv < 0) {
                    p.pv = 0;
                }
                System.out.println("\t\t💢​  " + this.nom + " a infligé " + degats_infliges + "PV !");
            }
        }
    }

    // 'equals' method:
    public boolean equals(Pokemon p) {
        if(this.num == p.num && this.nom.equals(p.nom) && this.type1 == p.type1 && this.type2 == p.type2 && this.pv == p.pv && this.att == p.att && this.def == p.def && this.vit == p.vit) {
            return true;
        }
        return false;
    }

    // 'toString' method:
    public String toString() {
        String info_pokemon = new String("\n[== POKEMON : " + getNom() + " ==]\n[TYPES] " + Type.getNomType(type1) + "/" + Type.getNomType(type2) + "\n"
        + "❤️​  " + this.getPV() + "\n🗡️  " 
        + this.getAttaque() + "\n🛡️  " 
        + this.getDefense() + "\n⚡ " 
        + this.getVitesse() + "\n"
        + getEspece() + "\n");
        return info_pokemon;
    }
}