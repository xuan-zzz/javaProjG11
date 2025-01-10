package fr.isep.xuan;

import java.util.HashSet;

import static fr.isep.xuan.Main.listeComptes;

public class Employe {
    private String password;
    private String nom;
    private String prenom;
    private String contact;
    private HashSet<Projet> historique = new HashSet<>();

    Employe(String mdp, String nom, String prenom, String email){
        this.password = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.contact = email;
        listeComptes.put(this.contact, this);
    }

    public String getPassword() {return password;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getContact() {return contact;}
    public HashSet<Projet> getHistorique() {return historique;}

    //les methodes set des HashMaps et HashSets sont des copies profondes
    public void setPassword(String password) {this.password = password;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public void setNom(String nom) {this.nom = nom;}
    public void setContact(String contact) {this.contact = contact;}
    public void setHistorique(HashSet<Projet> historique) {this.historique = new HashSet<>(historique);}

    @Override
    public String toString() {
        return this.prenom + " " + this.nom + ", " + this.contact;
    }

    public String afficheHistorique() {
        StringBuilder toReturn = new StringBuilder();
        for (Projet p: historique) {
            toReturn.append(" ").append(p.getName());
        }
        return toReturn.toString();
    }

}
