package userInterface;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button that show us the register form")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRST_NAME =Target.the("where we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME =Target.the("where we write the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS =Target.the("where we write the email address")
            .located(By.id("email"));

    public static final Target INPUT_BIRTH_MONTH =Target.the("where we select the birth month")
            .located(By.id("birthMonth"));

    public static final Target INPUT_BIRTH_DAY =Target.the("where we select the birth day")
            .located(By.id("birthDay"));

    public static final Target INPUT_BIRTH_YEAR =Target.the("where we select the birth year")
            .located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGES =Target.the("where we select the languages")
            .located(By.id("languages"));

    public static final Target NEXT_LOCATION_BUTTON =Target.the("button to next form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}

