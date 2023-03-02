package com.example.qaguruless4;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mp = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.baseUrl="https://github.com";
        Configuration.browserSize="1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("/selenide/selenide");
    }

    @Test
    public void homework() {
        mp.wikiButton.click();
        mp.searchInput.setValue("SoftAssertion");
        mp.softAssertionLinkInPages.shouldBe(visible).click();
        mp.contentBlock.shouldHave(text("Using JUnit5 extend test class"));
    }
}

