package fr.isep.xuan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.LinkedHashMap;

import static fr.isep.xuan.Main.testEmploye;

public class Tache {
    private final Projet parentProj;
    private String name;
    private String description;
    private String categorie;
    private LinkedHashMap<LocalDateTime, String> comments = new LinkedHashMap<>();
    private int priorite; // de +3 a -3
    private LocalDate dateLimite;
    private int statut; //0 pour A faire, 1 pour En cours, 2 pour Termine
    private HashSet<Employe> employeTache = new HashSet<>();

    Tache (String nom, String desc, String cat, Projet proj){
        this.name = nom;
        this.description = desc;
        this.categorie = cat;
        this.parentProj = proj;
        this.statut = 0;
    }

    public void addComment(){
        //current user is set automatically
        Employe currentUser = testEmploye;
        //user enters comment
        String comment = "Test comment";
        comment += "\t\t-- " + currentUser.getContact();
        comments.put(LocalDateTime.now(ZoneId.of("UTC")), comment);
    }
    public void addEmploye(){
        //ajoute un employe a cette tache depuis this.parentProj.roles
        Employe toAdd = testEmploye;
        employeTache.add(toAdd);
    }
    public String employeToString(){
        String toReturn;
        if (employeTache.isEmpty()) { toReturn = "Aucun collaborateur sur ce projet."; }
        else {
            StringBuilder builder = new StringBuilder();
            for (Employe e: employeTache){
                builder.append(e.toString()).append(", ").append(this.parentProj.getRoles().get(e)).append("\n");
            }
            toReturn = builder.toString();
        }
        return toReturn;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public String getCategorie() {return categorie;}
    public int getPriorite() {return priorite;}
    public LocalDate getDateLimite() {return dateLimite;}
    public int getStatut() {return statut;}
    public LinkedHashMap<LocalDateTime, String> getComments() {return comments;}
    public Projet getParentProj() {return parentProj;}
    public HashSet<Employe> getEmployeTache() {return employeTache;}

    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setCategorie(String categorie) {this.categorie = categorie;}
    public void setStatut(int statut) {this.statut = statut;}
    public void setComments(LinkedHashMap<LocalDateTime, String> comments) {this.comments = comments;}
    public void setDateLimite(LocalDate dateLimite) {this.dateLimite = dateLimite;}
    public void setPriorite(int priorite) {this.priorite = priorite;}
    public void setEmployeTache(HashSet<Employe> employeTache) {this.employeTache = new HashSet<>(employeTache);}
}
