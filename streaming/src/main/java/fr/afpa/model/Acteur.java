package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class Acteur {
    private String nom;
    private String prenom;
    private List<Film> _films = new ArrayList<Film>();

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

    public List<Film> get_films() {
        return _films;
    }

    public void set_films(List<Film> _films) {
        this._films = _films;
    }

}
