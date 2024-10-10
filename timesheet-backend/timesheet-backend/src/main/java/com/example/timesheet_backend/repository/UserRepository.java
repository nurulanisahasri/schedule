package com.example.timesheet_backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	//List<Timesheet> findByTaskContaining(String task);
}
