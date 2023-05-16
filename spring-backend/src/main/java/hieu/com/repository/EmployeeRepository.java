package hieu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hieu.com.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
