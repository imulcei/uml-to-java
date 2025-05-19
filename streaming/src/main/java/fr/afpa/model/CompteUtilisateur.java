package fr.afpa.model;

public abstract class CompteUtilisateur {
    private String nom;
    private Long numeroCompte;

    public CompteUtilisateur(String nom, Long numeroCompte) {
        this.nom = nom;
        this.numeroCompte = numeroCompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
}
