package com.se.agoncall.book.javaee7;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;


@EightDigits
public class IssnGenerator implements NumberGenerator {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Inject
    private Logger logger;

    // ======================================
    // =          Business methods          =
    // ======================================

    @Loggable
    public String generateNumber() {
        String issn =  "8-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN : " + issn);
        return issn;
    }
}