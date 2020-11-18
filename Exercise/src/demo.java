import java.util.concurrent.TimeUnit;
import org.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





//import com.sun.tools.javac.util.Assert;

public class demo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\453168\\OneDrive - Cognizant\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String baseUrl = "https://www.demoblaze.com/index.html";
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
		 WebElement Laptop_WebElement =driver.findElement(By.xpath("//a[text()='Laptops']"));
		 Laptop_WebElement.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.withMessage("Waited too long Sony vaio").until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Sony vaio i5')]")));
		 WebElement Sonylaptop_WebElement= driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
		 Sonylaptop_WebElement.click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Add')]")));
		 WebElement addd_WebElement= driver.findElement(By.xpath("//a[contains(text(),'Add')]"));
		 addd_WebElement.click();
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 driver.get(baseUrl);
		 WebElement Laptop1_WebElement =driver.findElement(By.xpath("//a[text()='Laptops']"));
		 Laptop1_WebElement.click();
		 
		 wait.withMessage("Waited too long Sony vaio").until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Dell i7 8gb')]")));
		 WebElement Delllaptop_WebElement= driver.findElement(By.xpath("//a[contains(text(),'Dell i7 8gb')]"));
		Delllaptop_WebElement.click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Add')]")));
		 WebElement add_WebElement =driver.findElement(By.xpath("//a[contains(text(),'Add')]"));
		 add_WebElement.click();
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Cart']")));
		 WebElement AddCart_WebElement= driver.findElement(By.xpath("//a[text()='Cart']"));
		AddCart_WebElement.click();
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Delete'])[2]"))).click();
		WebElement delete_WebElement =driver.findElement(By.xpath("(//a[text()='Delete'])[2]")); 
		delete_WebElement.click();
		 
		
		
		Thread.sleep(5000);
		 WebElement PlaceOrder_btn = driver.findElement(By.xpath("//button[text()='Place Order']"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", PlaceOrder_btn);
		 
		 WebElement name_WebElement	=driver.findElement(By.xpath("//input[@id='name']"));
		 WebElement country_WebElement	=driver.findElement(By.xpath("//input[@id='country']"));
		 WebElement city_WebElement	=driver.findElement(By.xpath("//input[@id='city']"));
		 WebElement creditcard_WebElement	=driver.findElement(By.xpath("//input[@id='card']"));
		 WebElement month_WebElement	=driver.findElement(By.xpath("//input[@id='month']"));
		 WebElement year_WebElement	=driver.findElement(By.xpath("//input[@id='year']"));
		 WebElement Purchasebtn_WebElement	=driver.findElement(By.xpath("//button[text()='Purchase']"));
		name_WebElement.sendKeys("Shubham Jain");
		country_WebElement.sendKeys("India");
		city_WebElement.sendKeys("Gwalior");
		creditcard_WebElement.sendKeys("12345678901234567890");
		 month_WebElement.sendKeys("November");
		 year_WebElement.sendKeys("2020");
		 Purchasebtn_WebElement.click();
		 
		 
	       
	}}
	
	

