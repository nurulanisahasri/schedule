package com.example.timesheet_backend.repository;

import entity.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {
    // Custom query to find timesheets by task name (optional)
    List<Timesheet> findByTaskContaining(String task);
}
