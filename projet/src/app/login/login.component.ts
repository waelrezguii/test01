import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HeaderComponent } from '../header/header.component';
import { AuthenticationService } from '../authentification.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email: string = "";
  mdp: string = "";
  
  constructor(private router:Router,private http:HttpClient, private authService : AuthenticationService) {}
  Login() {
    console.log(this.email);
    console.log(this.mdp);
 
    let bodyData = {
      email: this.email,
      mdp: this.mdp,
    };
 
        this.http.post("http://localhost:8090/api/v1/client/login", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);
 
        if (resultData.message == "Email not exits")
        {
      
          alert("Email not exits");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('/');
          this.authService.setLoginStatus(true);
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }
      });
    }
}
