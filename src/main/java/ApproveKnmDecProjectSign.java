import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApproveKnmDecProjectSign {
    private WebDriver webDriver;

    public ApproveKnmDecProjectSign(WebDriver webDriver) {
        this.webDriver = webDriver;

    }
    By butonApprove = By.xpath(".//button[contains(text(), 'Согласовать')]");
    public void clickButonApprove(){
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(butonApprove)).click();
    }
}
