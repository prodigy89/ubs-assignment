package com.ubs.opsit.interviews.engine;

import org.junit.Assert;
import org.junit.Test;

public class SecondConverterTest extends ConversionEngineTest {
    @Override
    public ConversionEngineTest createConverterInstance() {
        return new SecondConverterTest();
    }

    @Test
    public void testConvert() {
        String result;
        SecondConverter secondConverter = new SecondConverter();

        result = secondConverter.convert(34);
        Assert.assertEquals("Y", result);

        result = secondConverter.convert(23);
        Assert.assertEquals("O", result);

    }
}
