package Utilities;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReport() {

        ExtentSparkReporter reporter =
        new ExtentSparkReporter(
        "reports/ExtentReport.html");

        reporter.config()
        .setReportName("Parabank Automation");

        ExtentReports extent =
        new ExtentReports();

        extent.attachReporter(reporter);

        return extent;
    }
}
