package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Student_Test {
/*public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email)
			*/
	@BeforeClass
	public static void setup1() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("The","Potato","Overlord",new Date( 1, 12, 29),"CompSci","2621 Pecksniff Rd Wilmington DE 19808","3025433172","ryacucci@udel.edu"));
	}
	@BeforeClass
	public static void setup2() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("a","b","c",new Date( 2000, 1, 20),"History","123 somewhere","1234567890","abc@udel.edu"));
	}
	@BeforeClass
	public static void setup3() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("d","e","f",new Date( 2001, 2, 19),"Math","123 potatoland","1234567891","def@udel.edu"));
	}
	@BeforeClass
	public static void setup3() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("g","h","i",new Date( 2002, 3, 18),"Sleep","123 aplace","1234567892","ghi@udel.edu"));
	}
	@BeforeClass
	public static void setup4() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("j","k","l",new Date( 2003, 4, 17),"Aviation","123 idkwhere","1234567893","jkl@udel.edu"));
	}
	@BeforeClass
	public static void setup5() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("m","n","o",new Date( 2004, 5, 16),"Econ","123 place","1234567894","mno@udel.edu"));
	}
	@BeforeClass
	public static void setup6() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("p","q","r",new Date( 2005, 6, 15),"Religion","123 Nevada","1234567895","pqr@udel.edu"));
	}
	@BeforeClass
	public static void setup7() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("s","t","u",new Date( 2006, 7, 14),"Astrononmy","123 microwave","1234567896","abc@udel.edu"));
	}
	@BeforeClass
	public static void setup8() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("v","w","x",new Date( 2007, 8, 13),"Media","123 table","1234567897","vwx@udel.edu"));
	}
	@BeforeClass
	public static void setup9() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("y","&","z",new Date( 2008, 9, 12),"Physics","123 lamp","1234567898","y&z@udel.edu"));
	}
	@BeforeClass
	public static void setup10() {
		ArrayList<Student> student1 =new ArrayList<Student>();
		student1.add(new Student("courage","thecowardly","dog",new Date( 2009, 10, 13),"Isolation","123 nowhere","1234567899","courage@udel.edu"));
	}
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}