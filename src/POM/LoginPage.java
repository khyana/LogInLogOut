package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By loginLink = By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/button/span/span");
    By userName = By.id("emailInput");
    By password = By.id("passwordInput");
    By login = By.xpath("//*[@id=\"submitButton\"]/span");

    public LoginPage(WebDriver driver){
        this.driver = driver;
           }
        public void setUserName(String strUserName){
    	    	driver.findElement(userName).sendKeys(strUserName);
    }

    
    public void setPassword(String strPassword){
         driver.findElement(password).sendKeys(strPassword);
    }
     public void clickLoginLink(){
            driver.findElement(loginLink).click();
    }
    public void clickLogin(){
            driver.findElement(login).click();
    }
    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void login(String strUserName,String strPasword){
    	this.clickLoginLink();
        this.setUserName(strUserName);
        this.setPassword(strPasword);
        this.clickLogin();        
    }

}
