package Tests;

import org.testng.annotations.Test;

import Pages.AccountPage;
import Pages.LoginPage;
import base.BaseTest;



public class AccountTest extends BaseTest {

    @Test
    public void verifyOpenAccount() {

        LoginPage lp =
        new LoginPage(driver);

        lp.login("john", "demo");

        AccountPage ap =
        new AccountPage(driver);

        ap.openNewAccount();

        System.out.println("Account opened successfully");
    }
}
