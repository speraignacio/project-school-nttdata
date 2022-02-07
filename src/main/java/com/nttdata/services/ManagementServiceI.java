package com.nttdata.services;

import com.nttdata.repositories.Student;
import com.nttdata.repositories.Inscription;
import com.nttdata.repositories.Course;

import java.util.List;

/**
 * Servicio de gestión
 * 
 * @author NTT DATA
 *
 */
public interface ManagementServiceI {

	/**
	 * Genera una inscripción.
	 * 
	 * @param i
	 * @return Delivery
	 */
	public Inscription addInscription(Inscription i);
	
	/**
	 * Añade un estudiante.
	 * 
	 * @param s
	 * @return Student
	 */
	public Student addStudent(Student s);
	
	/**
	 * Añade un curso.
	 * 
	 * @param c
	 * @return Course
	 */
	public Course addCourse(Course c);
	
	/**
	 * Obtiene todos los estudiantes.
	 * 
	 * @return List<Student>
	 */
	public List<Student> getAllStudents();
	
	/**
	 * Obtiene todas las inscripciones.
	 * 
	 * @return List<Inscription>
	 */
	public List<Inscription> getAllInscriptions();
	
	/**
	 * Obtiene todos los cursos.
	 * 
	 * @return List<Course>
	 */
	public List<Course> getAllCourses();
	
	/**
	 * Obtiene estudiantes por documento.
	 * 
	 * @param identityDoc
	 * @return Student
	 */
	public Student getStudentByIdentityDoc(final String identityDoc);
	
	/**
	 * Obtiene inscripción por código.
	 * 
	 * @param code
	 * @return Inscription
	 */
	public Inscription getInscriptionByCode(final String code);
	
	/**
	 * Obtiene curso por código.
	 * 
	 * @param code
	 * @return Course
	 */
	public Course getCourseByCode(final String code);
}
