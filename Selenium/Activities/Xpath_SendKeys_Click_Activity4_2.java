import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_SendKeys_Click_Activity4_2 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println(title);

        //Find the About Us link using id()
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("XYZ");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcxyz@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9987654321");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        System.out.println("Details entered and Submit button clicked successfully");
        driver.close();
    }

}
