package userInterface;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegisterDevicesPage extends PageObject {
    public static final Target INPUT_MOBILE_DEVICE = Target.the("where we select our mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target INPUT_MODEL_MOBILE_DEVICE = Target.the("where we select the model of our mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target INPUT_OS_MOBILE_DEVICE = Target.the("where we select the os of our mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target NEXT_PASSWORD_BUTTON = Target.the("button to next form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));



}

