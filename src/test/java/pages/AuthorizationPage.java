package pages;

import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.A;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    public SelenideElement
             nameField = $("#signUp-name"),
             emailField = $("#signUp-email"),
             nextButton = $(".styles_btn__-zn2S");
    public AuthorizationPage sendTestName(String name){
        nameField.setValue(name);
        return this;
    }
    public AuthorizationPage sendTestEmail(String email){
        emailField.setValue(email);
        return this;
    }
    public AuthorizationPage clickNextButton(){
        nextButton.click();
        return this;
    }


}
