package am.itspace.companyemplyeespring.repository;

import am.itspace.companyemplyeespring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
