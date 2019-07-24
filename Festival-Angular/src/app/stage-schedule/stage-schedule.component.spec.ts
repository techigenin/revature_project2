import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StageScheduleComponent } from './stage-schedule.component';

describe('StageScheduleComponent', () => {
  let component: StageScheduleComponent;
  let fixture: ComponentFixture<StageScheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StageScheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StageScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
