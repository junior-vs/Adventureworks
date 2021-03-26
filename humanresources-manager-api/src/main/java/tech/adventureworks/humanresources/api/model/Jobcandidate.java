package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the jobcandidate database table.
 * 
 */
@Entity
@Table(name = "jobcandidate", schema = "humanresources")
@NamedQuery(name = "Jobcandidate.findAll", query = "SELECT j FROM Jobcandidate j")
public class Jobcandidate implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator(name = "JOBCANDIDATE_JOBCANDIDATEID_GENERATOR",
      sequenceName = "JOBCANDIDATE_JOBCANDIDATEID_SEQ", schema = "humanresources")
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
      generator = "JOBCANDIDATE_JOBCANDIDATEID_GENERATOR")
  @Column(unique = true, nullable = false)
  private Integer jobcandidateid;

  @Column(nullable = false)
  private LocalDateTime modifieddate;

  @Column(columnDefinition = "xml")
  private String resume;

  // bi-directional many-to-one association to Employee
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "businessentityid")
  private Employee employee;

  public Jobcandidate() {}

}
