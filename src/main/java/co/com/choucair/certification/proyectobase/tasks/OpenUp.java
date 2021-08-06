package co.com.choucair.certification.proyectobase.tasks;
//Importaciones
import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    //Abre pagina de Choucair Academy
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
