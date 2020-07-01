import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ToastrModule } from 'ngx-toastr';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { VisualSymptomComponent } from './visual-symptom/visual-symptom.component';
import { RegistrationComponent } from './registration/registration.component';
import { AudioSymptomComponent } from './audio-symptom/audio-symptom.component';
import { FeelingSymptomComponent } from './feeling-symptom/feeling-symptom.component';
import { SmellSymptomComponent } from './smell-symptom/smell-symptom.component';
import { CarViewComponent } from './car-view/car-view.component';
import { JwtInterceptor } from './interceptors/jwt-interceptor';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomepageComponent,
    VisualSymptomComponent,
    RegistrationComponent,
    AudioSymptomComponent,
    FeelingSymptomComponent,
    SmellSymptomComponent,
    CarViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,    
    FormsModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({preventDuplicates: true})
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
