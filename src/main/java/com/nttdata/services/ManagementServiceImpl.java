package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.repositories.Course;
import com.nttdata.repositories.CourseRepositoryI;
import com.nttdata.repositories.Inscription;
import com.nttdata.repositories.InscriptionRepository;
import com.nttdata.repositories.Student;
import com.nttdata.repositories.StudentRepositoryI;

/**
 * Servicio de gestión
 * 
 * @author NTT DATA
 *
 */
@Service
public class ManagementServiceImpl implements ManagementServiceI {

	/** Repositorio: T_STUDENT */
	@Autowired
	private StudentRepositoryI studentRepo;

	/** Repositorio: T_INSCRIPTION */
	@Autowired
	private InscriptionRepository inscriptionRepo;

	/** Repositorio: T_COURSE */
	@Autowired
	private CourseRepositoryI courseRepo;

	@Override
	public Inscription addInscription(Inscription i) {
		i = inscriptionRepo.save(i);
		return i;
	}

	@Override
	public Student addStudent(Student s) {
		s = studentRepo.save(s);
		return s;
	}

	@Override
	public Course addCourse(Course c) {
		c = courseRepo.save(c);
		return c;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public List<Inscription> getAllInscriptions() {
		return inscriptionRepo.findAll();
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public Student getStudentByIdentityDoc(String identityDoc) {
		return studentRepo.findByIdentityDoc(identityDoc);
	}

	@Override
	public Inscription getInscriptionByCode(String code) {
		return inscriptionRepo.findByCode(code);
	}

	@Override
	public Course getCourseByCode(String code) {
		return courseRepo.findByCode(code);
	}


}
