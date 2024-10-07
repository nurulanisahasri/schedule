import { ComponentFixture, TestBed } from '@angular/core/testing';
import { TimesheetListingComponent } from './timesheet-listing.component';

describe('TimesheetListingComponent', () => {
  let component: TimesheetListingComponent;
  let fixture: ComponentFixture<TimesheetListingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TimesheetListingComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TimesheetListingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
