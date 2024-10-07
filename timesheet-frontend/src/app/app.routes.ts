import { Routes } from '@angular/router';
import { TimesheetListingComponent } from './timesheet-listing/timesheet-listing.component';

export const routes: Routes = [
    { path: '', redirectTo: '/timesheet-listing', pathMatch: 'full' },
    { path: 'timesheet-listing', component: TimesheetListingComponent },
];
