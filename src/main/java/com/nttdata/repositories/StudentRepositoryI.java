package com.nttdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio: T_STUDENT
 * 
 * @author NTT DATA
 *
 */
@Repository
public interface StudentRepositoryI extends JpaRepository<Student, Long> {

	/**
	 * Obtención de estudiante por documento.
	 * 
	 * @param identityDoc
	 * @return Customer
	 */
	public Student findByIdentityDoc(final String identityDoc);
	
}
