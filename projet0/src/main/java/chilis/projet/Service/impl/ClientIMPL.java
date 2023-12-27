package chilis.projet.Service.impl;

import chilis.projet.Dto.ClientDTO;
import chilis.projet.Dto.LoginDTO;
import chilis.projet.Entity.Client;
import chilis.projet.Repo.ClientRepo;
import chilis.projet.Service.ClientService;
import chilis.projet.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientIMPL implements ClientService {
    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addClient(ClientDTO clientDTO) {
        Client client = new Client(
                clientDTO.getClientid(),
                clientDTO.getNom(),
                clientDTO.getPrenom(),

                clientDTO.getEmail(),
                this.passwordEncoder.encode(clientDTO.getMdp()),
                clientDTO.getCin()

        );
        clientRepo.save(client);
        return client.getNom();
    }

    @Override
    public LoginResponse loginClient(LoginDTO loginDTO) {
        String msg = "";
        Client client1 = clientRepo.findByEmail(loginDTO.getEmail());
        if (client1 != null) {
            String password = loginDTO.getMdp();
            String encodedPassword = client1.getMdp();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Client> client = clientRepo.findOneByEmailAndMdp(loginDTO.getEmail(), encodedPassword);
                if (client.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
}
