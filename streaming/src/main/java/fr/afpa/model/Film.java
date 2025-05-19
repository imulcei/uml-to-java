package fr.afpa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film {
    private String titre;
    private Date dateSortie;
    private List<Acteur> acteurs = new ArrayList<Acteur>();

    public Film(String nom, Date dateSortie, List<Acteur> acteurs) {
        this.titre = nom;
        this.dateSortie = dateSortie;
        this.acteurs = acteurs;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String nom) {
        this.titre = nom;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

}
