package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationInfo {

    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target ZIP = Target.the("Zip")
            .located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER = Target.the("Country Container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES = Target.the("Go to next devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
