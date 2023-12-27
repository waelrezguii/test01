import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Import your LoginComponent
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FullpageComponent } from './fullpage/fullpage.component';
import { ArticlesComponent } from './articles/articles.component';

const routes: Routes = [
  {path: '',component:FullpageComponent},
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  {path: 'articles',component:ArticlesComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
