package guru.qa.tests;

import guru.qa.pages.PortfolioPage;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PortfolioPageTest extends BaseTest {
    PortfolioPage portfolioPage =  new PortfolioPage();

    @DisplayName("Проверка работоспособности раздела Portfolio")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("smoke")
    @Test
    public void checkServiceContent(){
        step("Открыть главную страницу",() -> {
            mainPage.openMainPage();
        });

        step("Нажать на кнопку раздела Portfolio",() -> {
            mainPage.clickPortfolioButton();
        });

        step("Проверка отображения заголовка раздела Portfolio", () ->{
            portfolioPage.checkPortfolioTitle("Our projects");
        });

        step ("Проверка содержания контента страницы Portfolio", () ->{
                 portfolioPage.checkPortfolioContent();
        });
    }
}

