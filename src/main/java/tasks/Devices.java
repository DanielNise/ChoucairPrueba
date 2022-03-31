package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Set;


public class Devices implements Task {
    private userInterface.uTestRegisterDevicesPage uTestRegisterDevicesPagePage;
    public static Devices onThePage() {
        return Tasks.instrumented(Devices.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //The Computer device is autodetected in this case
                //SelectFromOptions.byVisibleText("Xiaomi").from(uTestRegisterDevicesPagePage.INPUT_MOBILE_DEVICE),
                //SelectFromOptions.byVisibleText("Redmi Note 10 Pro").from(uTestRegisterDevicesPagePage.INPUT_MODEL_MOBILE_DEVICE),
                //SelectFromOptions.byVisibleText("Android 11").from(uTestRegisterDevicesPagePage.INPUT_OS_MOBILE_DEVICE),
                Click.on(uTestRegisterDevicesPagePage.NEXT_PASSWORD_BUTTON)
        );
    }
}
