package com.nttdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio: T_INSCRIPTION
 * 
 * @author NTT DATA
 *
 */
@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long>{

	/**
	 * Buscar a través del código de inscripcion.
	 * 
	 * @param code
	 * @return Delivery
	 */
	public Inscription findByCode(final String code);
}
