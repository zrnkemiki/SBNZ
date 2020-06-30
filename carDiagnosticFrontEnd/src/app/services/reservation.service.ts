import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  private dateSource = new BehaviorSubject<Date[]>([]);
  datesObservable = this.dateSource.asObservable();
  dates: Date[];
  

  constructor(private http : HttpClient, private router: Router) { }

  checkReservation(fix: String) {
    return this.http.post<Date[]>('http://localhost:8081/api/make-appointment', fix)
  }


 
}
