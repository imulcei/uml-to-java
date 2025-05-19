package fr.afpa.model;

import java.util.ArrayList;
import java.util.List;

public class Famille {
    private List<ComptePremium> comptePremiums = new ArrayList<ComptePremium>();

    public Famille(List<ComptePremium> comptePremiums) {
        this.comptePremiums = comptePremiums;
    }

    public void ajouterCompte(ComptePremium compte) {
        if (comptePremiums.size() < 5) {
            comptePremiums.add(compte);
        } else {
            System.err.println("La famille est déjà complète.");
        }
    }

    public List<ComptePremium> getComptePremiums() {
        return comptePremiums;
    }

    public void setComptePremiums(List<ComptePremium> comptePremiums) {
        this.comptePremiums = comptePremiums;
    }

}
