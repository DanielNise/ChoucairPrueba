package userInterface;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegisterLocationPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("where we write the city where we live")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("where we write the zip code where we live")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("where we write the country where we live")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public static final Target NEXT_DEVICES_BUTTON = Target.the("button to next form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}

