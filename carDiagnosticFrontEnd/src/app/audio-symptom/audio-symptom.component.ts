import { Component, OnInit } from '@angular/core';
import { AudioSymptom } from '../model/audioSymptom';
import { Router, ActivatedRoute } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { HttpClient } from '@angular/common/http';
import { SymptomService } from '../services/symptom.service';

@Component({
  selector: 'app-audio-symptom',
  templateUrl: './audio-symptom.component.html',
  styleUrls: ['./audio-symptom.component.css']
})
export class AudioSymptomComponent implements OnInit {
  audioSymptomTemp: string;
  carTemp: string;
  carStateTemp: string;
  public audioSymptom: AudioSymptom;
  fixes;

  constructor(
    private router: Router,
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private http: HttpClient,
    private symptomService: SymptomService,
    
  ) {
    this.audioSymptomTemp = "";
    this.carStateTemp = "";
    this.carTemp = "";
    
  }

  ngOnInit() {
    this.audioSymptom = new AudioSymptom();
  }

  refresh(){
    window.location.reload();
  }

  addVisualSymptom(){
    if(this.audioSymptomTemp == "grinding"){
      this.audioSymptom.grinding = true;
    }
    else if(this.audioSymptomTemp == "squealing"){
      this.audioSymptom.squealing = true;
    }
    else if(this.audioSymptomTemp == "whistling"){
      this.audioSymptom.whistling = true;
    }
    else if(this.audioSymptomTemp == "knocking"){
      this.audioSymptom.knocking = true;
    }
    else if(this.audioSymptomTemp == "ticking"){
      this.audioSymptom.ticking = true;
    }
   

    this.symptomService.addAudioSymptom(this.audioSymptom).subscribe(resp => {this.fixes = resp;console.log(resp); });
  
  }
 
}
