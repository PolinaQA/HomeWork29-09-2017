package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SolidOpinionTest {

    ChromeDriver wd;

    @BeforeMethod
    public void setup() throws Exception{
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void solidOpinionTest(){
     openSite();
     signUp("Polina", "milova.p.s@gmail.com", "selena", "selena");

    }

    private void signUp(String name, String email, String password, String password2) {
    wd.findElementByXPath(".//*[@id='name']").click();
    wd.findElementByXPath(".//*[@id='name']").sendKeys(name);
    wd.findElementByXPath(".//*[@id='email']").click();
    wd.findElementByXPath(".//*[@id='email']").sendKeys(email);
    wd.findElementByXPath(".//*[@id='password']").click();
    wd.findElementByXPath(".//*[@id='password']").sendKeys(password);
    wd.findElementByXPath(".//*[@id='password2']").click();
    wd.findElementByXPath(".//*[@id='password2']").sendKeys(password2);
    wd.findElementByXPath(".//*[@id='go_signup']").click();
    }

    private void openSite() {
        wd.get("https://my-release.solidopinion.com/signup");
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}
