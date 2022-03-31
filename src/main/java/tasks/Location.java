package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Set;


public class Location implements Task {
    private userInterface.uTestRegisterLocationPage uTestRegisterLocationPage;
    public static Location onThePage() {
        return Tasks.instrumented(Location.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(//The site autodetect the ubication of the actor
                Click.on(uTestRegisterLocationPage.NEXT_DEVICES_BUTTON)
        );

    }
}