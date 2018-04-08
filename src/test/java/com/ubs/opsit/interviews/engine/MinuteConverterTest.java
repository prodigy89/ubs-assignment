package com.ubs.opsit.interviews.engine;

import org.junit.Assert;
import org.junit.Test;

public class MinuteConverterTest extends ConversionEngineTest {
    @Override
    public ConversionEngineTest createConverterInstance() {
        return new MinuteConverterTest();
    }

    @Test
    public void testConvert(){
        String result;
        MinuteConverter minuteConverter = new MinuteConverter();

        result = minuteConverter.convert(48);
        Assert.assertEquals("YYRYYRYYROO\r\nYYYO", result);

        result = minuteConverter.convert(15);
        Assert.assertEquals("YYROOOOOOOO\r\nOOOO", result);
    }
}
