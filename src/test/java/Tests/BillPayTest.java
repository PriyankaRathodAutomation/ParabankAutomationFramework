package Tests;

import org.testng.annotations.Test;

import Pages.BillPayPage;
import Pages.LoginPage;
import base.BaseTest;

public class BillPayTest extends BaseTest {

    @Test
    public void verifyBillPayment() {

        LoginPage lp =
        new LoginPage(driver);

        lp.login("john", "demo");

        BillPayPage bp =
        new BillPayPage(driver);

        bp.billPayment();

        System.out.println("Bill payment successful");
    }
}
