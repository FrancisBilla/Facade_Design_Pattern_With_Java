package io.turntabl.ConcertClasses;

import io.turntabl.Interface.Server;

public class IBMServer implements Server {
    @Override
    public void fix() {
        System.out.println("Fixing IBM Server ................................");
        System.out.println("..................................................");
        System.out.println("Server Fix Successfully!!!\n BYE");
    }
}
