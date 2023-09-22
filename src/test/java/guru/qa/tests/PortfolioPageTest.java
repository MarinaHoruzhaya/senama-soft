package guru.qa.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class PortfolioPageTest extends BaseTest {


    @DisplayName("Проверка работоспособности раздела Portfolio")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
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

