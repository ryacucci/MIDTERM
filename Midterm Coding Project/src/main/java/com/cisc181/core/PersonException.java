package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {
	
		
		try
		{
			testException(DOB);
			if (
					com.cisc181.core.Person.getDOB()+100<Date);
		}

		catch (PersonException e){
			e.printStackTrace();

		}
		try
		{
			testException(Phone_Number);
			if (
					(String.length(
							 com.cisc181.core.Person.getPhone()))!=7);
		}

		catch (PersonException e){
			e.printStackTrace();

		}
	}



	public static void testException(String string) throws CustomException

	{

		if(string == null)

			throw new PersonException("The String value is null");

	}

}

