import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Activity4_3 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println(title);

        //Find the third header
        String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
                System.out.println("Third Header content is: " +thirdHeader);
        //Find fifth header colour by css selector
        String fifthHeaderColor = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fifth header color is: "+fifthHeaderColor);
        //Find the violet button and print it's classes
        String violetButton = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println("violet button attribute has: "+violetButton);
        //Find the grey button with Absolute XPath
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
        // Close the browser
        driver.close();
    }

}
