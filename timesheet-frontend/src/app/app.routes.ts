import { Routes } from '@angular/router';
import { TimesheetListingComponent } from './timesheet-listing/timesheet-listing.component';

export const routes: Routes = [
    { path: 'timesheet-listing', component: TimesheetListingComponent },
    { path: '', redirectTo: 'timesheet-listing', pathMatch: 'full' },
];
