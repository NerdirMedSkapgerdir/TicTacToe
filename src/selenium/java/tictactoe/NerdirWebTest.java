package tictactoe;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NerdirWebTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://nerdir-staging.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPlayer1Win() throws Exception {
    driver.get(baseUrl);
    try {
      assertEquals("Mylla", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("start-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("1");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("2");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("3");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("4");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("5");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("6");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("8");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("7");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("9");
    driver.findElement(By.id("play-button")).click();
    try {
      assertTrue(isElementPresent(By.id("replay-button")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testPlayer2Win() throws Exception {
    driver.get(baseUrl);
    try {
      assertEquals("Mylla", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("start-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("1");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("2");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("3");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("5");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("4");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("8");
    driver.findElement(By.id("play-button")).click();
    try {
      assertTrue(isElementPresent(By.id("replay-button")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test
  public void testJafntefli() throws Exception {
    driver.get(baseUrl);
    try {
      assertEquals("Mylla", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("start-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("1");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("2");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("3");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("7");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("8");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("9");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("4");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("5");
    driver.findElement(By.id("play-button")).click();
    driver.findElement(By.id("move")).clear();
    driver.findElement(By.id("move")).sendKeys("6");
    driver.findElement(By.id("play-button")).click();
    try {
      assertTrue(isElementPresent(By.id("replay-button")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @Test(expected = Exception.class)
  public void testException() throws Exception {
    driver.get(baseUrl);
    driver.navigate().refresh();
    driver.findElement(By.id("replay-button")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
