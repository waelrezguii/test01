package chilis.projet.ClientController;

import chilis.projet.Dto.ClientDTO;
import chilis.projet.Dto.LoginDTO;
import chilis.projet.Service.ClientService;
import chilis.projet.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(path = "/save")
    public String saveClient(@RequestBody ClientDTO clientDTO)
    {
        String id = clientService.addClient(clientDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginClient(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = clientService.loginClient(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
