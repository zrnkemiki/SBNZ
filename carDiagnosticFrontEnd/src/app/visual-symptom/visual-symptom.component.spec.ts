import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VisualSymptomComponent } from './visual-symptom.component';

describe('VisualSymptomComponent', () => {
  let component: VisualSymptomComponent;
  let fixture: ComponentFixture<VisualSymptomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VisualSymptomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VisualSymptomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
