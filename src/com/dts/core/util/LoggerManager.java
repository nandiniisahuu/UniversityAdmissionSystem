package com.dts.core.util;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerManager {

    // Making logger instance non-static to avoid issues with static initialization
    private Logger logger;

    // Constructor
    public LoggerManager() {
        // You can initialize it here if you have default settings
        this.logger = Logger.getLogger("LoggerManager");
    }

    // Get logger with dynamic file location
    public Logger getLogger(String file) {
        String dir = file.substring(0, file.lastIndexOf("/"));
        System.out.println("-----dir----" + dir);

        // Initialize the logger if not already initialized
        if (logger == null) {
            logger = Logger.getLogger("Logger");
        }

        try {
            File f = new File(dir);
            boolean success = f.exists();

            if (!success) {
                success = f.mkdir();
            }

            LogManager lm = LogManager.getLogManager();
            FileHandler fh = new FileHandler(file, true);
            logger.setUseParentHandlers(false);
            lm.addLogger(logger);
            logger.setLevel(Level.INFO);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);

            // Optional: Close the file handler if not required for further logging
            // fh.close();
        } catch (Exception e) {
            // Make sure the logger is initialized before writing to it
            if (logger == null) {
                logger = Logger.getLogger("LoggerManager");
            }
            logger.log(Level.INFO, e.toString(), e.fillInStackTrace());
        }
        return logger;
    }

    // Static log methods for different levels
    public static void writeLogInfo(Exception e) {
        Logger logger = Logger.getLogger("LoggerManager");
        logger.log(Level.INFO, e.toString(), e.fillInStackTrace());
    }

    public static void writeLogSevere(Exception e) {
        Logger logger = Logger.getLogger("LoggerManager");
        logger.log(Level.SEVERE, e.toString(), e.fillInStackTrace());
    }

    public static void writeLogWarning(Exception e) {
        Logger logger = Logger.getLogger("LoggerManager");
        logger.log(Level.WARNING, e.toString(), e.fillInStackTrace());
    }

    public static void writeLogInfo(String info) {
        Logger logger = Logger.getLogger("LoggerManager");
        logger.log(Level.INFO, info);
    }

    public static void writeLogSevere(String severe) {
        Logger logger = Logger.getLogger("LoggerManager");
        logger.log(Level.SEVERE, severe);
    }

    public static void writeLogWarning(String warning) {
        Logger logger = Logger.getLogger("LoggerManager");
        logger.log(Level.WARNING, warning);
    }
}
