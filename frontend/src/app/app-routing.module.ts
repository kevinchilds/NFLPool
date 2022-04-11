import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './views/dashboard/dashboard.component';
import { LoginComponent } from './views/login/login.component';
import { PoolsComponent } from './views/pools/pools.component';
import { RegisterComponent } from './views/register/register.component';

const routes: Routes = [
  {path: "pools", component: PoolsComponent},
  {path: "dashboard", component: DashboardComponent},
  {path: "register", component: RegisterComponent},
  {path: "", component: LoginComponent},
  {path: "**", redirectTo: ""},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
