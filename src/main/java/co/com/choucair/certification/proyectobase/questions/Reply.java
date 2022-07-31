package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.UtestDataUser;
import co.com.choucair.certification.proyectobase.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Reply implements Question<Boolean> {

    private List<UtestDataUser> data;

    public Reply(List<UtestDataUser> data) {
        this.data = data;
    }

    public static Reply to(List<UtestDataUser> data) {
        return new Reply(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Last_Button = Text.of(LastPage.COMPLETE_SETUP).viewedBy(actor).asString();
        return data.get(0).getStrCompleteSetup().equals(Last_Button);
    }
}
