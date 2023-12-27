package chilis.projet.Dto;

import jakarta.persistence.Column;

public class ClientDTO {
    private int clientid;

    private String nom;

    private String prenom;

    private String email;

    private String mdp;

    private String cin;

    public ClientDTO(int clientid, String nom, String prenom, String email, String mdp, String cin) {
        this.clientid = clientid;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.cin = cin;
    }

    public ClientDTO() {
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
