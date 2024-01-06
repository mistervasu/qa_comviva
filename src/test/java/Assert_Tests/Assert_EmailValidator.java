package Assert_Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import emailValidation.EmailValidator;

public class Assert_EmailValidator {
	
	@Test
	public void UserEmailValidator()
	{
		EmailValidator email1 = new EmailValidator();
		
		assertTrue(email1.isValidEmail("mohd70187@gmail.com"));
//		assertTrue(email1.isValidEmail("user@example.1com"),"Invalid user email");
		
//		Checking if the email does not contains the space		
		assertFalse(email1.isValidEmail("mohd 70187@gmail.com"));
		assertFalse(email1.isValidEmail("mohd--@70187@gmail.com"));
		
	}
	
	@Test
	public void CorporateEmailValidator()
	{
		EmailValidator email1 = new EmailValidator();
		
		assertTrue(email1.isCorporateEmail("mohd70187@company.com"));
		assertFalse(email1.isCorporateEmail("mohd70187@gmail.com"));
		
	}
	
}
