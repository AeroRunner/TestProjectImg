package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement
            randomImageFromGallery = $(".item"),
            singleImg = $(".styles_card__inner__723DB"),
            maingPageElement = $(".styles_wrapper__7CKqa"),
            closeSingleImg = $(".styles_btn_close__2qwws"),
            makeMagicButton = $("[accept=\"image/*\"]"),
            dropdownTitle = $(".styles_btn__text__yl5bJ"),
            dropDownButton = $(".styles_btn_full__3JDAI"),
            divFavorite = $$(".styles_dropdown__item__CmUA8").get(1),
            divNew = $$(".styles_dropdown__item__CmUA8").get(3),
            divOld = $$(".styles_dropdown__item__CmUA8").get(2),
            divDeleteImage1 = $$(".styles_btn_trash__BlzOt").get(0),
            divDeleteImage2 = $$(".styles_btn_trash__BlzOt").get(1),
            divDeleteImage3 = $$(".styles_btn_trash__BlzOt").get(2),
            divDeleteImage4 = $$(".styles_btn_trash__BlzOt").get(3),
            divDeleteImage5 = $$(".styles_btn_trash__BlzOt").get(5),
            divDeleteImage6 = $$(".styles_btn_trash__BlzOt").get(0),
            divDeleteImage7 = $$(".styles_btn_trash__BlzOt").get(0),
            divDeleteImage8 = $$(".styles_btn_trash__BlzOt").get(0),
            divDeleteImage9 = $$(".styles_btn_trash__BlzOt").get(0),
            divDeleteImage10 = $$(".styles_btn_trash__BlzOt").get(0),
            popUp = $(".styles_helper__inner__1Qc9x");


    public MainPage mainPageOpenCheck() {
        maingPageElement.shouldBe(Condition.visible);
        return this;
    }

    public MainPage clickRandomImg() {
        randomImageFromGallery.click();
        return this;
    }

    public MainPage seeChoiseImg() {
        singleImg.shouldBe(Condition.visible);
        return this;
    }

    public MainPage closeImg() {
        closeSingleImg.click();
        return this;
    }

    public MainPage uploadFileToMagicButton(String imageName) {
        makeMagicButton.uploadFromClasspath(imageName);
        return this;
    }

    public MainPage checkDropDownTitle(String title) {
        dropdownTitle.shouldHave(Condition.text(title));
        return this;
    }

    public MainPage clickDropDown() {
        dropDownButton.click();
        return this;
    }

    public MainPage choiseFilterFavorite() {
        divFavorite.click();
        return this;
    }

    public MainPage choiseFilterNew() {
        divNew.click();
        return this;
    }

    public MainPage choiseFilterOld() {
        divOld.click();
        return this;
    }

    public MainPage deleteAllImages() {
        divDeleteImage1.click();
        divDeleteImage2.click();
        divDeleteImage3.click();
        divDeleteImage4.click();
        divDeleteImage5.click();
        divDeleteImage6.click();
        divDeleteImage7.click();
        divDeleteImage8.click();
        divDeleteImage9.click();
        divDeleteImage10.click();
        return this;
    }
    public MainPage popUpVisible(){
        popUp.shouldBe(Condition.visible);
        return this;
    }
    public MainPage checkPopUpText(String text){
        popUp.shouldHave(Condition.text(text));
        popUp.shouldHave(Condition.text(text));
        return this;
    }

}
