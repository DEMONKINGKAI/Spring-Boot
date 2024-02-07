package com.demo.spring.demo_project.repository;
import com.demo.spring.demo_project.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
