import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { HttpClient } from '@angular/common/http';
import { SymptomService } from '../services/symptom.service';
import { SmellSymptom } from '../model/smellSymptom';
import { ReservationService } from '../services/reservation.service';
import { reservationDTO } from '../dto/reservationDTO';
import { AppointmentDTO } from '../dto/AppointmentDTO';

@Component({
  selector: 'app-smell-symptom',
  templateUrl: './smell-symptom.component.html',
  styleUrls: ['./smell-symptom.component.css']
})

export class SmellSymptomComponent implements OnInit {
  smellSymptomTemp: string;
  carTemp: string;
  carStateTemp: string;
  public smellSymptom: SmellSymptom;
  fixes;
  dates: Date[];
  reservationDTO: reservationDTO;
  appointmentDTO: AppointmentDTO;

  constructor(
    private router: Router,
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private http: HttpClient,
    private symptomService: SymptomService,
    private reservationService: ReservationService,
    
  ) {
    this.smellSymptomTemp = "";
    this.carStateTemp = "";
    this.carTemp = "";
    this.reservationDTO = new reservationDTO();
    
  }

  ngOnInit() {
    this.smellSymptom = new SmellSymptom();
  }

  refresh(){
    window.location.reload();
  }

  addVisualSymptom(){
    if(this.smellSymptomTemp == "burningSmell"){
      this.smellSymptom.burningSmell = true;
    }
    
    else if(this.smellSymptomTemp == "rottenEggSmell"){
      this.smellSymptom.rottenEggSmell = true;
    }
    else if(this.smellSymptomTemp == "sweetSmell"){
      this.smellSymptom.sweetSmell = true;
    }
    else if(this.smellSymptomTemp == "wetOldSocksSmell"){
      this.smellSymptom.wetOldSocksSmell = true;
    }
   

    this.symptomService.addSmellSymptom(this.smellSymptom).subscribe(resp => {this.fixes = resp;console.log(resp); });
  
  }

  checkReservation(fix: String){
    this.reservationDTO.fix = fix;
    this.appointmentDTO = new AppointmentDTO();
    this.reservationService.checkReservationTest(this.reservationDTO).subscribe(data => {this.appointmentDTO = data;})
  }

  reserve(date: Date){
    this.appointmentDTO.chosenDate = date;
    this.reservationService.reserve(this.appointmentDTO).subscribe(data => {alert("Reserved!");  this.router.navigate(['/homepage']);} )
  }
 
}
