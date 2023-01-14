package com.abc.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class InitializeDriver {
    public static WebDriver driver;
    public static InitializeDriver intializeDriver;
    private Config config = new Config();
    String osVersion = config.getOsVersion();

    public InitializeDriver() {
        getInitializeDriver();
    }

    public static InitializeDriver getInstance(){
        if(intializeDriver == null){
            intializeDriver = new InitializeDriver();
        }
        return  intializeDriver;
    }

    private  void getInitializeDriver(){
        switch (osVersion){
            case "windows":
                String userDir = System.getProperty("user.dir");
//                System.setProperty("webdriver.chrome.driver",userDir + "/src/main/resources/Drivers/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();

                driver = new ChromeDriver();
                driver.manage().window().maximize();
                System.out.println("Initialize Browser : Browser is initialized");

                break;
            case  "linux":
//                System.setProperty("webdriver.chrome.driver", userDir + "/src/main/resources/Drivers/linux/chromedriver");
                System.setProperty("webdriver.chrome.driver","resources/Drivers/linux/chromedriver.exe");
                ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments("--headless");
                driver = new ChromeDriver();
                System.out.println("Initialize Browser: Browser is initalized");
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public  void openBrowser() {
        driver.switchTo().alert().accept();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("openBrowser: Browser is opened");
    }

    public void closeBrowser(){
        driver.switchTo().alert().accept();
        driver.quit();
        System.out.println("closeBrowser: Browser is closed");
    }
}
