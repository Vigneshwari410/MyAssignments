package week8.day5.Assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions action = new Actions(driver);
		action.moveToElement(findElement).perform();
		driver.findElement(By.xpath("(//img[@alt='banner'])[5]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//div[@id='title']/h1"));
		String text = findElement2.getText();
		String replaceAll = text.replaceAll("[^a-z,^A-Z]", "");
		String text1="LOrealParis";
		System.out.println(replaceAll);
		if(replaceAll.equals(text1)) {
			System.out.println("It is LOreal Paris" );
		}
		else {
			System.out.println("It is  not LOreal Paris" );
		}
		driver.findElement(By.xpath("(//*[name()=\"svg\" and @class=\"arrow-icon\"])[1]")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("(//span[@class='title'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("//img[@src='https://images-static.nykaa.com/media/catalog/product/tr:w-220,h-220,cm-pad_resize/5/2/52d9cafLP_8901526101245_1.jpg']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
	       List<String>newWindow=new ArrayList<String>(windowHandles);
	       driver.switchTo().window(newWindow.get(1));
	       driver.findElement(By.xpath("//span[text()='180ml']")).click();
	       WebElement findElement3 = driver.findElement(By.xpath("(//span[text()='MRP:']/following-sibling::span)[1]"));
	       String text2 = findElement3.getText();
	       System.out.println(text2);
	       driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	       driver.findElement(By.xpath("(//*[name()=\"svg\" and @width=\"24\"])[6]")).click();
	       WebElement findElement4 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	       driver.switchTo().frame(findElement4);
	     //  driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[@class=' css-1l4d0ex e171rb9k3']")).click();
	       WebElement findElement5 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
	       String text3 = findElement5.getText();
	       System.out.println(text3);
	       if(text2.equals(text3)){
	    	   System.out.println("Both are same");
	       }
	       else {
	    	   System.out.println("Both are not same");
	       }
	       
	       driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	       driver.close();
	}

}
