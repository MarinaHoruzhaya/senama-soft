package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

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
