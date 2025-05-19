package fr.afpa;

import java.util.ArrayList;
import java.util.List;

import fr.afpa.model.Acteur;
import fr.afpa.model.ComptePremium;
import fr.afpa.model.Film;
import fr.afpa.model.PlaylistFilms;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<Film>();
        List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur acteur = new Acteur("Broman", "Pierce", films);
        Film film = new Film("Mars Attack", 1996, acteurs);
        Film film2 = new Film("Mars Attack2", 1996, acteurs);
        acteurs.add(acteur);
        films.add(film);
        films.add(film2);
        PlaylistFilms playlistFilms = new PlaylistFilms(1, films);
        System.out.println(playlistFilms.titresFilms());
        System.out.println(playlistFilms.obtenirDerniersFilms());
        ComptePremium compte = new ComptePremium("Dupont", 2654512L,
                new String[] { "Dupon", "FR993828032807430270270742" }, null);
        compte.ajouterPlaylist(playlistFilms);

    }
}
