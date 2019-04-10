package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

    By homePageUserName = By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/div/div[1]/span");
    By homePageLogOut = By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/div/div[2]/div/a[4]");
    
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    public String getHomePageDashboardUserName(){
         return    driver.findElement(homePageUserName).getText();
        }
    public void clickLogOut(){

        	driver.findElement(homePageUserName).click();
        	driver.findElement(homePageLogOut).click();
           
    }
}
