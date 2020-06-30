import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AudioSymptomComponent } from './audio-symptom.component';

describe('AudioSymptomComponent', () => {
  let component: AudioSymptomComponent;
  let fixture: ComponentFixture<AudioSymptomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AudioSymptomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AudioSymptomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
