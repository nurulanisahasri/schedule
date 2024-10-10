package entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "TimesheetStatus")
public class Status {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;

    @OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
    private List<Timesheet> timesheets;

 // Constructors
    public Status() {}

    public Status(String name) {
        this.name = name;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Timesheet> getTimesheets() {
        return timesheets;
    }

    public void setTimesheets(List<Timesheet> timesheets) {
        this.timesheets = timesheets;
    }

}
