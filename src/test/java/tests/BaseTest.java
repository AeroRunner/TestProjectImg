package tests;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import configs.BrowserDriverConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @BeforeAll
    public static void SetUP() {
        BrowserDriverConfig config = ConfigFactory.create(BrowserDriverConfig.class, System.getProperties());
        Configuration.browserSize = config.getBrowserSize();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.timeout = 8000;
        Configuration.pageLoadStrategy = "eager";
        if (config.isRemote() == true) {
            Configuration.remote = config.getRemoteURL();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        String baseUrl = "http://dogs-gallery.spans.dev";
        Selenide.open(baseUrl);
    }
    @AfterEach
    void afterEach() {
        BrowserDriverConfig config = ConfigFactory.create(BrowserDriverConfig.class, System.getProperties());
        Attach.screenshotAs("LastScreenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        if (config.isRemote() == true) {
            Attach.addVideo();
        }
        closeWebDriver();
    }
}
