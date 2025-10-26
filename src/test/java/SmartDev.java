
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SmartDev {
    private WebDriver webDriver;

    @BeforeEach
    public void getDriver(){
        webDriver = new ChromeDriver();
    }


    @Test
    public void printInfo(){
        webDriver.get("https://smartid.reinform.ru/iam/auth/realms/smart/protocol/openid-connect/auth?client_id=smart-app&redirect_uri=https%3A%2F%2Fsmart-dev.reinform-int.ru%2Foauth%2Fcallback&response_type=code&scope=openid+email+profile&state=554ddeb1-766c-48ce-b076-f3b37cdb7e2b");
        //авторизация
        webDriver.findElement(By.xpath(".//a[contains(@class,'login-page__login title_login ')]")).click();
        webDriver.findElement(By.id("username")).clear();
        webDriver.findElement(By.id("username")).sendKeys("ilya");
        webDriver.findElement(By.id("password")).clear();
        webDriver.findElement(By.id("password")).sendKeys("Ghbdtn123");
        //госуслуги - возможности - создат решение
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.id("kc-login"))).click();
        new WebDriverWait(webDriver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidebar_menu']/div[1]/cdp-menu-item/a/div/div[1]"))).click();
        new WebDriverWait(webDriver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidebar_menu']/div[1]/cdp-menu-item/div/div/cdp-menu-item[3]/a/div/div"))).click();
        // WebElement webElement2= new WebDriverWait(webDriver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable
        WebElement webElement6 = new WebDriverWait( webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='skeleton_content']/div/cdp-view/actions/div/div/div[2]/div/form/div/input")));
        webElement6.sendKeys("Создать проект Решения о проведении КНМ");
        //нажимаем кнопку найти
        new WebDriverWait(webDriver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'btn-primary') and normalize-space()='Найти']"))).click();
        WebElement webElement7 =   new WebDriverWait(webDriver , Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[text()=' Создать проект Решения о проведении КНМ ']")));
        webElement7.click();
        // webDriver.findElement (By.xpath("*[@id='skeleton_content']/div/cdp-view/actions/div/div/div[2]/div/form/div/div/button")).click();
        //((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", webElement2);
        // заполняем Вид надзора
        WebElement webElement5 =  new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='skeleton_content']/div/cdp-view/app-root/app-decision-create/div/div/div[2]/form/enter-information-form/div[1]/div/ng-select/div/div/div[3]/input")));
        webElement5.click();
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'ng-option-label') and normalize-space()='региональный государственный строительный надзор']")));
        webDriver.findElement(By.xpath("//span[contains(@class, 'ng-option-label') and normalize-space()='региональный государственный строительный надзор']")).click();
        //заполняем Основание для КНМ
        WebElement webElement8 =     new WebDriverWait(webDriver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='skeleton_content']/div/cdp-view/app-root/app-decision-create/div/div/div[2]/form/enter-information-form/div[2]/div/ng-select/div/div/div[3]/input")));
        webElement8.click();
        webElement8.sendKeys("программа проверок");
        //new WebDriverWait(webDriver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[text()='программа проверок'")));
        webDriver.findElement(By.xpath(".//span[contains(@class,'ng-option-label') and contains(@class, 'ng-star-inserted') and text()='программа проверок']")).click();
        //нажимаем кнопку добавить объект


        webDriver.findElement(By.xpath(".//button[@class='btn btn-primary ng-star-inserted']")).click();
        WebElement webElement9 = new WebDriverWait(webDriver , Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/modal-container/div/div/select-object-component/div[2]/form/div[1]/div/input")));
        webElement9.click();
        webElement9.sendKeys("232323");
        //выбираем объект
        new WebDriverWait(webDriver , Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/modal-container/div/div/select-object-component/div[2]/form/div[2]/div/table/tbody/tr/td[1]/input"))).click();
        webDriver.findElement(By.xpath("/html/body/modal-container/div/div/select-object-component/div[2]/form/div[3]/div/button[1]")).click();
//добавляем Контролируемое лицо
        new WebDriverWait(webDriver , Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='skeleton_content']/div/cdp-view/app-root/app-decision-create/div/div/div[2]/form/enter-information-form/div[4]/div/ng-select/div/div/div[3]/input"))).click();
        webDriver.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='Центр содействия жилищной реформе (Генеральный подрядчик)']")).click();
        //заполняем Тип КНМ
        webDriver.findElement(By.xpath("//*[@id='skeleton_content']/div/cdp-view/app-root/app-decision-create/div/div/div[2]/form/enter-information-form/div[8]/div/ng-select/div/div/div[3]/input")).click();
        WebElement webElement10 = webDriver.findElement(By.xpath(".//span[@class='ng-option-label ng-star-inserted' and text()='Выездная']"));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();",webElement10);
        webElement10.click();
        //добавляем Ответственный за осуществление надзора (руководитель группы)
        //  Найти и кликнуть по полю ввода
        WebElement inputField = new WebDriverWait(webDriver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//h3[normalize-space()='Уполномоченные на проведение КНМ']" +
                                "//following::label[contains(., 'Ответственный за осуществление надзора')]" +
                                "//following-sibling::div//input[@aria-autocomplete='list']")
                ));
        inputField.click();
        inputField.sendKeys("Гончаров Илья Владимирович");

// выбираем исполнителя
        WebElement option = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//h3[normalize-space()='Уполномоченные на проведение КНМ']" +
                                "//following::label[contains(., 'Ответственный за осуществление надзора')]" +
                                "//following-sibling::div//ng-dropdown-panel//span[normalize-space()='Гончаров Илья Владимирович']")
                ));
        option.click();

        //Привлечение экспертизы - да
        webDriver.findElement(By.name("yesExpertise")).click();
        webDriver.findElement(By.name("isEngageSpecialist")).click();
//заполняем Привлечь специалиста МГСН - ФИО специалиста
        WebElement FIOspecialist = new WebDriverWait(webDriver , Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'form-group')][.//label[contains(., 'ФИО специалиста')]]//input[@aria-autocomplete='list']")));
        FIOspecialist.click();
        FIOspecialist.sendKeys("Гончаров Илья Владимирович");
        webDriver.findElement(By.xpath(".//span[@class='ng-option-label ng-star-inserted' and text()='Гончаров Илья Владимирович']")).click();

        //заполняем Дата начала КНМ и Время начала КНМ
        WebElement dateStartKNM = webDriver.findElement(By.xpath("//label[contains(.,'Дата начала КНМ')]" +
                "/following-sibling::div//input[@placeholder='__.__.____' and @class='form-control']"));
        dateStartKNM.click();
        dateStartKNM.sendKeys("22102025");
        WebElement timeStartKNM = webDriver.findElement(By.xpath("//label[contains(.,'Дата начала КНМ')]" +
                "/following-sibling::div//input[@placeholder='--:--' and @class='form-control m-l-xl text-center']"));
        timeStartKNM.click();
        timeStartKNM.sendKeys(Keys.ENTER);

        //заполняем Дата окончания КНМ и Время окончания КНМ
        WebElement dateEndKNM = webDriver.findElement(By.xpath("//label[contains(.,'Дата окончания КНМ')]" +
                "/following-sibling::div//input[@placeholder='__.__.____' and @class='form-control']"));
        dateEndKNM.click();
        dateEndKNM.sendKeys("25102025");
        WebElement timeEndKNM = webDriver.findElement(By.xpath("//label[contains(.,'Дата окончания КНМ')]" +
                "/following-sibling::div//input[@placeholder='--:--' and @class='form-control m-l-xl text-center']"));
        timeEndKNM.click();
        timeEndKNM.sendKeys(Keys.ENTER);
        // заполнеяем Срок проведения КНМ (раб. дней)
       WebElement deadline = webDriver.findElement(By.xpath(".//input[@class='form-control ng-untouched ng-pristine ng-valid' and @placeholder='ДН']"));
        deadline.click();
        deadline.sendKeys("1");
        // заполнеяем Срок непосредственного взаимодействия (часов, минут)
        WebElement control = webDriver.findElement(By.xpath(".//input[@class='form-control ng-untouched ng-pristine ng-valid' and @placeholder='00:00']"));
        control.click();
        control.sendKeys("1530");
//заполняем Согласовывает
        WebElement appruve = webDriver.findElement(By.xpath("//label[contains(., 'Согласовывает')]" + "/following-sibling::div//input[@aria-autocomplete='list']"));
        appruve.click();
        appruve.sendKeys("Гончаров Илья Владимирович");
        webDriver.findElement(By.xpath(".//span[@class='ng-option-label ng-star-inserted' and text()='Гончаров Илья Владимирович']")).click();

        //заполняем Утверждает
        WebElement appruve1 = webDriver.findElement(By.xpath("//label[contains(., 'Утверждает')]" + "/following-sibling::div//input[@aria-autocomplete='list']"));
        appruve1.click();
        appruve1.sendKeys("Гончаров Илья Владимирович");
        webDriver.findElement(By.xpath(".//span[@class='ng-option-label ng-star-inserted' and text()='Гончаров Илья Владимирович']")).click();

        // завершаем
        webDriver.findElement(By.xpath(".//button[@class='btn btn-primary m-r-sm' and contains(text(),'На согласование')]")).click();

    }
    @AfterEach
    public  void out() {
        webDriver.quit();
    }
}