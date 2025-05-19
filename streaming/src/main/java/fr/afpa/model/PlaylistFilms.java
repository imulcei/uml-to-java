package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class PlaylistFilms {
    private int indexProchainFilm;
    private List<Film> films = new ArrayList<Film>();

    public PlaylistFilms(int indexProchainFilm, List<Film> films) {
        this.indexProchainFilm = indexProchainFilm;
        this.films = films;
    }

    public List<String> titresFilms() {
        List<String> titresFilm = new ArrayList<String>();
        for (Film film : films) {
            titresFilm.add(film.getTitre());
        }
        return titresFilm;
    }

    public Film obtenirProchainFilm() {
        Film prochainFilm = films.get(indexProchainFilm);
        indexProchainFilm++;
        return prochainFilm;
    }

    public List<Film> obtenirDerniersFilms() {
        List<Film> derniersFilms = new ArrayList<Film>();
        int compteur = 0;
        for (int index = films.size() - 1; index >= 0 && compteur < 5; index--) {
            derniersFilms.add(films.get(index));
            compteur++;
        }
        return derniersFilms;
    }

    public void ajouterFilm(Film film) {
        films.add(film);
    }

    public int getIndexProchainFilm() {
        return indexProchainFilm;
    }

    public void setIndexProchainFilm(int indexProchainFilm) {
        this.indexProchainFilm = indexProchainFilm;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}