package demoTests;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import demoClasses.StudentService;

public class TestStudentServiceMethods {

	static StudentService studentservice;
	@BeforeClass
	public static void init()
	{
		studentservice = new StudentService();
	}
	@Test
	public void testCountStudents() {
		assertEquals(3, studentservice.countStudents());
	}

	@Test
	public void testTotalScore() {
		assertEquals(267, studentservice.totalScore());
	}

}
