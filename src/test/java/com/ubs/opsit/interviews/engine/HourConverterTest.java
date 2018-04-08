package com.ubs.opsit.interviews.engine;

import org.junit.Assert;
import org.junit.Test;

public class HourConverterTest extends ConversionEngineTest {
    @Override
    public ConversionEngineTest createConverterInstance() {
        return new HourConverterTest();
    }

    @Test
    public void testConvert(){
        String result;
        HourConverter hourConverter = new HourConverter();

        result = hourConverter.convert(12);
        Assert.assertEquals("RROO\r\nRROO", result);

        result = hourConverter.convert(9);
        Assert.assertEquals("ROOO\r\nRRRR", result);
    }

}
