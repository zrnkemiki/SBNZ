import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { VisualSymptomComponent } from './visual-symptom/visual-symptom.component';
import { RegistrationComponent } from './registration/registration.component';
import { SmellSymptomComponent } from './smell-symptom/smell-symptom.component';
import { AudioSymptomComponent } from './audio-symptom/audio-symptom.component';
import { FeelingSymptomComponent } from './feeling-symptom/feeling-symptom.component';



const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'registration', component: RegistrationComponent},
  { path: 'homepage', component: HomepageComponent},
  { path: '', component: HomepageComponent },
  { path: 'visual-symptom', component: VisualSymptomComponent},
  { path: 'smell-symptom', component: SmellSymptomComponent},
  { path: 'audio-symptom', component: AudioSymptomComponent},
  { path: 'feeling-symptom', component: FeelingSymptomComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }