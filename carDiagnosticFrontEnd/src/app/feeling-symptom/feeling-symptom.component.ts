import { Component, OnInit } from '@angular/core';
import { FeelingSymptom } from '../model/feelingSymptom';
import { Router, ActivatedRoute } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { HttpClient } from '@angular/common/http';
import { SymptomService } from '../services/symptom.service';

@Component({
  selector: 'app-feeling-symptom',
  templateUrl: './feeling-symptom.component.html',
  styleUrls: ['./feeling-symptom.component.css']
})
export class FeelingSymptomComponent implements OnInit {
  feelingSymptomTemp: string;
  carTemp: string;
  carStateTemp: string;
  public feelingSymptom: FeelingSymptom;
  fixes;

  constructor(
    private router: Router,
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private http: HttpClient,
    private symptomService: SymptomService,
    
  ) {
    this.feelingSymptomTemp = "";
    this.carStateTemp = "";
    this.carTemp = "";
    
  }

  ngOnInit() {
    this.feelingSymptom = new FeelingSymptom();
  }

  refresh(){
    window.location.reload();
  }

  addVisualSymptom(){
    if(this.feelingSymptomTemp == "poorBraking"){
      this.feelingSymptom.poorBraking = true;
    }
    else if(this.feelingSymptomTemp == "bouncing"){
      this.feelingSymptom.bouncing = true;
    }
    else if(this.feelingSymptomTemp == "shaking"){
      this.feelingSymptom.shaking = true;
    }
    else if(this.feelingSymptomTemp == "longStarting"){
      this.feelingSymptom.longStarting = true;
    }
    else if(this.feelingSymptomTemp == "ridesUncomfortable"){
      this.feelingSymptom.ridesUncomfortable = true;
    }
    else if(this.feelingSymptomTemp == "poorPerformance"){
      this.feelingSymptom.poorPerformance = true;
    }
   

    this.symptomService.addFeelingSymptom(this.feelingSymptom).subscribe(resp => {this.fixes = resp;console.log(resp); });
  
  }
 
}

