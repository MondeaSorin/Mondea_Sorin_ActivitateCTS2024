package logger.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private String fileName;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String message) {
        writeToFile("info.log", message);
    }

    public void info(String message, String fileName) {
        writeToFile(fileName, message);
    }

    public void warning(String message) {
        writeToFile("warning.log", message);
    }
    public void warning(String message, String fileName) {
        writeToFile(fileName, message);
    }

    public void error(String message) {
        writeToFile("error.log", message);
    }
    public void error(String message, String fileName) {
        writeToFile(fileName, message);
    }

    private void writeToFile(String fileName, String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println(message);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + fileName);
            e.printStackTrace();
        }
    }
}
