import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimsheetListingComponent } from './timsheet-listing.component';

describe('TimsheetListingComponent', () => {
  let component: TimsheetListingComponent;
  let fixture: ComponentFixture<TimsheetListingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TimsheetListingComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TimsheetListingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
