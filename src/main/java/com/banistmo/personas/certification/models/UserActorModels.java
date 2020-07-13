package com.banistmo.personas.certification.models;

import net.serenitybdd.screenplay.Actor;

public class UserActorModels {

    private static Actor actor;
    private static String strActor;

    public UserActorModels(Actor actor) {

        UserActorModels.strActor = strActor;

    }

    public static String getStrActor() {
        return strActor;
    }




}
