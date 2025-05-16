package fr.afpa.model;

public class CompteDecouverte extends CompteUtilisateur {
    private PlaylistFilms _playlistFilms = new PlaylistFilms();

    public PlaylistFilms get_playlistFilms() {
        return _playlistFilms;
    }

    public void set_playlistFilms(PlaylistFilms _playlistFilms) {
        this._playlistFilms = _playlistFilms;
    }
}
