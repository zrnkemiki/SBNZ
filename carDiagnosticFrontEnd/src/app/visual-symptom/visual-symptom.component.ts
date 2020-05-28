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

  public visualSymptom: VisualSymptom;
  private symptomUrl = "http://localhost:8080/visual-symptom";
  private symptomSource = new BehaviorSubject<VisualSymptom[]>([]);
  symptomsObservable = this.symptomSource.asObservable();
  private fixes;

  constructor(
    private router: Router,
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private http: HttpClient
    
  ) {
    this.visualSymptom = {headlightNotWorking: undefined };
  }

  ngOnInit() {
  }

  addVisualSymptom(){
    
    if(this.visualSymptom.headlightNotWorking){
      this.visualSymptom.headlightNotWorking = true;
    }

    

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
