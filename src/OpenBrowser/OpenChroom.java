package OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChroom {
    public static void main(String[] args) throws InterruptedException {
        //class name+ object name =new constructor();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        Thread.sleep(3000);
     driver.quit();
    }
}
