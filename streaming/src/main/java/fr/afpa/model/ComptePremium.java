package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class ComptePremium extends CompteUtilisateur {
    private String[] infoPaiement;
    private List<PlaylistFilms> _playlistFilms = new ArrayList<PlaylistFilms>();
    private Famille _famille;

    public String[] getInfoPaiement() {
        return infoPaiement;
    }

    public void setInfoPaiement(String[] infoPaiement) {
        this.infoPaiement = infoPaiement;
    }

    public List<PlaylistFilms> get_playlistFilms() {
        return _playlistFilms;
    }

    public void set_playlistFilms(List<PlaylistFilms> _playlistFilms) {
        this._playlistFilms = _playlistFilms;
    }

    public Famille get_famille() {
        return _famille;
    }

    public void set_famille(Famille _famille) {
        this._famille = _famille;
    }

}
