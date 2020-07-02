import { Component, OnInit } from '@angular/core';
import { Car } from '../model/car';
import { CarDTO } from '../dto/carDTO';
import { CarService } from '../services/car.service';

@Component({
  selector: 'app-add-car',
  templateUrl: './add-car.component.html',
  styleUrls: ['./add-car.component.css']
})
export class AddCarComponent implements OnInit {
  carDTO: CarDTO;
  car: Car;

  constructor(
    private carService: CarService,
  ) {
    this.carDTO = new CarDTO();
   }

  ngOnInit(): void {
  }

  addCar(){
    this.carService.addCar(this.carDTO).subscribe(data => {this.car = data;})
  }

}
