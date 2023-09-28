package guru.qa.tests;

import guru.qa.pages.CareerPage;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CareerPageTest extends BaseTest {
    CareerPage careerPage = new CareerPage();

    @Tag("smoke")
    @DisplayName("Проверка работоспособности раздела Career")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void checkCareerContent() {
        step("Открыть главную страницу", () -> {
            mainPage.openMainPage();
        });

        step("Нажать кнопку career", () -> {
            mainPage.clickCareerButton();
        });

        step("Проверка отображения заголовка страницы career", () -> {
            careerPage.checkCareerTitle("Career");
        });

        step("Проверка содержания контента на странице career", () -> {
            careerPage.checkCareerContent();
        });
    }
}
