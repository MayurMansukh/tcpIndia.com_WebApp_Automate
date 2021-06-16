/**
 * Description : add Screenshot method used with Listener methods
 * Author      : Mayur Mansukh
 * Date        : 1/6/21
 */
package bridgelabz.utils;

import bridgelabz.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot extends Base {

    public static void takeScreenshot(String testMethodName) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\admin\\IdeaProjects\\Naukri.com_Web_Application\\ScreenshotsFile\\" + testMethodName + " " + ".jpg"));
        } catch (IOException e) {
            System.out.println("exception:" + e);
            e.printStackTrace();
        }
    }
}
