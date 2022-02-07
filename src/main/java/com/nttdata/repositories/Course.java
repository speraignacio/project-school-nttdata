package com.nttdata.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entidad: T_COURSE
 * 
 * @author NTT DATA
 *
 */

@Entity
@Table(name = "T_COURSE")

public class Course extends AbstractEntity implements Serializable  {

	/** Serial version */
	private static final long serialVersionUID = 1L;
	
	/** ID del curso PK */
	private Long courseId;

	/** Código del curso */
	private String code;

	/** Nombre del curso */
	private String name;

	/** Precio */
	private Float price;

	/** Listado de inscripciones asociados (N-M) */

	private List<Inscription> inscriptions;

	/**
	 * @return the courseId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_ID_PK")
	public Long getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
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
	 * @return the name
	 */
	@Column(name = "C_NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	@Column(name = "C_PRICE")
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the inscriptions
	 */
	@ManyToMany(mappedBy = "courses")
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}

	/**
	 * @param inscriptions the inscriptions to set
	 */
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
	
}
