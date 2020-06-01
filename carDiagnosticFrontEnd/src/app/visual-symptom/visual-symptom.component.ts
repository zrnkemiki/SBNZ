import { Component, OnInit } from '@angular/core';
import { VisualSymptom } from '../model/visualSymptom';
import { Router } from '@angular/router'
import { ActivatedRoute } from '@angular/router'
import { ToastrService } from 'ngx-toastr';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

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
  private symptomUrl = "http://localhost:8080/visual-symptom";
  private symptomSource = new BehaviorSubject<VisualSymptom[]>([]);
  symptomsObservable = this.symptomSource.asObservable();
  fixes;

  constructor(
    private router: Router,
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private http: HttpClient
    
  ) {
    this.visualSymptomTemp = "";
    this.carStateTemp = "";
    this.carTemp = "";
  }

  ngOnInit() {
  }

  addVisualSymptom(){
    alert("Ovo je simptom: " + this.visualSymptomTemp);
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

    this.visualSymptom.carState = this.carStateTemp;
    this.visualSymptom.car = this.carTemp;
    


    

      //alert(this.visualSymptom.headlightNotWorking)
    this.http.post<String[]>(this.symptomUrl, this.visualSymptom)
    .subscribe(resp => {
      this.fixes = resp;
      console.log(resp);
        //alert("Successfully added vehicle. New " + vehicle.lineNumber + " vehicle added.");
      }
    )
  }
  /*
  addVehicle() {
    if (this.vehicle.tip !== '') {
      if (this.router.url != "/add-vehicle") {
        this.vehicleService.editVehicle(this.vehicle);
      }
      else {
        this.vehicleService.addVehicle(this.vehicle);
      }
      this.router.navigate(["/homepage"]);

    }
    else {
      this.toastr.error('Morate uneti tip vozila!');
    }
  }

*/
}
