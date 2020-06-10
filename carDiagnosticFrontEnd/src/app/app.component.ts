import { Component } from '@angular/core';
import { User } from './model/User';
import { BehaviorSubject, Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'carDiagnosticFrontEnd';
  public currentUser = undefined;
  
  ngOnInit() {
    this.getCurrentUser();
  }

  getCurrentUser(){
    var user = JSON.parse(localStorage.getItem('currentUser'));
    this.currentUser = user.firstName + " " + user.lastName
  }

  login(){
    window.location.replace('/login')
  }

  register(){
    window.location.replace('/registration')
  }

  logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('currentUser');
    window.location.replace('')
  }
}
