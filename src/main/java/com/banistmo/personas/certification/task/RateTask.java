package com.banistmo.personas.certification.task;

import com.banistmo.personas.certification.userinterfaces.PeoplePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static com.banistmo.personas.certification.userinterfaces.PeoplePage.LABEL_RATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class RateTask implements Task {
    private PeoplePage PeoplePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(PeoplePage),
                Click.on(LABEL_RATE));
    }
    public static RateTask actorRateOptions(String strActor,String strOptions)
    {
        return instrumented (RateTask.class, strActor, strOptions);
    }
}
