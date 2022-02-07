package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio: T_COURSE
 * 
 * @author NTT_DATA
 *
 */
@Repository
public interface CourseRepositoryI extends JpaRepository<Course, Long>  {

	/**
	 * Búsqueda de cursos por nombre.
	 * 
	 * @param name
	 * @return List<Course>
	 */
	public List<Course> findByName(final String name);
	
	/**
	 * Búsqueda de curso por código.
	 * 
	 * @param code
	 * @return Product
	 */
	public Course findByCode(final String code);
}
