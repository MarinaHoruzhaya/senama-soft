package guru.qa.tests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class GetInTouchFormTest extends BaseTest {


    @DisplayName("заполнение формы Get in touch")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void successfulFillTheForm(){
        step("Открыть главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Заполнить email пользователя", () -> {

        });
        step("Заполнение строки email",() -> {
            mainPage.fillUserEmail();
        });
        step("загрузка файла",() ->{
            mainPage.uploadFile();
        });
    }
}
