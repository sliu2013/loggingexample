package com.mkyong;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class HelloExampleTest {

    final static Logger logger = Logger.getLogger(HelloExampleTest.class);

    @Test
    public void testHello(){
        logger.debug("here is DEBUG");
        logger.info("here is INFO");
        logger.warn("here is WARN");
        logger.error("here is ERROR");
        Assert.assertTrue(true);
    }

    @Test
    public void testLogger(){
        HelloExample helloExample = new HelloExample();
        helloExample.runMe("sky");
        Assert.assertTrue(true);
    }
}
