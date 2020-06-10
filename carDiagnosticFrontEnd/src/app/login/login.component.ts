import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../services/login.service';
import { LoginDTO } from '../dto/loginDTO';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginDTO: LoginDTO;
  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit() {
    this.loginDTO = new LoginDTO();
  }

  register() {
    this.router.navigate(['/registration'])
  }

  onClick() {
    this.loginService.login(this.loginDTO);
    this.loginService.currentUser.subscribe(

      (result) => {
        if (result) {
          window.location.replace('')
        }
        else {
          //this.toastr.error('error logging');
        }
      });


  }

}
