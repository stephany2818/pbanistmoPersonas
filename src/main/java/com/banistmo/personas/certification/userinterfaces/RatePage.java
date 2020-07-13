package com.banistmo.personas.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RatePage extends PageObject {
    public static final Target LABEL_RATE = Target.the("Label Rate")
            .located(By.id("termino"));
}
