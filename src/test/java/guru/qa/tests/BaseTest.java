package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.*;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    ServicePage servicePage = new ServicePage();
    MainPage mainPage = new MainPage();
    PortfolioPage portfolioPage =  new PortfolioPage();
    ContactsPage contactsPage = new ContactsPage();
    CareerPage careerPage = new CareerPage();

    @BeforeAll
    public static void beforeAll(){
        Configuration.baseUrl = "https://www.senamasoft.com";
        Configuration.pageLoadStrategy = "eager";

    }

}
