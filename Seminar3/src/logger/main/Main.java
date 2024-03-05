package logger.main;

import logger.classes.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.error("This is an error message");
    }
}