package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentManager;
import Utilities.ScreenshotUtility;

public class TestListener
implements ITestListener {

    ExtentReports extent =
    ExtentManager.getReport();

    ExtentTest test;

    @Override
    public void onStart(
    ITestContext context) {

        System.out.println(
        "Test Execution Started");
    }

    @Override
    public void onTestStart(
    ITestResult result) {

        test = extent.createTest(
        result.getName());
    }

    @Override
    public void onTestSuccess(
    ITestResult result) {

        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(
    ITestResult result) {

        System.out.println(
        "Test Failed: "
        + result.getName());

        test.fail("Test Failed");

        ScreenshotUtility.capture(
        result.getName());
    }

    @Override
    public void onFinish(
    ITestContext context) {

        System.out.println(
        "Test Execution Finished");

        extent.flush();
    }
}