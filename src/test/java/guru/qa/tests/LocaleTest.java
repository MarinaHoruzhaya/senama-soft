package guru.qa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static io.qameta.allure.Allure.step;

public class LocaleTest extends BaseTest{
    static Stream<Arguments> localeTest() {
        return Stream.of(
                Arguments.of(Locale.pl, List.of("Strona główna Usługi Portfolio Kontakt Kariera Referencje")),
                Arguments.of(Locale.en, List.of("Home Services Portfolio Contacts Career Testimonials"))
        );
    }

    @DisplayName("Проверка содержания главных кнопок при изменении языка ")
    @MethodSource("localeTest")
    @ParameterizedTest(name = "При смене языка на {0} отображается {1}")
    void localeTest(Locale locale, List<String> list) {
        step("Открыть главную страницу",() ->
                mainPage.openMainPage()
        );

        step("Смена языка сайта", () ->
                mainPage.changeLanguage(locale)
        );

        step("Провекра содержания главных кнопок после смены языка", () ->
                mainPage.checkMainButtons(list)
        );
    }
}
