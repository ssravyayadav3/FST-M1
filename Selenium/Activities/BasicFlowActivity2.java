import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFlowActivity2 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println(title);

        //Find the About Us link using id()
        String textID = driver.findElement(By.id("about-link")).getText();
        System.out.println("Text of the element is " + textID);

        //Find the About Us link using className()
        String textClassName = driver.findElement(By.className("green")).getText();
        System.out.println("Text of the element is " + textClassName);

        //Find the About Us link using cssSelector()
        String textCSSSelector = driver.findElement(By.cssSelector(".green")).getText();
        System.out.println("Text of the element is " + textCSSSelector);

        //Find the About Us link using linkText()
        String textLinkText = driver.findElement(By.linkText("About Us")).getText();
        System.out.println("Text of the element is " + textLinkText);

        // Close the browser
        driver.close();
    }

}
