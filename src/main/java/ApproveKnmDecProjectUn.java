import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApproveKnmDecProjectUn {
    private WebDriver webDriver;

    public ApproveKnmDecProjectUn(WebDriver webDriver) {
        this.webDriver = webDriver;

    }
    By butonApprove = By.xpath(".//button[contains(text(), 'Согласовать')]");
    public void clickButonApprove(){
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(butonApprove)).click();
    }
}
