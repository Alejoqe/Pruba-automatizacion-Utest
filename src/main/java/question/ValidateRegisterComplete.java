package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateRegisterComplete implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return true;
    }

    public static ValidateRegisterComplete ofutest(){
        return new ValidateRegisterComplete();}
}
