package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String titre;
    private int dateSortie;
    private List<Acteur> acteurs = new ArrayList<Acteur>();

    public Film(String nom, int dateSortie, List<Acteur> acteurs) {
        this.titre = nom;
        this.dateSortie = dateSortie;
        this.acteurs = acteurs;
    }

    @Override
    public String toString() {
        return "Film [titre=" + titre + "]";
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String nom) {
        this.titre = nom;
    }

    public int getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(int dateSortie) {
        this.dateSortie = dateSortie;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

}
