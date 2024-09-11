package org.A5.A5_2;

public class mainapp{
    public static void main(String[] args) {
        // Get the singleton Logger instance
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("Application started");
        logger.log("User logged in");
        logger.log("An error occurred");

        // Print all logs
        System.out.println("Log messages:\n" + logger.getLog());

        // Clear logs
        logger.clearLog();

        // Attempt to retrieve logs after clearing
        System.out.println("Logs after clearing:\n" + logger.getLog());
    }
}
