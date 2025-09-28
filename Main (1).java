
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyntraCaptureLink {

	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.Google.com");
		driver.manage().window().maximize();
		driver.get("http://www.Myntra.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   System.out.println("Myntra Website Available Links:"+ links.size());
	   for(WebElement link :links) {
		   System.out.println(link.getText());
		   
	   }
	   driver.quit();

	}

}
