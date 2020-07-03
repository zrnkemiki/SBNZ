import { Component, OnInit } from '@angular/core';
import { LoginService } from '../services/login.service';
import { CarService } from '../services/car.service';
import { Car } from '../model/car';
import { User } from '../model/User';

@Component({
  selector: 'app-car-view',
  templateUrl: './car-view.component.html',
  styleUrls: ['./car-view.component.css']
})
export class CarViewComponent implements OnInit {

  private id: number;
  car: Car;
  public currentUser : User;
  name: String;

  constructor(
    private loginService: LoginService,
    private carService: CarService,
  ) { }

  ngOnInit(): void {
    this.getUserCar();
    this.car = new Car();
  }


  getUserCar(){
    const currentUser = this.loginService.currentUserValue;
    this.currentUser = new User();
    this.currentUser = currentUser;

  this.carService.getCar(this.currentUser.username).subscribe(data => {this.car = data})


}




  

}
