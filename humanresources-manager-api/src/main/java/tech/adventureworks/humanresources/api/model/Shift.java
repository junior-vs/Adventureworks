package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.sql.Timestamp;
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
 * The persistent class for the shift database table.
 * 
 */
@Entity
@Table(name = "shift", schema = "humanresources")
@NamedQuery(name = "Shift.findAll", query = "SELECT s FROM Shift s")
public class Shift implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator(name = "SHIFT_SHIFTID_GENERATOR", sequenceName = "SHIFT_SHIFTID_SEQ",
      schema = "humanresources")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHIFT_SHIFTID_GENERATOR")
  @Column(unique = true, nullable = false)
  private Integer shiftid;

  @Column(nullable = false)
  private LocalDateTime endtime;

  @Column(nullable = false)
  private Timestamp modifieddate;

  @Column(nullable = false, columnDefinition = "Name")
  private String name;

  @Column(nullable = false)
  private LocalDateTime starttime;

  // bi-directional many-to-one association to Employeedepartmenthistory
  @OneToMany(mappedBy = "shift")
  private List<Employeedepartmenthistory> employeedepartmenthistories;

  public Shift() {}

}
