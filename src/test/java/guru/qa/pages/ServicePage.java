package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import guru.qa.tests.BaseTest;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ServicePage {

    SelenideElement serviceContent = $("#services"),
                    serviceTitle = $(".styles_services_header__04IP8 h1");

    public ServicePage openServicePage() {
        open("/services");
        return this;
    }

    public ServicePage checkActionTitle(String text){
        serviceTitle.shouldHave(Condition.text(text));
        return this;
    }

    public ServicePage checkServiceContent(){
        serviceContent.shouldNotBe(empty);
        return this;
    }


}
