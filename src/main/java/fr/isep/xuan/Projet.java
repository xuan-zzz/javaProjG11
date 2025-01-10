package fr.isep.xuan;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Projet {
    private String name;
    private HashMap<Employe, String> roles = new HashMap<>(); //liste d'employe, avec un role (string) assigne a chacun
    private HashSet<Tache> listeTaches = new HashSet<>(); //liste de taches
    private HashSet<LocalDate> datesLimites = new HashSet<>(); //liste de dates de rendu
    private HashSet<String> categories = new HashSet<>(); //liste de categories pour les taches
    private int statut;  //0 pour A faire, 1 pour en cours, 2 pour termine

    Projet(String nom){this.name = nom;}

    public void addTache(){}

    public String getName() {return name;}
    public HashMap<Employe, String> getRoles() {return roles;}
    public HashSet<Tache> getListeTaches() {return listeTaches;}
    public HashSet<LocalDate> getDatesLimites() {return datesLimites;}
    public HashSet<String> getCategories() {return categories;}
    public int getStatut() {return statut;}

    //les methodes set des HashMaps et HashSets sont des copies profondes
    public void setName(String name) {this.name = name;}
    public void setDatesLimites(HashSet<LocalDate> datesLimites) {this.datesLimites = new HashSet<>(datesLimites);}
    public void setListeTaches(HashSet<Tache> listeTaches) {this.listeTaches = new HashSet<>(listeTaches);}
    public void setRoles(HashMap<Employe, String> roles) {this.roles = new HashMap<>(roles);}
    public void setCategories(HashSet<String> categories) {this.categories = new HashSet<>(categories);}
    public void setStatut(int statut) {this.statut = statut;}
}
