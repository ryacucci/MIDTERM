package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
/*public Staff(String FirstName, String MiddleName, String LastName,
	Date DOB, String Address, String Phone_number, String Email,
	String officeHours, int rank, double salary, Date hireDate,
	eTitle Title) 
	*/
	@BeforeClass
	public static void setup1() {
		ArrayList<Staff> staff1 =new ArrayList<Staff>();
		staff1.add(new Staff("The","Potato","Overlord",new Date( 1, 12, 29),"2621 Pecksniff Rd Wilmington DE 19808","3025433172","ryacucci@udel.edu","1:15pm-9:35pm",5,
				1000000,new Date(2006, 12, 29), eTitle.MR));
	}
	@BeforeClass
	public static void setup2() {
		ArrayList<Staff> staff1 =new ArrayList<Staff>();
		staff1.add(new Staff("The","Cyber","Men",new Date( 1963, 11, 23),"Somewhere England","1","cybermen@gmail.com","9:15pm-9:25pm",4,
				10,new Date(2005, 5, 26), eTitle.MR));
	}
	@BeforeClass
	public static void setup3() {
		ArrayList<Staff> staff1 =new ArrayList<Staff>();
		staff1.add(new Staff("Bob","The","Builder",new Date( 1990, 12, 1),"778 Construction Ln","1234567890","bobbuilds4u@yahoo.com","1:15pm-1:35pm",3,
				1,new Date(1991, 12, 1), eTitle.MR));
	}
	@BeforeClass
	public static void setup4() {
		ArrayList<Staff> staff1 =new ArrayList<Staff>();
		staff1.add(new Staff("The","Daleks","Exterminate",new Date( 1966, 5, 29),"Undisclosed location","3983764628","daleks@exterminate.org","1:15pm-1:15am",2,
				1000000000,new Date(2007, 12, 29), eTitle.MR));
	}
	@BeforeClass
	public static void setup5() {
		ArrayList<Staff> staff1 =new ArrayList<Staff>();
		staff1.add(new Staff("Charzard","Is","TheBest",new Date( 1996, 12, 28),"Ashe's Pokeball","3333333333","gottacathemall@gamil.com","1:15pm-1:16pm",1,
				2,new Date(2008, 12, 29), eTitle.MR));
	}
	
	@Test
	public void test() {
		double avg= (com.cisc181.core.Staff_Test.setup1.getSalary()+com.cisc181.core.Staff_Test.setup2.getSalary()+com.cisc181.core.Staff_Test.setup3.getSalary()+com.cisc181.core.Staff_Test.setup4.getSalary()+
		com.cisc181.core.Staff_Test.setup5.getSalary())/5;
		assertEquals(avg,1001000013);
	}	 
	@Test
	public void testDOBException() {
	  boolean thrown = false;

	  try {
		  com.cisc181.core.Staff_Test.setup1.getDOB();
	  } catch (DOBException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	@Test
	public void testphoneException() {
	  boolean thrown = false;

	  try {
		  com.cisc181.core.Staff_Test.setup2.getphone_number();
	  } catch (phoneException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
}
