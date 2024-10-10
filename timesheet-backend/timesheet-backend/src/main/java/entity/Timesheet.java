package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.catalina.User;

import ch.qos.logback.core.status.Status;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Timesheet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String project;
	private String task;
	private LocalDate startDate;
	private LocalDate endDate;
	
	@JoinColumn(name = "status_id")
	@ManyToOne
	private Status status;
	
	@JoinColumn(name = "user_id")
	@ManyToOne
	private User user;
	
	public Timesheet() {}
	
	public Timesheet(User user, Status status, String task, LocalDate startDate, LocalDate endDate) {
        this.user = user;
        this.status = status;
        this.task = task;
        this.startDate = startDate;
        this.endDate = endDate;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    // Getters and Setters
    
}
