import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Flex_enterKnmPassportId {
    private WebDriver webDriver;

    public Flex_enterKnmPassportId(WebDriver webDriver) {
        this.webDriver = webDriver;

    }


    By buttonGetTask = By.xpath(".//button[normalize-space()='Взять']");
    By buttonCencelTask = By.xpath(".//button[normalize-space()='Отмена']");
    By inputErknmGuid = By.name("data[ErknmDoc.erknmInfo.erknmGuid]");
    By buttonComplete = By.xpath(".//div[normalize-space()='Сведения внесены']");

    public void clickButtonGetTask() throws InterruptedException {

      new WebDriverWait(webDriver, Duration.ofSeconds(10))
              .until(ExpectedConditions.elementToBeClickable(buttonGetTask)).click();
    }
    public void setErknmGuid(){
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(inputErknmGuid)).sendKeys("12345678910");
    }
    public void clickButtonComplete() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.findElement(buttonComplete).click();
    }
}
