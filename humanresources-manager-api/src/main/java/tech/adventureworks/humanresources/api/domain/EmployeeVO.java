package tech.adventureworks.humanresources.api.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import tech.adventureworks.humanresources.api.model.Employee;
import tech.adventureworks.humanresources.api.model.types.Gender;
import tech.adventureworks.humanresources.api.model.types.MaritalStatus;

public class EmployeeVO {


  private Integer businessentityid;

  private LocalDate birthdate;

  private Boolean currentflag;

  private Gender gender;

  private LocalDate hiredate;

  private String jobtitle;

  private String loginid;

  private MaritalStatus maritalstatus;

  private LocalDateTime modifieddate;

  private String nationalidnumber;

  private String organizationnode;

  private UUID rowguid;

  private Boolean salariedflag;

  private Short sickleavehours;

  private Short vacationhours;

  public EmployeeVO(Employee employee) {
    super();
    this.businessentityid = employee.getBusinessentityid();
    this.birthdate = employee.getBirthdate();
    this.currentflag = employee.getCurrentflag();
    this.gender = employee.getGender();
    this.hiredate = employee.getHiredate();
    this.jobtitle = employee.getJobtitle();
    this.loginid = employee.getLoginid();
    this.maritalstatus = employee.getMaritalstatus();
    this.modifieddate = employee.getModifieddate();
    this.nationalidnumber = employee.getNationalidnumber();
    this.organizationnode = employee.getOrganizationnode();
    this.rowguid = employee.getRowguid();
    this.salariedflag = employee.getSalariedflag();
    this.sickleavehours = employee.getSickleavehours();
    this.vacationhours = employee.getVacationhours();
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

  @Override
  public String toString() {
    return String.format(
        "EmployeeVO [businessentityid=%s, birthdate=%s, currentflag=%s, gender=%s, hiredate=%s, jobtitle=%s, loginid=%s, maritalstatus=%s, modifieddate=%s, nationalidnumber=%s, organizationnode=%s, rowguid=%s, salariedflag=%s, sickleavehours=%s, vacationhours=%s]",
        businessentityid, birthdate, currentflag, gender, hiredate, jobtitle, loginid,
        maritalstatus, modifieddate, nationalidnumber, organizationnode, rowguid, salariedflag,
        sickleavehours, vacationhours);
  }



}
