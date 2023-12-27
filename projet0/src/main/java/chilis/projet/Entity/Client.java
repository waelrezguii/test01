package chilis.projet.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name="client_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientid;
    @Column(name="Nom", length = 255)
    private String nom;
    @Column(name="Prenom", length = 255)
    private String prenom;
    @Column(name="email", length = 255)
    private String email;
    @Column(name="Mot de passe", length = 255)
    private String mdp;
    @Column(name="Cin", length = 255)
    private String cin;

    public Client(int clientid, String nom, String prenom, String email, String mdp, String cin) {
        this.clientid = clientid;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.cin = cin;
    }

    public Client() {
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
