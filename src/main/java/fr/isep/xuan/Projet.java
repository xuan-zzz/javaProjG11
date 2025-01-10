package fr.isep.xuan;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

import static fr.isep.xuan.Main.testEmploye;

public class Projet {
    private String name;
    private LinkedHashMap<Employe, String> roles = new LinkedHashMap<>(); //liste d'employe, avec un role (string) assigne a chacun
    private HashSet<Tache> listeTaches = new HashSet<>(); //liste de taches
    private HashSet<LocalDate> datesLimites = new HashSet<>(); //liste de dates de rendu
    private HashSet<String> categories = new HashSet<>(); //liste de categories pour les taches
    private int statut;  //0 pour A faire, 1 pour en cours, 2 pour termine

    Projet(String nom){
        this.name = nom;
        this.categories.add("Sans catégorie");
        this.statut = 0;
    }

    public String afficheEmploye(){
        String toReturn;
        if (roles.isEmpty()) { toReturn = "Aucun collaborateur sur ce projet."; }
        else {
            StringBuilder builder = new StringBuilder();
            for (Employe e: roles.keySet()){
                builder.append(e.toString()).append(", ").append(roles.get(e)).append("\n");
            }
            toReturn = builder.toString();
        }
        return toReturn;
    }
    public void createTache(){
        //entrer nom dans l'interface graphique
        //placeholder for testing
        String nomTache = "testTache";
        //entrer description dans l'interface graphique
        //placeholder for testing
        String desc = "Test de description pour créer une tâche.";
        //choisir la catégorie dans l'interface graphique
        //placeholder for testing
        String cat = "Sans catégorie";
        listeTaches.add(new Tache(nomTache, desc, cat, this));
    }
    public void deleteTache(){
        //tache a suprimer choisie sur l'interface graphique
        //message "etes vous sur?
        listeTaches.remove();
    }
    public void addEmploye(){
        //selectioner l'employé dans la liste (dans l'interface graphique
        //placeholder for testing
        Employe aAjouter = testEmploye;
        //entrer un role dans l'interface graphique
        //placeholder
        String role = "roleTest";
        roles.put(aAjouter, role);
    }

    public String getName() {return name;}
    public LinkedHashMap<Employe, String> getRoles() {return roles;}
    public HashSet<Tache> getListeTaches() {return listeTaches;}
    public HashSet<LocalDate> getDatesLimites() {return datesLimites;}
    public HashSet<String> getCategories() {return categories;}
    public int getStatut() {return statut;}

    //les methodes set des HashMaps et HashSets sont des copies profondes
    public void setName(String name) {this.name = name;}
    public void setDatesLimites(HashSet<LocalDate> datesLimites) {this.datesLimites = new HashSet<>(datesLimites);}
    public void setListeTaches(HashSet<Tache> listeTaches) {this.listeTaches = new HashSet<>(listeTaches);}
    public void setRoles(LinkedHashMap<Employe, String> roles) {this.roles = new LinkedHashMap<>(roles);}
    public void setCategories(HashSet<String> categories) {this.categories = new HashSet<>(categories);}
    public void setStatut(int statut) {this.statut = statut;}
}
