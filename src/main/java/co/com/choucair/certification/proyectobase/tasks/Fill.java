package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDataUser;
import co.com.choucair.certification.proyectobase.userinterface.PersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.choucair.certification.proyectobase.userinterface.PersonalInformation.*;

public class Fill implements Task {

    public Fill(List<UtestDataUser> data) {
        this.data = data;
    }

    private List<UtestDataUser> data;

    public static Fill theFields(List<UtestDataUser> data) {
        return Tasks.instrumented(Fill.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(BIRTH_YEAR),
                Click.on(NEXT_LOCATION)
        );
    }
}
