package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the employeedepartmenthistory database table.
 * 
 */
@Embeddable
public class EmployeedepartmenthistoryPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(insertable = false, updatable = false, unique = true, nullable = false)
  private Integer businessentityid;

  @Column(unique = true, nullable = false)
  private LocalDate startdate;

  @Column(insertable = false, updatable = false, unique = true, nullable = false)
  private Short departmentid;

  @Column(insertable = false, updatable = false, unique = true, nullable = false)
  private Short shiftid;

  public EmployeedepartmenthistoryPK() {}

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof EmployeedepartmenthistoryPK)) {
      return false;
    }
    EmployeedepartmenthistoryPK castOther = (EmployeedepartmenthistoryPK) other;
    return this.businessentityid.equals(castOther.businessentityid)
        && this.startdate.equals(castOther.startdate)
        && this.departmentid.equals(castOther.departmentid)
        && this.shiftid.equals(castOther.shiftid);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.businessentityid.hashCode();
    hash = hash * prime + this.startdate.hashCode();
    hash = hash * prime + this.departmentid.hashCode();
    hash = hash * prime + this.shiftid.hashCode();

    return hash;
  }
}
