package tech.adventureworks.humanresources.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.adventureworks.humanresources.api.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
