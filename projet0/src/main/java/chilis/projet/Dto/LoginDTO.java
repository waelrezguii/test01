package chilis.projet.Dto;

public class LoginDTO {
    private String email;

    private String mdp;

    public LoginDTO(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public LoginDTO() {
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
}
