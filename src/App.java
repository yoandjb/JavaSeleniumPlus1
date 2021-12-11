import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
       
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");


    }
}
