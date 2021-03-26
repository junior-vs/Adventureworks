package tech.adventureworks.humanresources.api.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.adventureworks.humanresources.api.domain.EmployeeVO;
import tech.adventureworks.humanresources.api.model.Employee;
import tech.adventureworks.humanresources.api.repositories.EmployeeRepository;

@RestController
@RequestMapping("employees")
public class EmployeeController {

  @Autowired
  private EmployeeRepository repository;



  private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);


  /**
   * @param id
   * @return
   */
  @GetMapping("/{id:[0-9][0-9]*}")
  public ResponseEntity<EmployeeVO> findById(@PathVariable final Integer id) {

    Optional<Employee> findById = repository.findById(id);

    if (findById.isEmpty())
      return ResponseEntity.notFound().build();

    EmployeeVO employeeVO = new EmployeeVO(findById.get());
    log.info(employeeVO.toString());
    return ResponseEntity.ok(employeeVO);

  }



  /**
   * @param employee
   * @return
   * 
   * @PostMapping public ResponseEntity<EmployeeRequestForm> create(final EmployeeRequestForm
   *              employee) { //TODO: process the given employee //you may want to use the following
   *              return statement, assuming that Employee#getId() or a similar method //would
   *              provide the identifier to retrieve the created Employee resource: //return
   *              Response.created(UriBuilder.fromResource(EmployeeEndpoint.class).path(String.valueOf(employee.getId())).build()).build();
   *              //return Response.created(null).build();
   * 
   * 
   *              }
   */



  /**
   * @param startPosition
   * @param maxResult
   * @return
   * 
   * @GET public List<Employee> listAll(@QueryParam("start") final Integer
   *      startPosition, @QueryParam("max") final Integer maxResult) { //TODO: retrieve the
   *      employees final List<Employee> employees = null; return employees; }
   */

  /**
   * @param id
   * @param employee
   * @return
   * 
   * @PUT @Path("/{id:[0-9][0-9]*}") public Response update(@PathParam("id") Long id, final Employee
   *      employee) { //TODO: process the given employee return Response.noContent().build(); }
   */


}
