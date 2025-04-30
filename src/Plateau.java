// Plateau.java
// David MELOCCO (TD2 / TPC)

import pokemons.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Supplier;

/**
 * Création d'une arène.
 */
public class Plateau {
// Attributs :
    private ArrayList<Piece> arene;

// Constructeurs :
    /**
     * Par défaut.
     */
    public Plateau() {
        this.arene = new ArrayList<Piece>();
        // Joueur 1 :
            // A1 à I1
            arene.add(new Piece(
                new Salameche(), 1, "A1"));
            arene.add(new Piece(
                new Carapuce(), 1, "B1"));
            arene.add(new Piece(
                new Bulbizarre(), 1, "C1"));
            
            arene.add(new Piece(
                new Sulfura(), 1, "D1"));
            arene.add(new Piece(
                new Mewtwo(), 1, "E1"));
            arene.add(new Piece(
                new Electhor(), 1, "F1"));

            arene.add(new Piece(
                new Bulbizarre(), 1, "G1"));
            arene.add(new Piece(
                new Carapuce(), 1, "H1"));
            arene.add(new Piece(
                new Salameche(), 1, "I1"));

            // A2 à I2
            arene.add(new Piece(
                new Reptincel(), 1, "A2"));
            arene.add(new Piece(
                new Carabaffe(), 1, "B2"));
            arene.add(new Piece(
                new Herbizarre(), 1, "C2"));
            
            arene.add(new Piece(
                new Dracolosse(), 1, "D2"));
            arene.add(new Piece(
                new Artikodin(), 1, "E2"));
            arene.add(new Piece(
                new Dracolosse(), 1, "F2"));

            arene.add(new Piece(
                new Herbizarre(), 1, "G2"));
            arene.add(new Piece(
                new Carabaffe(), 1, "H2"));
            arene.add(new Piece(
                new Reptincel(), 1, "I2"));

            // D3 à F3
            arene.add(new Piece(
                new Dracaufeu(), 1, "D3"));
            arene.add(new Piece(
                new Tortank(), 1, "E3"));
            arene.add(new Piece(
                new Florizarre(), 1, "F3"));
        
        // Joueur 2 :
            // A9 à I9
            arene.add(new Piece(
                new Salameche(), 2, "A9"));
            arene.add(new Piece(
                new Carapuce(), 2, "B9"));
            arene.add(new Piece(
                new Bulbizarre(), 2, "C9"));
            
            arene.add(new Piece(
                new Sulfura(), 2, "D9"));
            arene.add(new Piece(
                new Mewtwo(), 2, "E9"));
            arene.add(new Piece(
                new Electhor(), 2, "F9"));

            arene.add(new Piece(
                new Bulbizarre(), 2, "G9"));
            arene.add(new Piece(
                new Carapuce(), 2, "H9"));
            arene.add(new Piece(
                new Salameche(), 2, "I9"));

            // A8 à I8
            arene.add(new Piece(
                new Reptincel(), 2, "A8"));
            arene.add(new Piece(
                new Carabaffe(), 2, "B8"));
            arene.add(new Piece(
                new Herbizarre(), 2, "C8"));
            
            arene.add(new Piece(
                new Dracolosse(), 2, "D8"));
            arene.add(new Piece(
                new Artikodin(), 2, "E8"));
            arene.add(new Piece(
                new Dracolosse(), 2, "F8"));

            arene.add(new Piece(
                new Herbizarre(), 2, "G8"));
            arene.add(new Piece(
                new Carabaffe(), 2, "H8"));
            arene.add(new Piece(
                new Reptincel(), 2, "I8"));

            // D7 à F7
            arene.add(new Piece(
                new Florizarre(), 2, "D7"));
            arene.add(new Piece(
                new Tortank(), 2, "E7"));
            arene.add(new Piece(
                new Dracaufeu(), 2, "F7"));
    }

    /**
     * Selon deux fichiers.
     * @param fichier1
     * @param fichier2
     */
    public Plateau(String fichier1, String fichier2) {
        this.arene = new ArrayList<Piece>();
        /*
        Création d'un dictionnaire 'HashMap' où la clé est une chaîne de caractères (espèce du Pokémon) et où la valeur est une référence à l'instanciateur d'une classe Pokémon.

        Sources :
        -> https://codegym.cc/fr/groups/posts/fr.653.comment-creer-un-dictionnaire-en-java
        -> https://www.w3schools.com/java/java_hashmap.asp
        -> https://www.w3schools.com/java/java_hashset.asp

        */
        HashMap<String, Supplier<Pokemon>> pokedex = initialiserPokedex();
        // Création d'un dictionnaire 'HastSet' où chaque éléments est unique.
        HashSet<String> casesOccupees = new HashSet<>();
        
        // Récupération des PV de chaque Pokémon pour chaque joueur :
        int PV1 = lireFichier(fichier1, 1, pokedex, casesOccupees);
        int PV2 = lireFichier(fichier2, 2, pokedex, casesOccupees);

        // Erreur en cas de dépassement de 1500 PV :
        if (PV1 > 1500) {
            throw new IllegalArgumentException("Les PV du joueur 1 dépassent 1500 !");
        }
        if (PV2 > 1500) {
            throw new IllegalArgumentException("Les PV du joueur 2 dépassent 1500 !");
        }
    }

    /**
     * Création du Pokédex en remplissant un dictionnaire où la clé est une chaîne de caractères (espèce du Pokémon) et où la valeur est une référence à l'instanciateur d'une classe Pokémon.
     * @return un dictionnaire de type HashMap.
     */
    private HashMap<String, Supplier<Pokemon>> initialiserPokedex() {
        HashMap<String, Supplier<Pokemon>> pokedex = new HashMap<>();
        // Génère chaque couple clé/valeur grâce à un fichier .shell :
        pokedex.put("bulbizarre", Bulbizarre::new);
        pokedex.put("herbizarre", Herbizarre::new);
        pokedex.put("florizarre", Florizarre::new);
        pokedex.put("salameche", Salameche::new);
        pokedex.put("reptincel", Reptincel::new);
        pokedex.put("dracaufeu", Dracaufeu::new);
        pokedex.put("carapuce", Carapuce::new);
        pokedex.put("carabaffe", Carabaffe::new);
        pokedex.put("tortank", Tortank::new);
        pokedex.put("chenipan", Chenipan::new);
        pokedex.put("chrysacier", Chrysacier::new);
        pokedex.put("papilusion", Papilusion::new);
        pokedex.put("aspicot", Aspicot::new);
        pokedex.put("coconfort", Coconfort::new);
        pokedex.put("dardargnan", Dardargnan::new);
        pokedex.put("roucool", Roucool::new);
        pokedex.put("roucoups", Roucoups::new);
        pokedex.put("roucarnage", Roucarnage::new);
        pokedex.put("rattata", Rattata::new);
        pokedex.put("rattatac", Rattatac::new);
        pokedex.put("piafabec", Piafabec::new);
        pokedex.put("rapasdepic", Rapasdepic::new);
        pokedex.put("abo", Abo::new);
        pokedex.put("arbok", Arbok::new);
        pokedex.put("pikachu", Pikachu::new);
        pokedex.put("raichu", Raichu::new);
        pokedex.put("sabelette", Sabelette::new);
        pokedex.put("sablaireau", Sablaireau::new);
        pokedex.put("nidoranf", NidoranF::new);
        pokedex.put("nidorina", Nidorina::new);
        pokedex.put("nidoqueen", Nidoqueen::new);
        pokedex.put("nidoranm", NidoranM::new);
        pokedex.put("nidorino", Nidorino::new);
        pokedex.put("nidoking", Nidoking::new);
        pokedex.put("melofee", Melofee::new);
        pokedex.put("melodelfe", Melodelfe::new);
        pokedex.put("goupix", Goupix::new);
        pokedex.put("feunard", Feunard::new);
        pokedex.put("rondoudou", Rondoudou::new);
        pokedex.put("grodoudou", Grodoudou::new);
        pokedex.put("nosferapti", Nosferapti::new);
        pokedex.put("nosferalto", Nosferalto::new);
        pokedex.put("mystherbe", Mystherbe::new);
        pokedex.put("ortide", Ortide::new);
        pokedex.put("rafflesia", Rafflesia::new);
        pokedex.put("paras", Paras::new);
        pokedex.put("parasect", Parasect::new);
        pokedex.put("mimitoss", Mimitoss::new);
        pokedex.put("aeromite", Aeromite::new);
        pokedex.put("taupiqueur", Taupiqueur::new);
        pokedex.put("triopikeur", Triopikeur::new);
        pokedex.put("miaouss", Miaouss::new);
        pokedex.put("persian", Persian::new);
        pokedex.put("psykokwak", Psykokwak::new);
        pokedex.put("akwakwak", Akwakwak::new);
        pokedex.put("ferosinge", Ferosinge::new);
        pokedex.put("colossinge", Colossinge::new);
        pokedex.put("caninos", Caninos::new);
        pokedex.put("arcanin", Arcanin::new);
        pokedex.put("ptitard", Ptitard::new);
        pokedex.put("tetarte", Tetarte::new);
        pokedex.put("tartard", Tartard::new);
        pokedex.put("abra", Abra::new);
        pokedex.put("kadabra", Kadabra::new);
        pokedex.put("alakazam", Alakazam::new);
        pokedex.put("machoc", Machoc::new);
        pokedex.put("machopeur", Machopeur::new);
        pokedex.put("mackogneur", Mackogneur::new);
        pokedex.put("chetiflor", Chetiflor::new);
        pokedex.put("boustiflor", Boustiflor::new);
        pokedex.put("empiflor", Empiflor::new);
        pokedex.put("tentacool", Tentacool::new);
        pokedex.put("tentacruel", Tentacruel::new);
        pokedex.put("racaillou", Racaillou::new);
        pokedex.put("gravalanch", Gravalanch::new);
        pokedex.put("grolem", Grolem::new);
        pokedex.put("ponyta", Ponyta::new);
        pokedex.put("galopa", Galopa::new);
        pokedex.put("ramoloss", Ramoloss::new);
        pokedex.put("flagadoss", Flagadoss::new);
        pokedex.put("magneti", Magneti::new);
        pokedex.put("magneton", Magneton::new);
        pokedex.put("canarticho", Canarticho::new);
        pokedex.put("doduo", Doduo::new);
        pokedex.put("dodrio", Dodrio::new);
        pokedex.put("otaria", Otaria::new);
        pokedex.put("lamantine", Lamantine::new);
        pokedex.put("tadmorv", Tadmorv::new);
        pokedex.put("grotadmorv", Grotadmorv::new);
        pokedex.put("kokiyas", Kokiyas::new);
        pokedex.put("crustabri", Crustabri::new);
        pokedex.put("fantominus", Fantominus::new);
        pokedex.put("spectrum", Spectrum::new);
        pokedex.put("ectoplasma", Ectoplasma::new);
        pokedex.put("onix", Onix::new);
        pokedex.put("soporifik", Soporifik::new);
        pokedex.put("hypnomade", Hypnomade::new);
        pokedex.put("krabby", Krabby::new);
        pokedex.put("krabboss", Krabboss::new);
        pokedex.put("voltorbe", Voltorbe::new);
        pokedex.put("electrode", Electrode::new);
        pokedex.put("noeunoeuf", Noeunoeuf::new);
        pokedex.put("noadkoko", Noadkoko::new);
        pokedex.put("osselait", Osselait::new);
        pokedex.put("ossatueur", Ossatueur::new);
        pokedex.put("kicklee", Kicklee::new);
        pokedex.put("tygnon", Tygnon::new);
        pokedex.put("excelangue", Excelangue::new);
        pokedex.put("smogo", Smogo::new);
        pokedex.put("smogogo", Smogogo::new);
        pokedex.put("rhinocorne", Rhinocorne::new);
        pokedex.put("rhinoferos", Rhinoferos::new);
        pokedex.put("leveinard", Leveinard::new);
        pokedex.put("saquedeneu", Saquedeneu::new);
        pokedex.put("kangourex", Kangourex::new);
        pokedex.put("hypotrempe", Hypotrempe::new);
        pokedex.put("hypocean", Hypocean::new);
        pokedex.put("poissirene", Poissirene::new);
        pokedex.put("poissoroy", Poissoroy::new);
        pokedex.put("stari", Stari::new);
        pokedex.put("staross", Staross::new);
        pokedex.put("m_mime", M_Mime::new);
        pokedex.put("insecateur", Insecateur::new);
        pokedex.put("lippoutou", Lippoutou::new);
        pokedex.put("elektek", Elektek::new);
        pokedex.put("magmar", Magmar::new);
        pokedex.put("scarabrute", Scarabrute::new);
        pokedex.put("tauros", Tauros::new);
        pokedex.put("magicarpe", Magicarpe::new);
        pokedex.put("leviator", Leviator::new);
        pokedex.put("lokhlass", Lokhlass::new);
        pokedex.put("metamorph", Metamorph::new);
        pokedex.put("evoli", Evoli::new);
        pokedex.put("aquali", Aquali::new);
        pokedex.put("voltali", Voltali::new);
        pokedex.put("pyroli", Pyroli::new);
        pokedex.put("porygon", Porygon::new);
        pokedex.put("amonita", Amonita::new);
        pokedex.put("amonistar", Amonistar::new);
        pokedex.put("kabuto", Kabuto::new);
        pokedex.put("kabutops", Kabutops::new);
        pokedex.put("ptera", Ptera::new);
        pokedex.put("ronflex", Ronflex::new);
        pokedex.put("artikodin", Artikodin::new);
        pokedex.put("electhor", Electhor::new);
        pokedex.put("sulfura", Sulfura::new);
        pokedex.put("minidraco", Minidraco::new);
        pokedex.put("draco", Draco::new);
        pokedex.put("dracolosse", Dracolosse::new);
        pokedex.put("mewtwo", Mewtwo::new);
        pokedex.put("mew", Mew::new);
        return pokedex;
    }

    /**
     * Lit les deux fichiers précédents et récupère les Pokémon de chaque joueur.
     * @param fichier
     * @param joueur
     * @param pokedex
     * @param casesOccupees
     * @return un entier qui représente les PV total des Pokémon d'un joueur.
     */
    private int lireFichier(String fichier, int joueur, HashMap<String, Supplier<Pokemon>> pokedex, HashSet<String> casesOccupees) {
        int totalPV = 0;

        // TODO : comprendre ce code.
        try (BufferedReader lire = new BufferedReader(new FileReader(fichier))) {
            String ligne;   // Récupère la ligne sous forme de chaîne de caractères.
            int numLigne = 0;   // Début à la 1re ligne du fichier.

            // Tant que la ligne à lire n'est pas vide (dernière ligne du fichier) :
            while ( (ligne = lire.readLine()) != null) {
                numLigne++; // Passe à la ligne suivante
                ligne = ligne.trim();   // Supprime les espaces vides dans la ligne.

                // if (ligne.isEmpty()) continue;

                // Coupe la chaîne en deux selon le séparateur ';' :
                String[] chaine = ligne.split(";");
                // Si le format n'est pas bon :
                if (chaine.length != 2) {
                    throw new IllegalArgumentException("[" + numLigne + "] -> format incorrect");
                }

                // Récupère les deux morçeaux de la chaîne (le nom du Pokémon et la case) :
                String nomPokemon = chaine[0].toLowerCase();
                String casePlateau = chaine[1].toUpperCase();

                // Vérifie si le nom du Pokémon existe dans le Pokédex :
                if (!pokedex.containsKey(nomPokemon)) {
                    throw new IllegalArgumentException("[" + numLigne + "] -> Pokémon inconnu : " + nomPokemon);
                }

                // Vérifie si la case est valide :
                if (!caseValide(casePlateau)) {
                    throw new IllegalArgumentException("[" + numLigne + "] -> Case invalide : " + casePlateau);
                }

                // Vérifie si la case est déjà occupée :
                if (casesOccupees.contains(casePlateau)) {
                    throw new IllegalArgumentException("[" + numLigne + "] -> Case occupée : " + casePlateau);
                }

                // Récupère le Pokémon instancié :
                Pokemon pokemon = pokedex.get(nomPokemon).get();
                // Ajoute à l'arène le Pokémon du joueur à la case voulu :
                arene.add(new Piece(pokemon, joueur, casePlateau));
                // Ajoute la case désormais occupée pour éviter d'avoir deux Pokémons sur une même case :
                casesOccupees.add(casePlateau);
                // Ajoute les PV du Pokémon au total :
                totalPV += pokemon.getPV();
            }
        } catch (IOException e) {
            throw new RuntimeException("Erreur de lecture du fichier -> " + fichier);
        }
        return totalPV;
    }

    /**
     * Vérifie si le format de la case est valide.
     * @param casePlateau
     * @return un booléen True si la case est valide, sinon False.
     */
    private boolean caseValide(String casePlateau) {
        if (casePlateau.length() != 2)
            return false;
        char lettre = casePlateau.charAt(0);
        char chiffre = casePlateau.charAt(1);
        return
            (lettre >= 'A' && lettre <= 'I') && 
            (chiffre >= '1' && chiffre <= '9');
    }

// Méthodes :
    // ----- GETTERS -----

    /**
     * Renvoie l'arène et ses pokémon.
     * @return
     */
    public ArrayList<Piece> getArene() { return this.arene; }

    /**
     * Renvoie la pièce située à des coordonnées x et y.
     * @param x
     * @param y
     * @return un objet de type Pokemon, sinon null.
     */
    public Piece getCase(Position position) {
        for (Piece pokemon : arene) {
            if(pokemon.getPosition().equals(position))
                return pokemon;
        }
        return null;
    }

    /**
     * Renvoie la pièce située à une position.
     * @param position
     * @return un objet de type Pokemon, sinon null.
     */
    //TODO : à corriger.
    public Piece getCase(int x, int y) { return this.getCase(new Position(x, y)); }

    /**
     * Renvoie la pièce située sur une case de l'échiquier.
     * @param position
     * @return un objet de type Pokemon, sinon null.
     */
    //TODO : à corriger.
    public Piece getCase(String position) {
        //! Vérifier en cas d'erreur.
        return this.getCase(new Position(position));
    }

    /**
     * Renvoie les pièces du joueur 1.
     * @return une liste dynamique des pokémon du joueur 1.
     */
    public ArrayList<Piece> getPiecesJoueur1() {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece piece : arene) {
            if(piece.getJoueur() == 1)
                pieces.add(piece);
        }
        return pieces;
    }

    /**
     * Renvoie les pièces du joueur 2.
     * @return une liste dynamique des pokémon du joueur 2.
     */
    public ArrayList<Piece> getPiecesJoueur2() {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece piece : arene) {
            if(piece.getJoueur() == 2)
                pieces.add(piece);
        }
        return pieces;
    }

    public Piece getMewtwo(int joueur) {
        for(Piece pokemon : arene) {
            if( (pokemon.getPokemon().getEspece().equals("Mewtwo")) && (pokemon.getJoueur() == joueur) )
                return pokemon;
        }
        return null;
    }

    /**
     * Nettoie l'échiquier des pokémon K.O.
     */
    public void nettoyer() {
        Iterator<Piece> it = arene.iterator();
        while (it.hasNext()) {
            if (it.next().getPokemon().getPV() <= 0) {
                it.remove();
            }
        }
    }

    // ----- REDÉFINIES -----

    // Méthode toString.
    public String toString() {
        String informations = new String();
        for (Piece piece : arene)
            informations += piece.getPosition() + " | " 
            + piece.getJoueur() + " | " 
            + piece.getPokemon() + "\n";
        return informations;
    }
}
