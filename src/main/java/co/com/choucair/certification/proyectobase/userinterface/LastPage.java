package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target INFORMED = Target.the("Stay Informed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERMS_OF_USE = Target.the("Terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_POLICY = Target.the("Privacy and security Policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("Complete Setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
