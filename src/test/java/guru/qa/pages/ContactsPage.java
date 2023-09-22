package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {
    SelenideElement contactsForm = $(".styles_contacts__zPY6b"),
                    contactsContent = $("#__next");


    public ContactsPage checkContactsTitle(String value){
        contactsForm.shouldHave(Condition.text(value));
        return this;
    }

    public ContactsPage checkContactsContent(){
        contactsContent.shouldNotBe(Condition.empty);
        return this;
    }
}
