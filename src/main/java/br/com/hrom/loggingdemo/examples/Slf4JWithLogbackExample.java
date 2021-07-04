package br.com.hrom.loggingdemo.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4JWithLogbackExample {

    private static final Logger log = LoggerFactory.getLogger(Slf4JWithLogbackExample.class);

    public void show() {
        log.debug("Debug log message");
        log.info("Info log message");
        log.warn("Warning log message");
        log.error("Error log message", new RuntimeException("Unexpected error", new IllegalStateException("Illegal state!")));
    }

}
