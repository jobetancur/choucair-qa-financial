package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDataUser;
import co.com.choucair.certification.proyectobase.userinterface.DevicesInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.proyectobase.userinterface.DevicesInfo.*;

public class FillDevice implements Task {

    public FillDevice(List<UtestDataUser> data) {
        this.data = data;
    }

    private List<UtestDataUser> data;

    public static FillDevice theFields(List<UtestDataUser> data) {
        return Tasks.instrumented(FillDevice.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BRAND_CONTAINER),
                Enter.theValue(data.get(0).getStrBrand()).into(BRAND).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(MODEL_CONTAINER),
                Enter.theValue(data.get(0).getStrModel()).into(MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(OS_CONTAINER),
                Enter.theValue(data.get(0).getStrOS()).into(OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LAST_STEP)
        );
    }
}
