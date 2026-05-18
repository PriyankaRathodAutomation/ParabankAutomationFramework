package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class ScreenshotUtility {

    public static void capture(String fileName) {

        try {

            File src =
            ((TakesScreenshot) BaseTest.driver)
            .getScreenshotAs(OutputType.FILE);

            File dest =
            new File("screenshots/" + fileName + ".png");

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}