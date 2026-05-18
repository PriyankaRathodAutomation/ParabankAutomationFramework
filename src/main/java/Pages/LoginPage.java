package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 WebDriver driver;

	    public LoginPage(WebDriver driver) {

	        this.driver = driver;
	    }

	    By username = By.name("username");

	    By password = By.name("password");

	    By loginBtn = By.xpath("//input[@value='Log In']");
	    
	    By logoutLink = By.linkText("Log Out");

	    public void login(String user, String pass) {

	        driver.findElement(username).sendKeys(user);

	        driver.findElement(password).sendKeys(pass);

	        driver.findElement(loginBtn).click();
	    }
	    
	    public void logout() {

	        driver.findElement(logoutLink)
	        .click();
	    }
}
