package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

//En esta clase se definen los pasos de la prueba
public class ChoucairAcademyStepDefinitions {
        @Before
        public void setStage (){
            OnStage.setTheStage(new OnlineCast());
        }

// Abre y Loguea
    @Given("^than Eduardo wants to learn automation$")
    public void thanEduardoWantsToLearnAutomation(List<AcademyChoucairData> academyChoucairData) throws Exception {
       OnStage.theActorCalled("Eduardo").wasAbleTo(OpenUp.thePage(), (Login.
               onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));

    }
//Busca y Completa Modulo del Curso
    @When("^he search for the course (.*)$")
    public void heSearchforthecourse(String course)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course(.*)$")
    public void heFindsthecourse(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
