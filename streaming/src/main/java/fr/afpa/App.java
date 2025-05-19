package fr.afpa;

import java.util.ArrayList;
import java.util.List;

import fr.afpa.model.CompteDecouverte;
import fr.afpa.model.ComptePremium;
import fr.afpa.model.Film;
import fr.afpa.model.PlaylistFilms;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ComptePremium comptePremium = new ComptePremium("Michel", "256314", args, playlistFilms, null);
        CompteDecouverte compteDecouverte;
        List<Film> films = new ArrayList<Film>();
        PlaylistFilms playlistFilms = new PlaylistFilms(1, comptePremium, compteDecouverte, films);
        System.out.println(playlistFilms.afficherFilms());
    }
}
