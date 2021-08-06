package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    private String strCourse;

    public  Answer (String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
       return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(SearchCoursePage.COURSE_NAME).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = false;
        }else{
            result = true;
        }
        return result;
    }
}
