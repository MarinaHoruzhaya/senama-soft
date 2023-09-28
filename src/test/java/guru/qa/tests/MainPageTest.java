package guru.qa.tests;

import guru.qa.pages.MainPage;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MainPageTest extends BaseTest{
    @Tag("smoke")
    @DisplayName("Проверка работоспособности главной страницы")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void checkMainContent() {
        step("Открыть главную страницу",() -> {
            mainPage.openMainPage();
                });

        step("Проверка отображения заголовка раздела Portfolio",() -> {
            mainPage.checkMainTitle("SENAMASOFT");
                });

        step("Нажать на кнопку read more", () -> {
            mainPage.clickReadMoreButton();
                });

        step("Проверка содержания контента секции Technologies", () -> {
            mainPage.checkTechnologiesSection();
        });
    }
}
