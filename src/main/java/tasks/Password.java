package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Set;

public class Password implements Task {
    private userInterface.uTestRegisterPasswordPage uTestRegisterPasswordPage;
    public static Password onThePage() {
        return Tasks.instrumented(Password.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Password#1").into(uTestRegisterPasswordPage.INPUT_PASSWORD),
                Enter.theValue("Password#1").into(uTestRegisterPasswordPage.INPUT_CONFIRM_PASSWORD),
                //Click.on(uTestRegisterPasswordPage.CHECH_BOX1),
                //Click.on(uTestRegisterPasswordPage.CHECH_BOX2),
                Click.on(uTestRegisterPasswordPage.LAST_BUTTON)
                );
    }
}
