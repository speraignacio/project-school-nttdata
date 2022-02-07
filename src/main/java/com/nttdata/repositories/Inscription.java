package com.nttdata.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidad: T_INSCRIPTION
 * 
 * @author NTT DATA
 *
 */
@Entity
@Table(name = "T_INSCRIPTION")
public class Inscription extends AbstractEntity implements Serializable  {

	/** Serial version */
	private static final long serialVersionUID = 1L;
	
	/** ID de la inscripción PK */
	private Long inscriptionId;

	/** Código de la inscripción */
	private String code;

	/** Estudiante asociado (FK N-1) */
	 
	private Student student;

	/** Cursos asociados (N-M) */
	 
	private List<Course> courses;

	/**
	 * @return the inscriptionId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_ID_PK")
	public Long getInscriptionId() {
		return inscriptionId;
	}

	/**
	 * @param inscriptionId the inscriptionId to set
	 */
	public void setInscriptionId(Long inscriptionId) {
		this.inscriptionId = inscriptionId;
	}

	/**
	 * @return the code
	 */
	@Column(name = "C_CODE", unique = true, nullable = false)
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the student
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "C_STUDENT_FK")
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the courses
	 */
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinTable(name = "T_INSCRIPTION_COURSE", joinColumns = { @JoinColumn(name = "C_INSCRIPTION_FK") }, inverseJoinColumns = { @JoinColumn(name = "C_COURSE_FK") })
	public List<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

}
