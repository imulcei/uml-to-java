package fr.afpa.model;

public class Famille {
    private ComptePremium[] comptePremiums = new ComptePremium[5];

    public Famille(ComptePremium[] comptePremiums) {
        this.comptePremiums = comptePremiums;
    }

    public ComptePremium[] getComptePremiums() {
        return comptePremiums;
    }

    public void setComptePremiums(ComptePremium[] comptePremiums) {
        this.comptePremiums = comptePremiums;
    }

}
