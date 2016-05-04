package Insurance;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Library.Excellib;

public class SESI {
	protected WebDriver driver;
  @Test
  public void Login()
  
  {
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://q2.tims.ses-ins.com");
	  System.out.println("Longin in the insurance");
	  Excellib exllib=new Excellib();
	  String un=exllib.getExcelData("Sheet2", 0, 0);
	  String pssw=exllib.getExcelData("Sheet2", 1, 0);
	  WebElement username=driver.findElement(By.id("gwt-debug-usrnameTB"));
	  WebElement password=driver.findElement(By.id("gwt-debug-passwordTextBox"));
	  username.sendKeys(un);
	  password.sendKeys(pssw);
	  Actions act=new Actions(driver);
	  driver.findElement(By.id("gwt-debug-submitBtn")).click();
	  driver.findElement(By.id("gwt-debug-newAssetItem")).click();
	  WebElement Inst=driver.findElement(By.xpath(".//*[@id='x-auto-11']/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select"));
	  Inst.click();
	  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	  //Select Inst1=new Select(Inst);
	  //Inst1.selectByValue("02");
	  WebElement office=driver.findElement(By.xpath(".//*[@id='x-auto-11']/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/select"));
	  office.click();
	  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	  //Select Ofc=new Select(Office);
	  //Ofc.selectByValue("001");
	  driver.findElement(By.id("gwt-debug-assetNbrTbx")).sendKeys("8001");
	  act.sendKeys(Keys.ENTER).perform();
	  try
	  {
	  driver.findElement(By.xpath(".//*[@id='x-auto-48']/tbody/tr[2]/td[2]/em/button")).click();
	  }
	  catch(Exception e)
	  {
		  System.out.println("no pop up");
	  }
	  WebElement PrtyDrpDwn=driver.findElement(By.id("gwt-debug-typeLbx"));
	  Select myselect=new Select(PrtyDrpDwn);
	  myselect.selectByValue("NCOMM");
	  
	  
	  //WebElement popup=driver.findElement(By.id("x-auto-255"));
	 // WebDriverWait wait=new WebDriverWait(driver,20);
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("x-auto-255")));
	  //driver.switchTo().window("x-auto-255");
	  //driver.findElement(By.id(".//*[@id='x-auto-235']/tbody/tr[2]/td[2]/em/button")).click();
	  //act.sendKeys(Keys.ENTER);
	  //driver.findElement(By.id("gwt-debug-typeLbx")).click();
	  //act.sendKeys(Keys.ARROW_DOWN).click().perform();
	  
	  //WebElement Desc=driver.findElement(By.id("gwt-debug-descLbx"));
	  //Select dropdown=new Select(Desc);
	  //Desc.click();
	  //dropdown.selectByValue("4FAM");
	  
  }
}
