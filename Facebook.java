package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {

	public static void main(String[] args) {
	
ChromeDriver driver = new ChromeDriver();
driver.get( "https://en-gb.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.name("firstname")).sendKeys("shahir");
driver.findElement(By.name("lastname")).sendKeys("Sharuk");
driver.findElement(By.name("reg_email__")).sendKeys("nasreen2810@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nasreen2810@gmail.com");
driver.findElement(By.id("password_step_input")).sendKeys("9092507378");
WebElement dayDD = driver.findElement(By.id("day"));
Select sec = new Select(dayDD);
sec.selectByVisibleText("28");
WebElement monthDD = driver.findElement(By.id("month"));
Select sec1 = new Select(monthDD);
sec1.selectByVisibleText("Oct");
WebElement yearDD = driver.findElement(By.id("year"));
Select sec2 = new Select(yearDD);
sec2.selectByVisibleText("2020");
driver.findElement(By.name("sex")).click();
driver.close();
}
}