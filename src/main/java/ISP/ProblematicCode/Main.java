package ISP.ProblematicCode;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<IUser> users = new ArrayList<>();
        /*
            An Entity may be composed of a combination of behaviours.It might not allow all the possible behaviours.

            ISP states that no class should be forced to exhibit a behaviour.
            This happens because of bulky interfaces/abstract classes.
            ISP is SRP for interfaces.
            you try to segregate behaviour in different interfaces.
         */
    }
}
