package fr.isep.xuan;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Tache {
    private String name;
    private String description;
    private String categorie;
    private LinkedHashMap<Employe, String> comments = new LinkedHashMap<>();
    private int priorite; // de +3 a -3
    private LocalDate dateLimite;
    private int statut; //0 pour A faire, 1 pour En cours, 2 pour Termine

    Tache (String nom, String desc, String cat){
        this.name = nom;
        this.description = desc;
        this.categorie = cat;
        this.statut = 0;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public String getCategorie() {return categorie;}
    public int getPriorite() {return priorite;}
    public LocalDate getDateLimite() {return dateLimite;}
    public int getStatut() {return statut;}
    public LinkedHashMap<Employe, String> getComments() {return comments;}

    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setCategorie(String categorie) {this.categorie = categorie;}
    public void setStatut(int statut) {this.statut = statut;}
    public void setComments(LinkedHashMap<Employe, String> comments) {this.comments = comments;}
    public void setDateLimite(LocalDate dateLimite) {this.dateLimite = dateLimite;}
    public void setPriorite(int priorite) {this.priorite = priorite;}
}
