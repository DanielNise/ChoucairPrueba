package userInterface;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegisterPasswordPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("where we put the password ")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where we confirm the password ")
            .located(By.id("confirmPassword"));

    public static final Target CHECH_BOX1 = Target.the("checkbox1")
            .located(By.xpath("*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECH_BOX2 = Target.the("checkbox2")
            .located(By.xpath("*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target LAST_BUTTON = Target.the("last button")
            .located(By.id("laddaBtn"));



}
