package guru.qa.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import guru.qa.tests.Locale;


import java.util.Collection;
import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

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
                    attachFileButton = $("input[type='file']"),
                    titleOfAttachFile = $(".styles_emty_text__eELEI"),
                    massageField = $("textarea[placeholder='Message*']"),
                    textNotification = $(".styles_err_text__y9dSA"),
                    sendButton = $("button[type='submit']"),
                    languagesButton = $(".undefined .styles_btn_panel__UaCM9 ");



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

    public MainPage uploadFile() throws Exception {
        attachFileButton.uploadFromClasspath("example1.pdf");
        return this;
    }

    public MainPage fillMessage(String message) {
        massageField.setValue(message);
        return this;
    }

    public MainPage clickSendButton(){
        sendButton.click();
        return this;
    }

    public MainPage changeLanguage(Locale locale){
        languagesButton.$(byText(String.valueOf(locale))).click();
        return this;
    }
    public MainPage checkFormWithoutMessage() {
        textNotification.shouldHave(Condition.text("Enter your message, please"));
        return this;
    }

    public MainPage checkTechnologiesSection(){
        technologiesSection.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPage checkFileUploaded(String fileName) {
        titleOfAttachFile.shouldHave(Condition.text(fileName));
        return this;
    }

    public MainPage checkMainButtons(List<String> list) {
        $$(".undefined ul").shouldHave(CollectionCondition.texts(list));
        return this;
    }
}
