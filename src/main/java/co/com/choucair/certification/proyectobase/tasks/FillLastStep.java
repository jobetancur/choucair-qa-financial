package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.choucair.certification.proyectobase.userinterface.LastPage.*;

public class FillLastStep implements Task {

    public FillLastStep(List<UtestDataUser> data) {
        this.data = data;
    }

    private List<UtestDataUser> data;

    public static FillLastStep theFields(List<UtestDataUser> data) {
        return Tasks.instrumented(FillLastStep.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(INFORMED),
                Click.on(TERMS_OF_USE),
                Click.on(PRIVACY_POLICY),
                Click.on(COMPLETE_SETUP)
        );
    }
}
