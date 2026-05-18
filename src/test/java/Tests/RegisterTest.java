package Tests;

import org.testng.annotations.Test;

import Pages.RegisterPage;
import base.BaseTest;

public class RegisterTest extends BaseTest {

	    @Test
	    public void verifyRegistration() {

	        RegisterPage rp = new RegisterPage(driver);

	        rp.registerUser();
	    }
	}

