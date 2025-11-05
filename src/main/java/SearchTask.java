import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchTask {
    private WebDriver webDriver;

    public SearchTask(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    //ГОСУСЛУГИ
    By gosuslugi = By.xpath("//*[@id='sidebar_menu']/div[1]/cdp-menu-item/a/div/div[1]");
    By clickSearchTask = By.xpath("//*[@id='sidebar_menu']/div[1]/cdp-menu-item/div/div/cdp-menu-item[3]/a/div/div");
    By buttonTasks = By.xpath("(.//div[text()=' Задачи '])");
    By searchTask =By.xpath("//*[@id='skeleton_content']/div/cdp-view/actions/div/div/div[2]/div/form/div/input");
    By buttunFiend = By.xpath("//button[contains(@class, 'btn-primary') and normalize-space()='Найти']");
    By clickTask = By.xpath(".//span[text()=' Создать проект Решения о проведении КНМ ']");

    //кликаем на госуслуги
    public void clickGosuslugi() {
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(gosuslugi)).click();
    }
    //4кликаем на задачи
    public void getTasks(){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(buttonTasks)).click();
    }
    //кликаем на - возможности
    public void clickVozmoznosti() {
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(clickSearchTask)).click();
    }
// ищем задачу Создать проект Решения о проведении КНМ
public void setTask(String task) {
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(searchTask)).sendKeys(task);
    }
    
    //нажимаем кнопку найти
    public void getClickFind() {
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(buttunFiend)).click();
    }

    // создать решение
    public void getClickTask() {
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(clickTask)).click();
    }
}
