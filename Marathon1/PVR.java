package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVR {
	
public static void main(String[] args) throws InterruptedException {
	
	//launching as a guest user
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--guest");
	
	//launching the chrome, maximizing, implicit wait given, launching the url	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.pvrcinemas.com/");
	
	driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click(); // Select the option as cinema from movie
	
	driver.findElement(By.xpath("//div[@id='cinema']")).click(); // Selecting the preferred theatre
	driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click(); 

	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[3]")).click(); //Selecting the date field since it is already visible I am going to just select the options
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li")).click(); // Selecting the movie 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[2]")).click(); // Selecting the show timings
	driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click(); //Clicking on the book button
	
	driver.findElement(By.xpath("//button[text()='Accept']")).click(); // Accepting the popup as accept since it was a A certificate film
	
	driver.findElement(By.xpath("(//span[text()='13'])[3]")).click(); //Selecting the seats
	driver.findElement(By.xpath("//button[@class='sc-bbbBoY kbsOBB btn-proceeded']")).click(); //Clicking on the proceed button
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click(); // Closing the non model alert
	
	String title = driver.getTitle(); // Getting the title of the page
	System.out.println(title);
	
	driver.quit(); // Closes the browser
	
	
	
	
	
}
}
