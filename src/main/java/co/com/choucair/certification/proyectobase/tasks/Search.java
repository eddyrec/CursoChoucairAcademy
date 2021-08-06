package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }


    public static Search the(String course){
        return Tasks.instrumented(Search.class,course);
    }
    // Selecciona el Curso y marca  como completado el Capitulo de la Guía donde se aprendio lo realizado.
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(SearchCoursePage.COURSE_Location)//);
                ,  Click.on(SearchCoursePage.COURSE_COMPLETE));
    }

}
