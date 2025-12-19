package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException{
		
		//Initiating the Chrome browser, maximizing, applying wait, launching the url
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh(); // Refreshing the page so that continue shopping is not displayed
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys", Keys.ENTER); //Searching the "Bags for Boys" and using keys to send enter		
		String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText(); // Getting the number of results populated
		System.out.println(text);
		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click(); // Selecting the first option from the filter
		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click(); //Selecting the second option from the filter

		Thread.sleep(2000);	

		driver.findElement(By.xpath("//span[@class='a-button-inner']/span")).click(); //Clicking the filter 
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click(); //Selecting New Arrivals from the options available
		
		String text2 = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-secondary']/following-sibling::a")).getText(); // Using following sibling for first time to access the name
		System.out.println(text2);
		
		String text3 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText(); // Getting the price text
		System.out.println(text3);
		
		String title = driver.getTitle(); // Getting the title
		System.out.println(title);
		
		driver.quit();		 // Quits the browser

	}

}
