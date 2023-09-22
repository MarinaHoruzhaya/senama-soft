package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    SelenideElement careerContent = $("#__next"),
                    careerTitle = $(".styles_offers_header_wrapper__Ua6Zg h1");

    public CareerPage checkCareerTitle(String text){
        careerTitle.shouldHave(Condition.text(text));

        return this;
    }

    public CareerPage checkCareerContent(){
        careerContent.shouldNotBe(empty);
        return this;
    }

}
