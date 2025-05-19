package fr.afpa.model;

public class CompteDecouverte extends CompteUtilisateur {
    private PlaylistFilms playlistFilms;

    public CompteDecouverte(String nom, Long numeroCompte, PlaylistFilms playlistFilms) {
        super(nom, numeroCompte);
        this.playlistFilms = playlistFilms;
    }

    public PlaylistFilms getPlaylistFilms() {
        return playlistFilms;
    }

    public void setPlaylistFilms(PlaylistFilms playlistFilms) {
        this.playlistFilms = playlistFilms;
    }
}
