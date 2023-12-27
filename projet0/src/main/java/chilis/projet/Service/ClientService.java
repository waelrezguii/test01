package chilis.projet.Service;

import chilis.projet.Dto.ClientDTO;
import chilis.projet.Dto.LoginDTO;
import chilis.projet.response.LoginResponse;

public interface ClientService {
    String addClient(ClientDTO clientDTO);

    LoginResponse loginClient(LoginDTO loginDTO);
}
