import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception {
       //#region selectores por name
        /*System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?hl=es");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium youtube");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER); */ //pulsar Enter en cuadro de busqueda
        //#endregion

        //#region selecotores por ID
        /*System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("search_query")).sendKeys("Curso Selenium");
        driver.findElement(By.id("search-icon-legacy")).click();*/
        //#endregion
    
        //#region selector por Css selectors
       /* System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?hl=es");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div.SDkEP > div.a4bIc > input")).sendKeys("curso selenium");
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div.SDkEP > div.a4bIc > input")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();*/
        //#endregion

        //#region selectores por linktext
       /* System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://atestermate.com/AutomationExample.php");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Community of Software Testers |")).click(); //localiza un link por su texto
        Thread.sleep(3000);
        driver.quit();*/

        //#endregion

        //#region slector partial link text
        /*System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://atestermate.com/AutomationExample.php");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Trai")).click(); //localiza un link por su texto parcial
        Thread.sleep(3000);
        driver.quit();*/
        //#endregion


        //#region selector por Xpath
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();      //Full xpath
        driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("curso selenium");
        driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button")).click();
        //#endregion


    }
}
