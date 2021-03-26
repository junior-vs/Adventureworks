package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the employeepayhistory database table.
 * 
 */
@Embeddable
public class EmployeepayhistoryPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(insertable = false, updatable = false, unique = true, nullable = false)
  private Integer businessentityid;

  @Column(unique = true, nullable = false)
  private LocalDateTime ratechangedate;

  public EmployeepayhistoryPK() {}


  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof EmployeepayhistoryPK)) {
      return false;
    }
    EmployeepayhistoryPK castOther = (EmployeepayhistoryPK) other;
    return this.businessentityid.equals(castOther.businessentityid)
        && this.ratechangedate.equals(castOther.ratechangedate);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.businessentityid.hashCode();
    hash = hash * prime + this.ratechangedate.hashCode();

    return hash;
  }
}
