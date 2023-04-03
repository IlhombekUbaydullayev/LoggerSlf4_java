package org.example;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class Main {
//    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
//        logger.info("Info logger log");
//        logger.error("Error logger log");
        PrimeNumber primeNumber = new PrimeNumber();
        int primaryNum = primeNumber.primaryNum(20);
        log.info("Prime number : " + primaryNum);
        log.info("Info logger log");
        log.error("Error logger log");
    }
}