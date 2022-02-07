package com.nttdata.repositories;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;

/**
 * Clase Abstracta / Super Entidad
 * @author NTT DATA
 *
 */

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	/** serial version */
	private static final long serialVersionUID = 1L;
	
	/** Usuario que actualiza BBDD */
	private String updateUser;

	/** Fecha en la que se actualiza BBDD */
	private Date updateDate;

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
