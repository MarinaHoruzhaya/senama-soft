package guru.qa.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class PortfolioPage {
    SelenideElement portfolioContent = $("#__next"),
                    portfolioTitle = $("div .styles_background__PVoKh");



    public PortfolioPage checkPortfolioTitle(String text){
        portfolioTitle.shouldHave(Condition.text(text));

        return this;
    }

    public PortfolioPage checkPortfolioContent(){
        portfolioContent.shouldNotBe(empty);
        return this;
    }



}
