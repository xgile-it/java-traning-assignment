package spring.boot.employee.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.employee.crud.model.Employee;

/**
 * This is the Employee repository responsible for performing database related duties
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

