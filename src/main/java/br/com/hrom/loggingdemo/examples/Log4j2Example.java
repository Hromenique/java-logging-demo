package br.com.hrom.loggingdemo.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {

    private static final Logger log = LogManager.getLogger(Log4j2Example.class);

    public void show() {
        log.debug("Debug log message");
        log.info("Info log message");
        log.warn("Warning log message");
        log.error("Error log message", new RuntimeException("Unexpected error", new IllegalStateException("Illegal state!")));
    }
}
