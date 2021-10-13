package tasks;

import model.DatosUtests;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Devices;
import userinterfaces.Location;
import userinterfaces.Personal;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {

    private List<DatosUtests> datosformulariolist;

    public RegisterUserReto(List<DatosUtests> datosformulariolist){this.datosformulariolist=datosformulariolist;}

    @Override

    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Enter.theValue(datosformulariolist.get(0).getFirstName().trim()).into(Personal.FIRSTNAME),
                Enter.theValue(datosformulariolist.get(0).getLastName().trim()).into(Personal.LASTNAME),
                Enter.theValue(datosformulariolist.get(0).getEmail()).into(Personal.EMAIL),
                Click.on(Personal.MONTH),
                Click.on("//option[@label='"+datosformulariolist.get(0).getMonth()+"']"),
                Click.on(Personal.DAY),
                Click.on("//option[@label='"+datosformulariolist.get(0).getDay()+"']"),
                Click.on(Personal.YEAR),
                Click.on("//option[@label='"+datosformulariolist.get(0).getYear()+"']"),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Location.BUTTONDEVICES),
                Enter.theValue(datosformulariolist.get(0).getComputer().trim()).into(Devices.WINDOWS),
                Enter.theValue(datosformulariolist.get(0).getVersion().trim()).into(Devices.VERSION),
                Enter.theValue(datosformulariolist.get(0).getLanguage().trim()).into(Devices.LANGUAGE),
                Click.on(Devices.MOBILE),
                Click.on(Devices.REFERENCE),
                Click.on(Devices.MODEL),
                Click.on(Devices.IDEOS),
                Click.on(Devices.OPERATINGSYSTEM),
                Click.on(Devices.ANDROID),
                Click.on(Devices.BOTTONLASTFINAL)
        );

    }
    public static RegisterUserReto makeinfomation(List<DatosUtests> datosformulariolist){
        return instrumented (RegisterUserReto.class,datosformulariolist);

    }
}
