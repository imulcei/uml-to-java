package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class ComptePremium extends CompteUtilisateur {
    private String[] infoPaiement;
    private List<PlaylistFilms> _playlistFilms = new ArrayList<PlaylistFilms>();
    private Famille _famille;
}
