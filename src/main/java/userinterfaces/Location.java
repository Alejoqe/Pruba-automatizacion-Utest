package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {

    public static final Target BUTTONLOCATION = Target.the ("button location").
            locatedBy("//span[contains(.,'Next: Location')]");

    public static final Target BUTTONDEVICES = Target.the ("button location").
            locatedBy("//a[@aria-label=\"Next step = select your devices\"]");
}
