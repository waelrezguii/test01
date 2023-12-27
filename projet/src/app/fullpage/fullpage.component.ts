import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-fullpage',
  templateUrl: './fullpage.component.html',
  styleUrls: ['./fullpage.component.css']
})
export class FullpageComponent {
  constructor(private router: Router) {}
  isLoginPage(): boolean {
    return this.router.url === '/login';
  }
  isRegisterPage(): boolean {
    return this.router.url === '/register';
  }
}
