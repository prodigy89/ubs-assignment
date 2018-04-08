package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

public abstract class TimeConverterTest {
    public abstract TimeConverterTest createInstance();

    @Test
    public void testConvertTimeForInterface() {

       TimeConverterTest converterTest = createInstance();
        Assert.assertNotNull(converterTest);
    }

}
