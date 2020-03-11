
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class homedemopage {

// public WebDriver driver=null;

// public homedemopage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public homedemopage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='userName']")public WebElement username;

@FindBy(xpath="//input[@id='password']")public WebElement password;

@FindBy(xpath="//button[@id='loginBtn']")public WebElement login;

@FindBy(xpath="//a[contains(text(),'Click to update')]")public WebElement clickupdate;

@FindBy(xpath="//a[@id='edit-btn']//img")public WebElement editicon;

@FindBy(xpath="//select[@id='maritalStatus']")public WebElement maritialstatus;

@FindBy(xpath="//select[@id='numberOfChildren']")public WebElement children;

@FindBy(xpath="//select[@id='bloodGroup']")public WebElement bloodgroup;

@FindBy(xpath="//input[@id='height']")public WebElement height;

@FindBy(xpath="//input[@id='weight']")public WebElement weight;

@FindBy(xpath="//input[@id='residingCity']")public WebElement residingcyit;

@FindBy(xpath="//button[contains(text(),'Save')]")public WebElement save;

@FindBy(xpath="//a[@class='btn btn-primary dropdown-toggle blue-btn']")public WebElement logout;
//pomStart
	


}
