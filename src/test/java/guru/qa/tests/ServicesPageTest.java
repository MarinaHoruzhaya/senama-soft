package guru.qa.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ServicesPageTest extends BaseTest {
    @DisplayName("Проверка работоспособности раздела Services")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("smoke")
    @Test
    public void checkServiceContent(){
        step("Открыть главную страницу",() ->
                mainPage.openMainPage());

        step("Нажать кнопку service",() ->
                mainPage.clickServiceButton());

        step("Проверка отображения заголовка на страницу service",() ->
                servicePage.checkActionTitle("Our services"));

        step("Проверка содержания контента страницы service");
                servicePage.checkServiceContent();

    }
}
