package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.Home;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnBecomeUtester implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER));
    }
    public static ClickOnBecomeUtester forresgister(){
        return instrumented (ClickOnBecomeUtester.class);

    }
}
