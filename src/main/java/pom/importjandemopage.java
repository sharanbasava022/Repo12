
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class importjandemopage {

// public WebDriver driver=null;

// public importjandemopage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public importjandemopage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='userName']")public WebElement usernamee;

@FindBy(xpath="//input[@id='password']")public WebElement passwordd;

@FindBy(xpath="//button[@id='loginBtn']")public WebElement SignInn;

@FindBy(xpath="//span[contains(text(),'Happy Me')]")public WebElement happyme;
//pomStart
	


}
