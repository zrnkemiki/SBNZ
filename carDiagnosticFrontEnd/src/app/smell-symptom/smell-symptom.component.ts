import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { HttpClient } from '@angular/common/http';
import { SymptomService } from '../services/symptom.service';
import { SmellSymptom } from '../model/smellSymptom';

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

  constructor(
    private router: Router,
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private http: HttpClient,
    private symptomService: SymptomService,
    
  ) {
    this.smellSymptomTemp = "";
    this.carStateTemp = "";
    this.carTemp = "";
    
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
 
}
