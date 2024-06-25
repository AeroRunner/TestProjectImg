package tests;

import data.MainPageData;
import data.UserData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Тесты основного функционала главной страницы")
@Tag("AllTests")@Tag("MainPageTests")
public class MainPageTests extends BaseTest {

    UserData authData = new UserData();
    MainPage mainPage = new MainPage();
    AuthorizationPage authPage = new AuthorizationPage();
    MainPageData mainData = new MainPageData();

    @Test
    @DisplayName("Проверка выбора и отображения случайной картинки из галереи")
    void choiseAndSeeRandomPage() {
        step("Вводим имя и email в поле авторизации", () -> {
            authPage.sendTestName(authData.testName)
                    .sendTestEmail(authData.testEmail);
        });
        step("Нажимаем кнопку Next после ввода тестовых данных", () -> {
            authPage.clickNextButton();
        });
        step("Проверяем отображение страницы Gallery", () -> {
            mainPage.mainPageOpenCheck();
        });
        step("Выбираем случайную картинку", () -> {
            mainPage.clickRandomImg();
        });
        step("Проверяем отображение открытой картинки", () -> {
            mainPage.seeChoiseImg();
        });
        step("Закрываем картинку", () -> {
            mainPage.closeImg();
        });
    }

    @Test
    @DisplayName("Проверка загрузки картинки в галерею")
    void uploadImageTest() {
        step("Вводим имя и email в поле авторизации", () -> {
            authPage.sendTestName(authData.testName)
                    .sendTestEmail(authData.testEmail);
        });
        step("Нажимаем кнопку Next после ввода тестовых данных", () -> {
            authPage.clickNextButton();
        });
        step("Проверяем отображение страницы Gallery", () -> {
            mainPage.mainPageOpenCheck();
        });
        step("Вызываем загрузку картинки через кнопку MakeMagic", () -> {
            mainPage.uploadFileToMagicButton(authData.testImage);
        });
    }

    @Test
    @DisplayName("Проверка выпадающего списка фильтров All/Favorite/Сначала старые/Сначала новые")
    void dropdownFiltersTest() {
        step("Вводим имя и email в поле авторизации", () -> {
            authPage.sendTestName(authData.testName)
                    .sendTestEmail(authData.testEmail);
        });
        step("Нажимаем кнопку Next после ввода тестовых данных", () -> {
            authPage.clickNextButton();
        });
        step("Проверяем начальный фильтр и раскрываем выпадающий список", () -> {
            mainPage.checkDropDownTitle(mainData.titleAll)
                    .clickDropDown();
        });
        step("Выбираем фильтр Favorite и проверяем отображение", () -> {
            mainPage.choiseFilterFavorite()
                    .checkDropDownTitle(mainData.titleFavorite);
        });
        step("Выбираем фильтр Сначала старые и проверяем отображение", () -> {
            mainPage.choiseFilterOld()
                    .checkDropDownTitle(mainData.titleFirstOld);
        });
        step("Выбираем фильтр Сначала новые и проверяем отображение", () -> {
            mainPage.choiseFilterNew()
                    .checkDropDownTitle(mainData.titleFirsNew);
        });
    }

    @Test
    @DisplayName("Проверка появления pop-up и проверка текста в нём")
    void deleteAllImagesAndCheckPupUp() {
        step("Вводим имя и email в поле авторизации", () -> {
            authPage.sendTestName(authData.testName)
                    .sendTestEmail(authData.testEmail);
        });
        step("Нажимаем кнопку Next после ввода тестовых данных", () -> {
            authPage.clickNextButton();
        });
        step("Удаляем все картинки из Gallery", () -> {
            mainPage.deleteAllImages();
        });
        step("Проверяем отображение поп-апа и текста в нём", () -> {
            mainPage.popUpVisible()
                    .checkPopUpText(mainData.popUpTitle)
                    .checkPopUpText(mainData.popUptext);
        });
    }
}
