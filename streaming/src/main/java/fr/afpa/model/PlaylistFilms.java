package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class PlaylistFilms {
    private ComptePremium _comptePremium;
    private CompteDecouverte _compteDecouverte;
    private List<Film> _films = new ArrayList<Film>();

    public ComptePremium get_comptePremium() {
        return _comptePremium;
    }

    public void set_comptePremium(ComptePremium _comptePremium) {
        this._comptePremium = _comptePremium;
    }

    public CompteDecouverte get_compteDecouverte() {
        return _compteDecouverte;
    }

    public void set_compteDecouverte(CompteDecouverte _compteDecouverte) {
        this._compteDecouverte = _compteDecouverte;
    }

    public List<Film> get_films() {
        return _films;
    }

    public void set_films(List<Film> _films) {
        this._films = _films;
    }

}