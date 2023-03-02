package com.example.qaguruless4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement wikiButton = $("#wiki-tab");
    public SelenideElement searchInput = $("#wiki-pages-filter");
    public SelenideElement softAssertionLinkInPages = $$("#wiki-pages-box a").findBy(text("SoftAssertion"));
    public SelenideElement contentBlock = $(".markdown-body");
}
