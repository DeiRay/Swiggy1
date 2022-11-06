package org.example;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class desiredCapabilities {

        public static void main(String[] args) throws MalformedURLException, InterruptedException {
            System.out.println("Hello world!");

            DesiredCapabilities ds = new DesiredCapabilities();
            ds.setCapability("deviceName", "RZ8R3110DXP");
            ds.setCapability("platformVersion", "12");
            ds.setCapability("platformName", "Android");
            ds.setCapability("appPackage", "com.sec.android.app.clockpackage");
            ds.setCapability("appActivity", "com.sec.android.app.clockpackage.ClockPackage");

        }
    }
