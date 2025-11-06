import org.example.ApproveKnmDecProjectSpec;
import org.example.Task;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SmartDev {
    private WebDriver webDriver;
    private static final String BASE_URL = "https://smartid.reinform.ru/iam/auth/realms/smart/protocol/openid-connect/auth?client_id=smart-app&redirect_uri=https%3A%2F%2Fsmart-dev.reinform-int.ru%2Foauth%2Fcallback&response_type=code&scope=openid+email+profile&state=554ddeb1-766c-48ce-b076-f3b37cdb7e2b";

    @BeforeEach
    public void getDriver() {
        webDriver = new ChromeDriver();
    }

    @Order(1)
    @Test
    public void printStartINSPECTIONDECISION() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        // заходим в возможности и ищем задачу
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.clickVozmoznosti();
        searchTask.setTask("Создать проект Решения о проведении КНМ");
        searchTask.getClickFind();
        searchTask.getClickTask();
        //заполняем стартовую форму
        StartINSPECTIONDECISION startInspectionDesigion = new StartINSPECTIONDECISION(webDriver);
        startInspectionDesigion.selectSupervisionType();
        startInspectionDesigion.selectKnmBasis();
        startInspectionDesigion.clickAddObject();
        startInspectionDesigion.searchAndSelectObject("232323");
        startInspectionDesigion.selectControlledEntity();
        startInspectionDesigion.selectKnmType();
        startInspectionDesigion.selectSupervisor("Гончаров Илья Владимирович");
        startInspectionDesigion.enableExpertiseAndSpecialist();
        startInspectionDesigion.selectSpecialist("Гончаров Илья Владимирович");
        startInspectionDesigion.setKnmDatesAndTimes("22102025", "25102025");
        startInspectionDesigion.setKnmDuration("1", "1530");
        startInspectionDesigion.selectApprover("Гончаров Илья Владимирович");
        startInspectionDesigion.selectConfirmer("Гончаров Илья Владимирович");
        startInspectionDesigion.submitForApproval();
        //проверка завершения задачи
        autorized.resoultText();

    }
    //задача Согласовать проект Решения о проведении КНМ (нач.спец. управлений)
    @Order(2)
    @Test
    public  void printApproveKnmDecProjectSpec1() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("martiushev_da","VsKexibt21");
        //заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        Task task = new Task(webDriver);
        // завершаем задачу
        task.getElementTask();
        ApproveKnmDecProjectSpec approveKnmDecProjectSpec = new ApproveKnmDecProjectSpec(webDriver);
        approveKnmDecProjectSpec.clickButtonPrimary();
    //    проверка завершения задачи
        autorized.resoultText();

    }
    //задача Согласовать проект Решения о проведении КНМ (нач.спец. управлений)
    @Order(3)
    @Test
    public  void printApproveKnmDecProjectSpec2() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        //заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        Task task = new Task(webDriver);
        task.getElementTask();
        //завершаем задачу
        ApproveKnmDecProjectSpec approveKnmDecProjectSpec = new ApproveKnmDecProjectSpec(webDriver);
        approveKnmDecProjectSpec.clickButtonPrimary();
//проверка завершения задачи
        autorized.resoultText();
//задача Согласовать проект Решения о проведении КНМ (нач.спец. управлений)
    }
    @Order(4)
    @Test
    public  void printApproveKnmDecProjectSpec3() throws InterruptedException {
    //авторизация
    Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("tupitsyna_ks","Ktupitsyna123");
        //заходим в витрину задач
    SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
    Task task = new Task(webDriver);
        task.getElementTask();
        // завершаем задачу
    ApproveKnmDecProjectSpec approveKnmDecProjectSpec = new ApproveKnmDecProjectSpec(webDriver);
        approveKnmDecProjectSpec.clickButtonPrimary();
//проверка завершения задачи
       autorized.resoultText();

//задача Согласовать проект Решения о проведении КНМ (нач.спец. управлений)
    }
    @Order(5)
    @Test
    public  void printApproveKnmDecProjectSpec4() throws InterruptedException {
    //авторизация
    Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ivanov_ii","VsKexibt21");
        //заходим в витрину задач
    SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
    Task task = new Task(webDriver);
        task.getElementTask();
        //завершаем задачу
    ApproveKnmDecProjectSpec approveKnmDecProjectSpec = new ApproveKnmDecProjectSpec(webDriver);
        approveKnmDecProjectSpec.clickButtonPrimary();
//проверка завершения задачи
      autorized.resoultText();

    }
    //Согласовать проект Решения о проведении КНМ (нач.управления)
    @Order(6)
    @Test
    public void printApproveKnmDecProjectUn() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        //заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        Task task = new Task(webDriver);
        task.getElementTask();
        //завершаем задачу
        ApproveKnmDecProjectUn approveKnmDecProjectUn = new ApproveKnmDecProjectUn(webDriver);
        approveKnmDecProjectUn.clickButonApprove();
//проверка завершения задачи
        autorized.resoultText();
    }
    //Согласовать проект Решения о проведении КНМ (нач.управления)
    @Order(7)
    @Test
    public void printApproveKnmDecProjectSign() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        // заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        Task task = new Task(webDriver);
        task.getElementTask();
        //завершаем задачу
        ApproveKnmDecProjectSign approveKnmDecProjectSign = new ApproveKnmDecProjectSign(webDriver);
        approveKnmDecProjectSign.clickButonApprove();
//проверка завершения задачи
        autorized.resoultText();
    }
    //Разместить сведения о КНМ В ЕРКНМ вручную
    @Order(8)
    @Test
    public void printFlex_changeKNMInfoToErknmManually() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        //заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        //завершаем задачу
        Task task = new Task(webDriver);
        task.getElementTask();
        Flex_changeKNMInfoToErknmManually flexChangeKNMInfoToErknmManually = new Flex_changeKNMInfoToErknmManually(webDriver);
        flexChangeKNMInfoToErknmManually.setErknmNum();
        flexChangeKNMInfoToErknmManually.clickQRDropzone();
        flexChangeKNMInfoToErknmManually.clickButtonComplete();
//проверка завершения задачи
        autorized.resoultText();

    }


//Внести идентификатор паспорта КНМ
    @Order(9)
    @Test
    public void printFlex_enterKnmPassportId() throws InterruptedException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        //заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        //завершаем задачу
        Task task = new Task(webDriver);
        task.getElementTask();
        Flex_enterKnmPassportId flex_enterKnmPassportId = new Flex_enterKnmPassportId(webDriver);
        flex_enterKnmPassportId.clickButtonGetTask();
        flex_enterKnmPassportId.setErknmGuid();
        flex_enterKnmPassportId.clickButtonComplete();
//проверка завершения задачи
        autorized.resoultText();
    }
    @Order(10)
    @Test
    public void printSignKnmDecProject() throws InterruptedException, AWTException {
        //авторизация
        Autorized autorized = new Autorized(webDriver,BASE_URL);
        autorized.autorize("ilya","Ghbdtn123");
        //заходим в витрину задач
        SearchTask searchTask = new SearchTask(webDriver);
        searchTask.clickGosuslugi();
        searchTask.getTasks();
        //завершаем задачу
        Task task = new Task(webDriver);
        task.getElementTask();
        SignKnmDecProject signKnmDecProject = new SignKnmDecProject(webDriver);
        signKnmDecProject.clickButtonCimplete();
//проверка завершения задачи
        autorized.resoultText();
    }
    @AfterEach
    public  void out() {
        webDriver.quit();
    }
}