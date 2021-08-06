package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target COURSE_Location = Target.the("Course Selection")
            .located(By.xpath("//div[@data-course-id='1279']//a"));
    public static final Target COURSE_COMPLETE = Target.the("Check the Module as Completed")
            .located(By.xpath("//li[@id='module-3900']//form[@class='togglecompletion']"));
    public static final Target COURSE_NAME = Target.the("Extract the Course Name")
            .located(By.xpath("//li[@id='module-3900']//span[@class='instancename']"));

}
