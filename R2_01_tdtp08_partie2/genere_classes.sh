#!/bin/bash

fichierALire="pokedex_gen1.csv"

while read line
do
  numero=`echo $line | cut -d ";" -f 1`
  nom_original=`echo $line | cut -d ";" -f 2`
  nom=`echo $line | cut -d ";" -f 2`
  nom=`echo $nom | sed 's/é/e/g'`
  nom=`echo $nom | sed 's/è/e/g'`
  nom=`echo $nom | sed 's/É/E/g'`
  nom=`echo $nom | sed 's/ê/e/g'`
  nom=`echo $nom | sed 's/É/E/g'`
  nom=`echo $nom | sed 's/♀/F/g'`
  nom=`echo $nom | sed 's/♂/M/g'`
  nom=`echo $nom | sed 's/\. /_/g'`
  type1=`echo $line | cut -d ";" -f 3 | tr '[:lower:]' '[:upper:]'`
  type2=`echo $line | cut -d ";" -f 4 | tr '[:lower:]' '[:upper:]'`
  if [[ -z "$type2" ]]; then
    type2="SANS"
  fi
  pv=`echo $line | cut -d ";" -f 5`
  force=`echo $line | cut -d ";" -f 6`
  defense=`echo $line | cut -d ";" -f 7`
  vitesse=`echo $line | cut -d ";" -f 8`

  echo "Traitement de "$nom_original". Création du fichier "$nom".java"
  
  fichierAEcrire=$nom".java"
  
  printf 'package pokemons;
// '$nom'.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class '$nom' extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public '$nom'() {
    this.num = '$numero';
    this.nom = "'$nom'";
    this.type1 = Type.'$type1';
    this.type2 = Type.'$type2';
    this.pv = '$pv';
    this.att = '$force';
    this.def = '$defense';
    this.vit = '$vitesse';
  }

  // Named:
  public '$nom' (String nom) {
    this.num = '$numero';
    this.nom = nom;
    this.type1 = Type.'$type1';
    this.type2 = Type.'$type2';
    this.pv = '$pv';
    this.att = '$force';
    this.def = '$defense';
    this.vit = '$vitesse';
  }
}' >> ../project/pokemons/$fichierAEcrire;
done < $fichierALire;
