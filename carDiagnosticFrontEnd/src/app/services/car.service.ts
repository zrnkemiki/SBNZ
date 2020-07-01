import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Car } from '../model/car';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  private carsSource = new BehaviorSubject<Car[]>([]);
  carsObservable = this.carsSource.asObservable();
  private cars = [];
  

  constructor(private http : HttpClient, private router: Router) { }

  getCar(username: String) {
    return this.http.get<Car>('http://localhost:8081/api/car/getByUser' + "/" + username)
  }

  getUsername(){
    return this.http.get<String>('http://localhost:8081/api/myusername')
  }
}
