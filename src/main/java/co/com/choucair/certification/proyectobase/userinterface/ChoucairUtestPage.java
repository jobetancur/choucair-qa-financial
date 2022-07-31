package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class ChoucairUtestPage extends PageObject {

    public static final Target JOIN = Target.the("Join Today Button")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}


