package fr.afpa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film {
    private String nom;
    private Date dateSortie;
    private List<PlaylistFilms> _playlistFilms = new ArrayList<PlaylistFilms>();
    private List<Acteur> _acteurs = new ArrayList<Acteur>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public List<PlaylistFilms> get_playlistFilms() {
        return _playlistFilms;
    }

    public void set_playlistFilms(List<PlaylistFilms> _playlistFilms) {
        this._playlistFilms = _playlistFilms;
    }

    public List<Acteur> get_acteurs() {
        return _acteurs;
    }

    public void set_acteurs(List<Acteur> _acteurs) {
        this._acteurs = _acteurs;
    }

}
