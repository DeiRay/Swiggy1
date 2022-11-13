package org.example.test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class swiggy {
   RemoteWebDriver driver;


   @BeforeMethod
   public void createDriver() throws MalformedURLException {
       DesiredCapabilities ds = new DesiredCapabilities();
       ds.setCapability("deviceName", "RZ8R3110DXP");
       ds.setCapability("platformVersion", "12");
       ds.setCapability("platformName", "Android");
       ds.setCapability("appPackage", "com.sec.android.app.clockpackage");
       ds.setCapability("appActivity", "com.sec.android.app.clockpackage.ClockPackage");



       RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), ds);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


   }

    @Test
    public void Test1() {


        driver.findElement(By.id("in.swiggy.android:id/tv_primary_cta")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_location_accuracy_radio_fine")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        driver.findElement(By.id("in.swiggy.android:id/google_place_search_title_text1")).click();
        try {
            Thread.sleep(30000);
        } catch (Exception e) {

        }
        System.out.println("Done");
    }

    @AfterMethod
    public void closeDriver() {
      driver.close();
    }
}
