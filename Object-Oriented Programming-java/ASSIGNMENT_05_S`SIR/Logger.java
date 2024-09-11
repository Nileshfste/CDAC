package org.A5.A5_2;

import java.util.ArrayList;

public class Logger {

   
    private static Logger instance = null;


    private ArrayList<String> logMessages;


    private Logger() {
        logMessages = new ArrayList<>();
    }


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.add(message);
    }


    public String getLog() {
        if (logMessages.isEmpty()) {
            return "No logs available";
        }
        
        StringBuilder allLogs = new StringBuilder();
        for (String log : logMessages) {
            allLogs.append(log).append("\n");
        }
        return allLogs.toString().trim();  
    }

 
    public void clearLog() {
        logMessages.clear();
    }
}
