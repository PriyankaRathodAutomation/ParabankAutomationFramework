package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.TransferPage;
import base.BaseTest;

public class TransferTest extends BaseTest {

    @Test
    public void verifyTransferFunds() {

        LoginPage lp =
        new LoginPage(driver);

        lp.login("john", "demo");

        TransferPage tp =
        new TransferPage(driver);

        tp.transferFunds();

        System.out.println("Funds transferred successfully");
    }
}