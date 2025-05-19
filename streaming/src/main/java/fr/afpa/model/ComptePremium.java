package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class ComptePremium extends CompteUtilisateur {
    private String[] infoPaiement;
    private List<PlaylistFilms> playlistFilms = new ArrayList<PlaylistFilms>();
    private Famille famille;

    public ComptePremium(String nom, Long numeroCompte, String[] infoPaiement, List<PlaylistFilms> playlistFilms,
            Famille famille) {
        super(nom, numeroCompte);
        this.infoPaiement = infoPaiement;
        this.playlistFilms = playlistFilms;
        this.famille = famille;
    }

    public String[] getInfoPaiement() {
        return infoPaiement;
    }

    public List<PlaylistFilms> getPlaylistFilms() {
        return playlistFilms;
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

}
