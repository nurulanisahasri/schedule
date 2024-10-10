package service;

import entity.Timesheet;
import com.example.timesheet_backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimesheetService {

    @Autowired
    private TimesheetRepository timesheetRepository;

    // Get all timesheets
    public List<Timesheet> getAllTimesheets() {
        return timesheetRepository.findAll();
    }

    // Search timesheets by task name
    public List<Timesheet> searchTimesheets(String task) {
        return timesheetRepository.findByTaskContaining(task);
    }

    // Create a new timesheet
    public Timesheet createTimesheet(Timesheet timesheet) {
        return timesheetRepository.save(timesheet);
    }

    // Update an existing timesheet
    public Optional<Timesheet> updateTimesheet(Long id, Timesheet timesheet) {
        return timesheetRepository.findById(id).map(existing -> {
            existing.setTask(timesheet.getTask());
            existing.setStartDate(timesheet.getStartDate());
            existing.setEndDate(timesheet.getEndDate());
            existing.setStatus(timesheet.getStatus());
            return timesheetRepository.save(existing);
        });
    }

    // Delete a timesheet
    public void deleteTimesheet(Long id) {
        timesheetRepository.deleteById(id);
    }
}
