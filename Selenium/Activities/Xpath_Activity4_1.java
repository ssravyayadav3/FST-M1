import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Activity4_1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println(title);

        //Find the About Us link using id()
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        String titleAbout = driver.getTitle();
        System.out.println(titleAbout);

        // Close the browser
        driver.close();
    }

}
