package Assert_Tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricketScore {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\gekoDriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-2nd-test-1387604/full-scorecard");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]"));
		// Get all rows from the table
		List<WebElement> rows = e.findElements(By.tagName("tr"));
		System.out.println(rows.size());

		// Loop through each row and print the data
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Loop through each cell and print the text
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + "\t");
			}
			System.out.println(); 
		}
	}
	
}
