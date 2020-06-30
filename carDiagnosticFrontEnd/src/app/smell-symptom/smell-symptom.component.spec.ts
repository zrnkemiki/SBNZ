import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SmellSymptomComponent } from './smell-symptom.component';

describe('SmellSymptomComponent', () => {
  let component: SmellSymptomComponent;
  let fixture: ComponentFixture<SmellSymptomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SmellSymptomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SmellSymptomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
