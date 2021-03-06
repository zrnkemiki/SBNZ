import { Component, OnInit } from '@angular/core';
import { VisualSymptom } from '../model/visualSymptom';
import { Router } from '@angular/router'
import { ActivatedRoute } from '@angular/router'
import { ToastrService } from 'ngx-toastr';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { SymptomService } from '../services/symptom.service';
import { ReservationService } from '../services/reservation.service';
import { reservationDTO } from '../dto/reservationDTO';
import { AppointmentDTO } from '../dto/AppointmentDTO';

@Component({
  selector: 'app-visual-symptom',
  templateUrl: './visual-symptom.component.html',
  styleUrls: ['./visual-symptom.component.css']
})
export class VisualSymptomComponent implements OnInit {
  visualSymptomTemp: string;
  carTemp: string;
  carStateTemp: string;
  public visualSymptom: VisualSymptom;
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
    this.visualSymptomTemp = "";
    this.carStateTemp = "";
    this.carTemp = "";
    this.reservationDTO = new reservationDTO();
    
  }

  ngOnInit() {
    this.visualSymptom = new VisualSymptom();
  }

  refresh(){
    window.location.reload();
  }

  addVisualSymptom(){
    if(this.visualSymptomTemp == "headlight"){
      this.visualSymptom.headlightNotWorking = true;
    }
    else if(this.visualSymptomTemp == "taillight"){
      this.visualSymptom.taillightNotWorking = true;
    }
    else if(this.visualSymptomTemp == "electricWindows"){
      this.visualSymptom.electricWindowNotWorking = true;
    }
    else if(this.visualSymptomTemp == "oilPuddle"){
      this.visualSymptom.oilPuddleUnderCar = true;
    }
    else if(this.visualSymptomTemp == "fluidPuddle"){
      this.visualSymptom.fluidPuddle = true;
    }
    else if(this.visualSymptomTemp == "whiteSmoke"){
      this.visualSymptom.whiteSmoke = true;
    }
    else if(this.visualSymptomTemp == "blueSmoke"){
      this.visualSymptom.blueSmoke = true;
    }
    else if(this.visualSymptomTemp == "blackSmoke"){
      this.visualSymptom.blackSmoke = true;
    }
    else if(this.visualSymptomTemp == "oilDashLight"){
      this.visualSymptom.oilDashLight = true;
    }
    else if(this.visualSymptomTemp == "coolantDashLight"){
      this.visualSymptom.coolantDashLight = true;
    }
    else if(this.visualSymptomTemp == "steeringWheelDashLight"){
      this.visualSymptom.steeringWheelDashLight = true;
    }
    else if(this.visualSymptomTemp == "brakePadsDashLight"){
      this.visualSymptom.brakePadsDashLight = true;
    }
    else if(this.visualSymptomTemp == "dpfDashLight"){
      this.visualSymptom.dpfDashLight = true;
    }
    else if(this.visualSymptomTemp == "airConditionNotWorking"){
      this.visualSymptom.airConditionNotWorking = true;
    }
    else if(this.visualSymptomTemp == "engineOverHeating"){
      this.visualSymptom.engineOverHeating = true;
    }
    else if(this.visualSymptomTemp == "unevenTyreWear"){
      this.visualSymptom.unevenTyreWear = true;
    }
    else if(this.visualSymptomTemp == "engineStartProblem"){
      this.visualSymptom.engineStartProblem = true;
    }
    else if(this.visualSymptomTemp == "engineShaking"){
      this.visualSymptom.engineShaking = true;
    }
    else if(this.visualSymptomTemp == "carUnstable"){
      this.visualSymptom.carUnstable = true;
    }
    else if(this.visualSymptomTemp == "brakeFluidLow"){
      this.visualSymptom.brakeFluidLow = true;
    }

  


    this.symptomService.addVisualSymptom(this.visualSymptom).subscribe(resp => {this.fixes = resp;console.log(resp); });
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
