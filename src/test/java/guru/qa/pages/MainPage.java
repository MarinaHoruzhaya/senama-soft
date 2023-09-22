package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    SelenideElement careerButton = $(".undefined a[href=\"/offers\"]"),
                    contactsButton = $(".undefined a[href=\"/contacts\"]"),
                    portfolioButton = $(".undefined a[href=\"/portfolio\"]"),
                    serviceButton = $(".undefined a[href=\"/services\"]"),
                    mainTitle = $(".styles_container__Nwnoi h1"),
                    readMoreButton = $(".styles_welcome_content__Z84k5 a[href=\"/services\"]"),
                    technologiesSection = $("#technologies"),
                    userEmail = $("input.styles_form_input__qpqJn"),
                    attachFileButton = $(".styles_file_btn__UTVOY");


    public MainPage openMainPage(){
        open("/");
        return this;
    }

    public MainPage clickCareerButton(){
        careerButton.click();
        return this;
    }

    public MainPage clickContactsButton(){
        contactsButton.click();
        return this;
    }

    public MainPage clickPortfolioButton(){
        portfolioButton.click();
        return this;
    }

    public MainPage clickServiceButton(){
        serviceButton.click();
        return this;
    }

    public MainPage checkMainTitle(String value) {
        mainTitle.shouldHave(Condition.text(value));
        return this;
    }

    public MainPage clickReadMoreButton(){
        readMoreButton.click();
        return this;
    }

    public MainPage fillUserEmail() {
        userEmail.setValue(email);
        return this;
    }

    public MainPage uploadFile() throws IllegalArgumentException  {
        attachFileButton.uploadFromClasspath("example1.docx");
        return this;
    }

    public MainPage checkTechnologiesSection(){
        technologiesSection.shouldNotBe(Condition.empty);
        return this;
    }
}
