package myPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.*;
public class Loginout {

	WebDriver driver;
    LoginPage objLogin;
    HomePage objHomePage;
    @BeforeTest
    public void setup(){
    	System.out.println("launching Chrome browser"); 
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.festicket.com/");
        
        
    }
    
    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

    objLogin = new LoginPage(driver);
    objHomePage = new HomePage(driver);
    objLogin.login("khyanamohanty@gmail.com", "Welcome@123");
    //Verify home page
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("k"));
    objHomePage.clickLogOut();
    
}
    @AfterTest
    public void endSession()
    {
    	driver.quit();
    }
}
