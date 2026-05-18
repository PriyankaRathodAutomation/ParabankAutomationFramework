package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;

public class LogOutTest extends BaseTest {

	    @Test
	    public void verifyLogout() {

	        LoginPage lp =
	        new LoginPage(driver);

	        lp.login("john", "demo");

	        lp.logout();

	        String title =
	        driver.getTitle();

	        Assert.assertTrue(
	        title.contains("ParaBank"));

	        System.out.println("Logout successful");
	    }
	}

