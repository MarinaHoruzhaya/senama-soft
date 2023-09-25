package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.helpers.Attach;
import guru.qa.pages.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class BaseTest {
    ServicePage servicePage = new ServicePage();
    MainPage mainPage = new MainPage();
    PortfolioPage portfolioPage =  new PortfolioPage();
    ContactsPage contactsPage = new ContactsPage();
    CareerPage careerPage = new CareerPage();

    @BeforeAll
    public static void beforeAll(){
        Configuration.browser = System.getProperty("browser","chrome");
        Configuration.baseUrl = System.getProperty("baseUrl","https://www.senamasoft.com");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion","100.0");
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = System.getProperty("remote_link","https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC",true,
                "enableVideo", true

        ));
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}


