package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ServicePage {

    SelenideElement serviceContent = $("#services"),
                    serviceTitle = $(".styles_services_header__04IP8 h1");


    public ServicePage checkActionTitle(String text){
        serviceTitle.shouldHave(Condition.text(text));
        return this;
    }

    public ServicePage checkServiceContent(){
        serviceContent.shouldNotBe(empty);
        return this;
    }


}
