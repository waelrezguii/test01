import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  nom: string = "";
  prenom: string = "";
  email: string = "";
  cin: string = "";
  mdp: string = "";

  constructor(private http: HttpClient) {}

  save() {
    let bodyData = {
      "nom": this.nom,
      "prenom": this.prenom,
      "email": this.email,
      "mdp": this.mdp,
      "cin": this.cin
    };

    this.http.post("http://localhost:8090/api/v1/client/save", bodyData, { responseType: 'text' })
      .subscribe((resultData: any) => {
        console.log(resultData);
        alert("Client added successfully!");
      });
  }
}
