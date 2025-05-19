package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class ComptePremium extends CompteUtilisateur {
    private String[] infoPaiement;
    private List<PlaylistFilms> playlistFilms = new ArrayList<PlaylistFilms>();
    private Famille famille;

    public ComptePremium(String nom, Long numeroCompte, String[] infoPaiement, Famille famille) {
        super(nom, numeroCompte);
        this.infoPaiement = infoPaiement;
        this.famille = famille;
    }

    /**
     * Si le compte fait partie d'une famille, il a droit à 5% de réduction sur
     * l'abonnement premium.
     * 
     * @return Retourne le montant de la réduction.
     */
    public double reductionFamille() {
        if (famille != null) {
            return 0.05;
        } else {
            return 0;
        }
    }

    public void ajouterPlaylist(PlaylistFilms playlist) {
        playlistFilms.add(playlist);
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
