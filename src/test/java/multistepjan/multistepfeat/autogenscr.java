
package multistepjan.multistepfeat;
import pom.homedemopage;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import reuseablePackage.feature.AllActions;
import reuseablePackage.feature.CustomizedReport2;
import reuseablePackage.feature.JavaMethods;
import java.net.MalformedURLException;
public class autogenscr extends  AllActions {
	AllActions actions=new AllActions();  
	JavaMethods javamethod =  new JavaMethods();  
    String fileName=this.getClass().getSimpleName();    //common
	String packageName=this.getClass().getPackage().getName();   
    String methodName;                                  //common
    // String path=new AllActions().folderCreation(fileName);   //common
    String reportRuncount = actions.getJsonValue(packageName,fileName, "ExecutionCount", "reportCount");//common added 27/03/19
    String suiteName = actions.getJsonValue(packageName,fileName,"SuiteName","suiteName");//common added 27/03/19
    String path = actions.folderCreation(reportRuncount,suiteName,fileName);   //common
	String path1 = actions.folderCreation1(reportRuncount,suiteName,fileName);
    String browserName=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Browser");   //common
    String  browserVersion=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Version");  //common
    String ipAddress=new AllActions().getJsonValue(packageName,fileName, "IpAddress", "IP"); //common
    //String packageName=this.getClass().getPackage().getName();   
    int implicitTimeOut=Integer.parseInt(new AllActions().getJsonValue(packageName,fileName, "Timeout", "ImplicitWait"));  //common
    String screenshotOption=new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnEveryStep");  //c  //c
    String failScreenshotoption = new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnFailure");//channged
	
	@Test(priority=0)
	public void step_0() throws Exception                                              //------------Method auto creation ------------//
	{
	try
	{ 
	actions.OpenNewBrowser(browserName, browserVersion,ipAddress,implicitTimeOut);
	// String videoPath=actions.startVideoRecord(reportRuncount,suiteName,fileName);
	String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();       
	actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);

	Reporter.log(browserName);
    Reporter.log(browserVersion);
    Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
    // Reporter.log(videoPath);


	}
	catch(Exception e)
	{
		String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
		//actions.CaptureOnFailure(reportRuncount,suiteName,fileName,failScreenshotoption);
		e.printStackTrace();
		// actions.captureDOM(path,fileName);
		// actions.stopVideoRecord();
		actions.CloseCurrentTab();
		throw e;
	}
	}
		@Test(priority=1)
        public void step_1() throws Exception
        {
        try
        {
            actions.EnterApplicationURL("http://web.meehappy.com:9090/login");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=2)
        public void step_2() throws Exception
        {
        try
        {
            actions.EnterData(new homedemopage(driver).username,"balakrishna@opaltechsolutions.com");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=3)
        public void step_3() throws Exception
        {
        try
        {
            actions.EnterData(new homedemopage(driver).password,"Opal@1234");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=4)
        public void step_4() throws Exception
        {
        try
        {
            actions.Click(new homedemopage(driver).login);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=5)
        public void step_5() throws Exception
        {
        try
        {
            actions.Click(new homedemopage(driver).clickupdate);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=6)
        public void step_6() throws Exception
        {
        try
        {
            actions.Click(new homedemopage(driver).editicon);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=7)
        public void step_7() throws Exception
        {
        try
        {
            actions.SelectDropDownByText(new homedemopage(driver).maritialstatus,"Single");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=8)
        public void step_8() throws Exception
        {
        try
        {
            actions.SelectDropDownByText(new homedemopage(driver).children,"1");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=9)
        public void step_9() throws Exception
        {
        try
        {
            actions.SelectDropDownByText(new homedemopage(driver).bloodgroup,"B+");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=10)
        public void step_10() throws Exception
        {
        try
        {
            actions.EnterData(new homedemopage(driver).height,"193");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=11)
        public void step_11() throws Exception
        {
        try
        {
            actions.EnterData(new homedemopage(driver).weight,"83");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=12)
        public void step_12() throws Exception
        {
        try
        {
            actions.EnterData(new homedemopage(driver).residingcyit,"bengalore");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=13)
        public void step_13() throws Exception
        {
        try
        {
            actions.Click(new homedemopage(driver).save);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=14)
        public void step_14() throws Exception
        {
        try
        {
            actions.Click(new homedemopage(driver).logout);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            
        String status="PASS";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();   
        actions.AssertAll(); 
        driver.get().quit();
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        String status="FAIL";
        javamethod.MongoDBUpdate(status,reportRuncount,fileName);
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

           
}