package com.nttdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.repositories.Course;
import com.nttdata.repositories.Inscription;
import com.nttdata.repositories.Student;
import com.nttdata.services.ManagementServiceI;

/**
 * Aplicación de gestión de cursos.
 * 
 * @author NTT DATA
 *
 */
@SpringBootApplication
public class ProyectoNttDataSchoolApplication implements CommandLineRunner {

	/** Inyección de servicio*/
	@Autowired
	private ManagementServiceI managementService;
	
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Ejecución de la aplicación.
		SpringApplication.run(ProyectoNttDataSchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		// Constantes de auditoría.
		final Date AUDIT_DATE = new Date();
		final String AUDIT_USER = "SystemNTTData";
		
		List<Course> coursesList1 = new ArrayList<Course>();
		
		Course c1 = new Course();
		c1.setCode("CURSO-01");
		c1.setName("Java");
		c1.setPrice(1000f);
		c1.setUpdateDate(AUDIT_DATE);
		c1.setUpdateUser(AUDIT_USER);
		
		coursesList1.add(c1);
		
		Course c2 = new Course();
		c2.setCode("CURSO-02");
		c2.setName("HTML");
		c2.setPrice(150f);
		c2.setUpdateDate(AUDIT_DATE);
		c2.setUpdateUser(AUDIT_USER);
		
		coursesList1.add(c2);
		
		Student s1 = new Student();
		s1.setIdentityDoc("YB2932183");
		s1.setName("Ignacio Spera");
		s1.setAddress("Calle Martinez, Malaga");
		s1.setUpdateDate(AUDIT_DATE);
		s1.setUpdateUser(AUDIT_USER);
		
		Inscription i1 = new Inscription();
		i1.setCode("INSC-01");
		i1.setStudent(s1);
		i1.setUpdateDate(AUDIT_DATE);
		i1.setUpdateUser(AUDIT_USER);
		i1.setCourses(coursesList1);
		
		i1 = managementService.addInscription(i1);
	}

}
