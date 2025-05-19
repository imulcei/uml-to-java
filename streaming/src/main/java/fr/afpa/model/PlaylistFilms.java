package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class PlaylistFilms {
    private int indexProchainFilm;
    private ComptePremium comptePremium;
    private CompteDecouverte compteDecouverte;
    private List<Film> films = new ArrayList<Film>();

    public PlaylistFilms(int indexProchainFilm, ComptePremium comptePremium, CompteDecouverte compteDecouverte,
            List<Film> films) {
        this.indexProchainFilm = indexProchainFilm;
        this.comptePremium = comptePremium;
        this.compteDecouverte = compteDecouverte;
        this.films = films;
    }

    public String afficherFilms() {
        String titreFilm = "";
        for (Film film : films) {
            titreFilm = film.getTitre();
        }
        return titreFilm;
    }

    public Film obtenirProchainFilm() {
        Film prochainFilm = films.get(1);
        return prochainFilm;
    }

    public List<Film> obtenirDerniersFilms() {
        List<Film> derniersFilms = new ArrayList<Film>();
        Film dernierFilm = films.get(films.size() - 1);
        Film avantDernierFilm = films.get(films.size() - 2);
        Film avantAvantDernierFilm = films.get(films.size() - 3);
        derniersFilms.add(avantAvantDernierFilm);
        derniersFilms.add(avantDernierFilm);
        derniersFilms.add(dernierFilm);
        return derniersFilms;
    }

    public int getIndexProchainFilm() {
        return indexProchainFilm;
    }

    public void setIndexProchainFilm(int indexProchainFilm) {
        this.indexProchainFilm = indexProchainFilm;
    }

    public ComptePremium getComptePremium() {
        return comptePremium;
    }

    public void setComptePremium(ComptePremium comptePremium) {
        this.comptePremium = comptePremium;
    }

    public CompteDecouverte getCompteDecouverte() {
        return compteDecouverte;
    }

    public void setCompteDecouverte(CompteDecouverte compteDecouverte) {
        this.compteDecouverte = compteDecouverte;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}