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

    private String strFirstName,strLastName,srtEmail,srtBirthMonth,strBirthDay,strBirthYear;

    public Register(String strFirstName, String strLastName, String srtEmail, String srtBirthMonth, String strBirthDay, String strBirthYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.srtEmail = srtEmail;
        this.srtBirthMonth = srtBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }

    public static Register onThePage(String strFirstName, String strLastName, String srtEmail, String srtBirthMonth, String strBirthDay
                                    , String strBirthYear) {
        return Tasks.instrumented(Register.class,strFirstName,strLastName,srtEmail,srtBirthMonth,strBirthDay,strBirthYear);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(uTestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(uTestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(srtEmail).into(uTestRegisterPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(srtBirthMonth).from(uTestRegisterPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(uTestRegisterPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(uTestRegisterPage.INPUT_BIRTH_YEAR),
                Click.on(uTestRegisterPage.NEXT_LOCATION_BUTTON)
                );
    }
}
