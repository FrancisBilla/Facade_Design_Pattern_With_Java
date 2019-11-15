package io.turntabl;

import io.turntabl.FacadeClass.ServerFixer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ServerFixer serverFixer = new ServerFixer();

        serverFixer.fixFtpServer();
        serverFixer.fixMailServer();
        serverFixer.fixIbmServer();

        Scanner sn = new Scanner();
        System.in.nextln(System.in)
    }
}
