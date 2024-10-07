import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TimesheetListingComponent } from './timesheet-listing/timesheet-listing.component';

const routes: Routes = [
  { path: 'timesheet-listing', component: TimesheetListingComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
