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
    private String strPassword,strConfirmPassword;

    public Password(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Password onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Password.class,strPassword,strConfirmPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(uTestRegisterPasswordPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(uTestRegisterPasswordPage.INPUT_CONFIRM_PASSWORD),
                //Click.on(uTestRegisterPasswordPage.CHECH_BOX1),
                //Click.on(uTestRegisterPasswordPage.CHECH_BOX2),
                Click.on(uTestRegisterPasswordPage.LAST_BUTTON)
                );
    }
}
