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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entidad: T_STUDENT
 * 
 * @author NTT DATA
 *
 */

@Entity
@Table(name = "T_STUDENT")
public class Student extends AbstractEntity implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 1L;

	/** ID del estudiante PK */
	private Long studentId;
	
	/** Documento */
	private String identityDoc;
	
	/** Nombre */
	private String name;
	
	/** Dirección */
	private String address;
	
	/** Lista de inscripciones asociadas (1-N) */
	
	private List<Inscription> inscriptions;

	/**
	 * @return the studentId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_ID_PK")
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the identityDoc
	 */
	@Column(name = "C_IDENTITY_DOC", unique = true, nullable = false)
	public String getIdentityDoc() {
		return identityDoc;
	}

	/**
	 * @param identityDoc the identityDoc to set
	 */
	public void setIdentityDoc(String identityDoc) {
		this.identityDoc = identityDoc;
	}

	/**
	 * @return the name
	 */
	@Column(name = "C_NAME", nullable = false)
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
	 * @return the address
	 */
	@Column(name = "C_ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the courses
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
	
	
}
