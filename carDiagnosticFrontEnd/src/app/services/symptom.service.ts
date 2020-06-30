import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { VisualSymptom } from '../model/visualSymptom';
import { BehaviorSubject } from 'rxjs';
import { SmellSymptom } from '../model/smellSymptom';
import { AudioSymptom } from '../model/audioSymptom';
import { FeelingSymptom } from '../model/feelingSymptom';

@Injectable({
  providedIn: 'root'
})
export class SymptomService {

  private symptomSource = new BehaviorSubject<VisualSymptom[]>([]);
  symptomsObservable = this.symptomSource.asObservable();
  fixes: String[];

  constructor(private http : HttpClient, private router: Router) { }

  addVisualSymptom(visualSymptom: VisualSymptom){
    return this.http.post<String[]>('http://localhost:8081/api/symptom/visual-symptom', visualSymptom)
   
  }

  addSmellSymptom(smellSymptom: SmellSymptom){
    return this.http.post<String[]>('http://localhost:8081/api/symptom/smell-symptom', smellSymptom)
  
  }

  addAudioSymptom(audioSymptom: AudioSymptom){
    return this.http.post<String[]>('http://localhost:8081/api/symptom/audio-symptom', audioSymptom)
  
  }

  addFeelingSymptom(feelingSymptom: FeelingSymptom){
    return this.http.post<String[]>('http://localhost:8081/api/symptom/feeling-symptom', feelingSymptom)
  
  }


}
