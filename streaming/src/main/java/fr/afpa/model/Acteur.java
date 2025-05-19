package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class Acteur {
    private String nom;
    private String prenom;
    private List<Film> films = new ArrayList<Film>();

    public Acteur(String nom, String prenom, List<Film> films) {
        this.nom = nom;
        this.prenom = prenom;
        this.films = films;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

}
