package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;

public class LoginTest extends BaseTest {

	 @Test
	    public void verifyLogin() {

	        LoginPage lp = new LoginPage(driver);

	        lp.login("john", "demo");
	    }


@Test
public void invalidLoginTest() {

    LoginPage lp = new LoginPage(driver);

    lp.login("wronguser", "wrongpass");

    System.out.println("Invalid login verified");
}

@Test
public void blankUsernameTest() {

    LoginPage lp = new LoginPage(driver);

    lp.login("", "demo");

    System.out.println("Blank username checked");
}

@Test
public void blankPasswordTest() {

    LoginPage lp = new LoginPage(driver);

    lp.login("john", "");

    System.out.println("Blank password checked");
}

@Test
public void failedLoginTest() {

    LoginPage lp =
    new LoginPage(driver);

    lp.login("john", "demo");

    String actualTitle =
    driver.getTitle();

    String expectedTitle =
    "Wrong Title";

    Assert.assertEquals(
    actualTitle,
    expectedTitle);
}

}