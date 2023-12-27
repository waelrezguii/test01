import { Router, NavigationExtras } from '@angular/router';
import { AuthenticationService } from '../authentification.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  isLoggedIn: boolean = false;

  constructor(private router: Router, private authService: AuthenticationService) { }

  ngOnInit(): void {
    this.authService.getLoginStatus().subscribe((status) => {
      this.isLoggedIn = status;
    });
  }

  navigateToArticles() {
  
    const fragment = 'menu-section';

   
    const navigationExtras: NavigationExtras = {
      fragment: fragment
    };

    
    this.router.navigate(['/articles'], navigationExtras);
  }
  navigateToModifierMotDePasse() {
    this.router.navigate(['/modifmdp']);
  }

  navigateToSupprimerCompte() {
    this.router.navigate(['/suppcompte']);
  }
}
