package fr.afpa.model;

public class Famille {
    private ComptePremium[] _comptePremiums = new ComptePremium[5];

    public ComptePremium[] get_comptePremiums() {
        return _comptePremiums;
    }

    public void set_comptePremiums(ComptePremium[] _comptePremiums) {
        this._comptePremiums = _comptePremiums;
    }

}
