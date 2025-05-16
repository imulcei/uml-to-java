package fr.afpa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film {
    private String nom;
    private Date dateSortie;
    private List<PlaylistFilms> _playlistFilms = new ArrayList<PlaylistFilms>();
    private List<Acteur> _acteurs = new ArrayList<Acteur>();
}
