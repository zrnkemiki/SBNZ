import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FeelingSymptomComponent } from './feeling-symptom.component';

describe('FeelingSymptomComponent', () => {
  let component: FeelingSymptomComponent;
  let fixture: ComponentFixture<FeelingSymptomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FeelingSymptomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FeelingSymptomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
