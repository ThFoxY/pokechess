# ♟️ PokéChess (release v0.1)

## 🦊 Auteur
**Développé sous Java avec la bibliothèque graphique MG2D.**

* GitHub : [@thfoxy](https://www.github.com/thfoxy).
* Accès au projet : [PokéChess](https://github.com/ThFoxY/pokechess)

Un jeu d’échecs mêlé à l’univers de **Pokémon** ! Affrontez vos adversaires sur un échiquier où chaque pièce est un Pokémon capable d’attaquer ses voisins.

## ⚔️ Gameplay

L'arène est un échiquier de **9x9** cases où vous pouvez constituer votre deck de Pokémon favoris de la 1re génération. Veillez à rester stratégique et combattez le **Mewtwo** adversaire pour remporter l'arène !

Ci-dessous, une liste des mécanismes implémentés pour la **release (v0.1)** :

### 1. Arène
Possibilité de jouer avec un plateau **9x9** (cases allant de **```A1```** à **```I9```**) :
* **Prédéfini :** les Pokémon sont disposés de manière équilibrée et équitable pour une partie idéale !
![Aperçu de l'arène](assets/images/0.png)
* **Configurable :** configurez les deux fichiers ```pokemon_j1.txt``` et ```pokemon_j2.txt``` pour avoir vos Pokémon favoris dans l'arène.
    * Vous devez inclure des Pokémon existants, sur une case disponible et en respectant le format suivant : ```nomPokémon;case```
    * Vous devez avoir des Pokémon dont l'ensemble des PV ne dépassent pas **1500**.
    * Vous devez avoir un unique **Mewtwo** obligatoirement.
![Exemple d'arène](assets/images/1.png)

🚧 **W.I.P** 🚧
    
**À faire pour la release v0.2** : un plateau aléatoire, un plateau personnalisable en jeu, ajout des prochaines générations de Pokémon, choix de l'équipe Tortank.

### 2. Déplacements
Possibilité de déplacer un Pokémon d'une seule case dans les **8 directions** en cliquant dessus :
* Pour le déplacer, cliquez sur une flèche de l'échiquier.

🚧 **W.I.P** 🚧
    
**À faire pour la release v0.2** : déplacements spécifiques selon le type du Pokémon.

### 3. Combats
Si la case de déplacement contient un Pokémon adversaire, un combat commencera :
* Le Pokémon le plus rapide **(VIT)** attaquera en premier.
* Le Pokémon adversaire contre-attaquera s'il est encore vivant, et ainsi de suite.
    * À la fin du combat, le Pokémon ~~mort~~ **K.O** sera retiré de l'arène.

🚧 **W.I.P** 🚧
    
**À faire pour la release v0.2** : combats plus équilibrés, attaques spéciales/coups critiques selon le Pokémon, ajout de probabilités/d'aléatoire.

## 🕹️ Installation

### Prérequis
> Java Development Kit (JDK) 17+

### Compilation
```
javac *.java
java MainGraphique
```

## 📝 Licences
* Game Freak / Nintendo pour les artworks.
* [MD2D](https://github.com/synave/MG2D?tab=GPL-3.0-2-ov-file) pour la bibliothèque graphique.