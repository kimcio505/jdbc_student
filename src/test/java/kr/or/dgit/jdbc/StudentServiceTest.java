package kr.or.dgit.jdbc;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mysql.fabric.xmlrpc.base.Data;

import kr.or.dgit.jdbc.dto.Student;
import kr.or.dgit.jdbc.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance(); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testInsertStudent() {
		Student insStudent = new Student(2, "허강민", "kimcio505@naver.com", new Date());
		int res = studentService.insertStudent(insStudent);
		Assert.assertEquals(1, res);
	}

}
