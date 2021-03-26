package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import tech.adventureworks.humanresources.api.model.types.PayFrequency;


/**
 * The persistent class for the employeepayhistory database table.
 * 
 */
@Entity
@Table(name = "employeepayhistory", schema = "humanresources")
@NamedQuery(name = "Employeepayhistory.findAll", query = "SELECT e FROM Employeepayhistory e")
public class Employeepayhistory implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private EmployeepayhistoryPK id;

  @Column(nullable = false)
  private LocalDateTime modifieddate;

  @Column(nullable = false)  
  private Short payfrequency;

  @Column(nullable = false, precision = 131089)
  private BigDecimal rate;

  // bi-directional many-to-one association to Employee
  @ManyToOne
  @JoinColumn(name = "businessentityid", nullable = false, insertable = false, updatable = false)
  private Employee employee;

  public Employeepayhistory() {}


}
