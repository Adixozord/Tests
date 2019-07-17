package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions().addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.navigate().to("https://www.staples.co.uk");
		// find search8ar
		WebElement search = driver.findElement(By.xpath("//*[@id=\"searchKeywords\"]"));
		// wait until visi8le
		wait.until(ExpectedConditions.visibilityOf(search));
		// type in string in search field
		search.sendKeys("canon");
		// find the 2nd element of search results
		WebElement suggestions = driver.findElement(By.xpath("//*[@id=\"SearchSuggestInner\"]/div/div/div[1]/a[2]"));
		// print its name in console
		System.out.println(suggestions.getAttribute("keywordtext"));
		suggestions.click();
		
	}
}
