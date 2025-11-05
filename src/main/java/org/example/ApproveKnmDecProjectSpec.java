package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApproveKnmDecProjectSpec {
    private WebDriver webDriver;

    public ApproveKnmDecProjectSpec(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    By buttonPrimary = By.xpath("//button[contains(text(), 'Согласовать проведение КНМ без сотрудников управления')]");

    public void clickButtonPrimary(){
        new WebDriverWait(webDriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(buttonPrimary)).click();
    }
}
