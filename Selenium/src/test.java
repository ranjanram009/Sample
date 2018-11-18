
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		  
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver","./Support/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}

}
