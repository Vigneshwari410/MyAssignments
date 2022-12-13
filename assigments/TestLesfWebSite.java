package wwek2.day4.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLesfWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("username")).sendKeys("DemoCsr");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       driver.findElement(By.linkText("Leads")).click();
	       driver.findElement(By.partialLinkText("Create")).click();
	       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
	       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	       driver.findElement(By.name("firstNameLocal")).sendKeys("Anu");
	       driver.findElement(By.name("personalTitle")).sendKeys("Tester");
	       driver.findElement(By.name("generalProfTitle")).sendKeys("SoftwareEngineer");
	       driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4000000");
	       driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("628002");
	       driver.findElement(By.name("description")).sendKeys("Tester");
	       driver.findElement(By.name("importantNote")).sendKeys("Tester");
	       driver.findElement(By.name("lastNameLocal")).sendKeys("S");
	       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	       driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1234567890");
	       driver.findElement(By.name("tickerSymbol")).sendKeys("*");
	       driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("628002");
	       driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0461");
	       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vigneshwari@gmail.com");
	       driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
	       driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Manger");
	       driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.website.com");
	       driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sita");
	       driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("14b West car,");
	       driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Thoothukudi");
	       driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("628002");
	       driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0461");
	       driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sita");
	       driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("45 T North street,");
	       driver.findElement(By.className("smallSubmit")).click();
	}

}
