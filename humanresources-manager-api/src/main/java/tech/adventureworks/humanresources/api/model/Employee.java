package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import tech.adventureworks.humanresources.api.model.types.Gender;
import tech.adventureworks.humanresources.api.model.types.MaritalStatus;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name = "employee", schema = "humanresources")
@NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
public class Employee implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(unique = true, nullable = false)
  private Integer businessentityid;

  @Column(nullable = false)
  private LocalDate birthdate;

  @Column(nullable = false, columnDefinition = "Flag")
  private Boolean currentflag;

  @Column(nullable = false, length = 1, columnDefinition = "bpchar")
  private Gender gender;

  @Column(nullable = false)
  private LocalDate hiredate;

  @Column(nullable = false, length = 50)
  private String jobtitle;

  @Column(nullable = false, length = 256)
  private String loginid;

  @Column(nullable = false, length = 1, columnDefinition = "bpchar")
  private MaritalStatus maritalstatus;

  @Column(nullable = false)
  private LocalDateTime modifieddate;

  @Column(nullable = false, length = 15)
  private String nationalidnumber;

  @Column(length = 2147483647)
  private String organizationnode;

  @Column(nullable = false)
  private UUID rowguid;

  @Column(nullable = false, columnDefinition = "Flag")
  private Boolean salariedflag;

  @Column(nullable = false)
  private Short sickleavehours;

  @Column(nullable = false)
  private Short vacationhours;

  // bi-directional many-to-one association to Employeedepartmenthistory
  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  private List<Employeedepartmenthistory> employeedepartmenthistories;

  // bi-directional many-to-one association to Employeepayhistory
  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  private List<Employeepayhistory> employeepayhistories;

  // bi-directional many-to-one association to Jobcandidate
  @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
  private List<Jobcandidate> jobcandidates;

  public Employee() {}

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Integer getBusinessentityid() {
    return businessentityid;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public Boolean getCurrentflag() {
    return currentflag;
  }

  public Gender getGender() {
    return gender;
  }

  public LocalDate getHiredate() {
    return hiredate;
  }

  public String getJobtitle() {
    return jobtitle;
  }

  public String getLoginid() {
    return loginid;
  }

  public MaritalStatus getMaritalstatus() {
    return maritalstatus;
  }

  public LocalDateTime getModifieddate() {
    return modifieddate;
  }

  public String getNationalidnumber() {
    return nationalidnumber;
  }

  public String getOrganizationnode() {
    return organizationnode;
  }

  public UUID getRowguid() {
    return rowguid;
  }

  public Boolean getSalariedflag() {
    return salariedflag;
  }

  public Short getSickleavehours() {
    return sickleavehours;
  }

  public Short getVacationhours() {
    return vacationhours;
  }

  public List<Employeedepartmenthistory> getEmployeedepartmenthistories() {
    return employeedepartmenthistories;
  }

  public List<Employeepayhistory> getEmployeepayhistories() {
    return employeepayhistories;
  }

  public List<Jobcandidate> getJobcandidates() {
    return jobcandidates;
  }



}
