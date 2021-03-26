package tech.adventureworks.humanresources.api.model;

import static javax.persistence.FetchType.LAZY;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Table(name = "department", schema = "humanresources")
@NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
public class Department implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator(name = "DEPARTMENT_DEPARTMENTID_GENERATOR",
      sequenceName = "humanresources.department_departmentid_seq", schema = "humanresources")
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
      generator = "DEPARTMENT_DEPARTMENTID_GENERATOR")
  @Column(unique = true, nullable = false)
  private Integer departmentid;

  @Column(nullable = false, columnDefinition = "Name")
  private String groupname;

  @Column(nullable = false)
  private LocalDateTime modifieddate;

  @Column(nullable = false, columnDefinition = "Name")
  private String name;

  // bi-directional many-to-one association to Employeedepartmenthistory
  @OneToMany(mappedBy = "department", fetch = LAZY)
  private List<Employeedepartmenthistory> employeedepartmenthistories;

  public Department() {}



}
