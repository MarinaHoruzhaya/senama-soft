package guru.qa.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ContactsPageTest extends BaseTest {

    @Tag("smoke")
    @DisplayName("Проверка работоспособности раздела Contacts")
    @Owner("HoruzhayaMarina")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void checkContactsContent(){
        step("Открыть главную страницу", () -> {
        mainPage.openMainPage();});

        step("Нажать кнопку contacts", () -> {
        mainPage.clickContactsButton();});

        step("Проверка отображения заголовка страницы contacts",() -> {
        contactsPage.checkContactsTitle("Contacts");});

        step("Проверка содержания контента на странице contacts", () -> {
        contactsPage.checkContactsContent();});
    }
}
