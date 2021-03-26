package tech.adventureworks.humanresources.api.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the employeedepartmenthistory database table.
 * 
 */
@Entity
@Table(name="employeedepartmenthistory", schema = "humanresources")
@NamedQuery(name="Employeedepartmenthistory.findAll", query="SELECT e FROM Employeedepartmenthistory e")
public class Employeedepartmenthistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmployeedepartmenthistoryPK id;

	private LocalDate enddate;

	@Column(nullable=false)
	private LocalDateTime modifieddate;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="departmentid", nullable=false, insertable=false, updatable=false)
	private Department department;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="businessentityid", nullable=false, insertable=false, updatable=false)
	private Employee employee;

	//bi-directional many-to-one association to Shift
	@ManyToOne
	@JoinColumn(name="shiftid", nullable=false, insertable=false, updatable=false)
	private Shift shift;

	public Employeedepartmenthistory() {
	}


}