import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-timesheet-listing',
  standalone: true,
  templateUrl: './timesheet-listing.component.html',
  styleUrl: './timesheet-listing.component.css',
  imports: [CommonModule],
})
export class TimesheetListingComponent implements OnInit {
  timesheetEntries: any[] = [];
  searchTask: string = '';

  constructor() {}

  ngOnInit(): void {
    this.loadEntries();
  }

  loadEntries() {
    console.log("Entries are being loaded");
    // Your logic to load timesheet entries
  }

  onCreate() {
  throw new Error('Method not implemented.');
  }

  onSearch() {
  throw new Error('Method not implemented.');
  }

  onEdit(id:any) {

  }

  onDelete(id:any) {
    
  }

}
