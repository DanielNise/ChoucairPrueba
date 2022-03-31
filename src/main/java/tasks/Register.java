package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Set;


public class Register implements Task {
    private userInterface.uTestRegisterPage uTestRegisterPage;
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestRegisterPage.REGISTER_BUTTON),
                Enter.theValue("Daniel").into(uTestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue("Nise").into(uTestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue("nisepass@hotmail.com").into(uTestRegisterPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("May").from(uTestRegisterPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("4").from(uTestRegisterPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText("2001").from(uTestRegisterPage.INPUT_BIRTH_YEAR),
                Click.on(uTestRegisterPage.NEXT_LOCATION_BUTTON)
                );
    }
}
