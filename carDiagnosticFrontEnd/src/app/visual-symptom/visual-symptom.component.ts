import { Component, OnInit } from '@angular/core';
import { VisualSymptom } from '../model/visualSymptom';
import { Router } from '@angular/router'
import { ActivatedRoute } from '@angular/router'
import { ToastrService } from 'ngx-toastr';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { SymptomService } from '../services/symptom.service';
import { ReservationService } from '../services/reservation.service';

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

  date1 = new Date();
  date2 = new Date();

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
    
  }

  ngOnInit() {
    this.visualSymptom = new VisualSymptom();
  }

  refresh(){
    window.location.reload();
  }

  addVisualSymptom(){
    debugger;
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
    this.dates = [];
    this.dates.push(this.date1);
    this.dates.push(new Date());
    this.dates.push(new Date());

    this.reservationService.checkReservation(fix).subscribe(data => {this.dates = data; alert(data)})
  }

  reserve(date: Date){
    alert(date);
  }

 
}
