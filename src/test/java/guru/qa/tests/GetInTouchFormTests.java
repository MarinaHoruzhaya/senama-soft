package guru.qa.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class GetInTouchFormTests extends BaseTest {


    @DisplayName("Успешное заполнение формы Get in touch")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("smoke")
    @Test
    public void successfulFillTheForm(){
        step("Открыть главную страницу", () -> {
            mainPage.openMainPage();
        });

        step("Заполнение строки email",() -> {
            mainPage.fillUserEmail();
        });

        step("загрузка файла",() ->{
            mainPage.uploadFile();
        });

        step("Заполнение поля message*", () ->
                mainPage.fillMessage("Hello"));

        step("Проверка содержания заголовка загруженного файла", () ->
                mainPage.checkFileUploaded("example1.pdf"));
    }

    @DisplayName("Незаполненное поле message формы Get in touch")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.NORMAL)
    @Tag("negative")
    @Test
    public void unsuccessfulFillTheForm(){
        step("Открыть главную страницу", () -> {
            mainPage.openMainPage();
        });

        step("Заполнение строки email",() -> {
            mainPage.fillUserEmail();
        });

        step("загрузка файла",() ->{
            mainPage.uploadFile();
        });

        step("Нажать на кнопку send", () -> {
            mainPage.clickSendButton();
        });

        step("Проверка отображения текста об отсутсвии message", () -> {
            mainPage.checkFormWithoutMessage();
        });
    }
}
