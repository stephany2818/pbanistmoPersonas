package com.banistmo.personas.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PeoplePage extends PageObject
{

    public static final Target TXT_FINISHED = Target.the("Textbox Finished")
            .located(By.id("termino"));

    public static final Target LABEL_RATE = Target.the("Option Label Rate")
            .locatedBy("#footer-content > div.container-fluid.links-f > div.container-fluid.footer-links > div > div:nth-child(2) > div > ul > li:nth-child(5) > a");
}
