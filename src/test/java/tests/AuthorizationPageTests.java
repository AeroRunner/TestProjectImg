package tests;


import data.UserData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.AuthorizationPage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Тесты страницы авторизации")
@Tag("AllTests")@Tag("AuthTests")
public class AuthorizationPageTests extends BaseTest {
    AuthorizationPage authPage = new AuthorizationPage();
    UserData authData = new UserData();
    public MainPage mainPage = new MainPage();


    @DisplayName("Позитивный тест авторизации")
    @Test
    void positivAuthorizationTest() {
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
    }

    @DisplayName("Позитивный тест авторизации со случайно сгенерированными данными")
    @Test
    void positivAuthorizationFakeDataTest() {
        step("Вводим случайно сгенерированные имя и email в поле авторизации", () -> {
            authPage.sendTestName(authData.fakeName)
                    .sendTestEmail(authData.fakeEmail);
        });
        step("Нажимаем кнопку Next после ввода тестовых данных", () -> {
            authPage.clickNextButton();
        });
        step("Проверяем отображение страницы Gallery", () -> {
            mainPage.mainPageOpenCheck();
        });
    }
}
