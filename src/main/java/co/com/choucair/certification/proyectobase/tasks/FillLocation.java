package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.proyectobase.userinterface.LocationInfo.*;

public class FillLocation implements Task {

    public FillLocation(List<UtestDataUser> data) {
        this.data = data;
    }

    private List<UtestDataUser> data;

    public static FillLocation theFields(List<UtestDataUser> data) {
        return Tasks.instrumented(FillLocation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrZip()).into(ZIP),
                Click.on(COUNTRY_CONTAINER),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(NEXT_DEVICES)
        );
    }
}
