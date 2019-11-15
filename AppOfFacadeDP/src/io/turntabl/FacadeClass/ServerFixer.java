package io.turntabl.FacadeClass;

import io.turntabl.ConcertClasses.FTPServer;
import io.turntabl.ConcertClasses.MailServer;
import io.turntabl.ConcertClasses.IBMServer;
import io.turntabl.Interface.Server;

public class ServerFixer {
    private Server ftpServer;
    private Server mailServer;
    private Server ibmServer;

    public ServerFixer() {
        ftpServer = new FTPServer();
        mailServer = new MailServer();
        ibmServer = new IBMServer();
    }

    public void fixFtpServer(){
        ftpServer.fix();
    }
    public void fixMailServer(){
        mailServer.fix();
    }
    public void fixIbmServer(){
        ibmServer.fix();
    }
}



