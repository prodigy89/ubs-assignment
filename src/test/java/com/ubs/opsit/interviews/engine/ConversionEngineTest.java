package com.ubs.opsit.interviews.engine;

import org.junit.Assert;
import org.junit.Test;

public abstract class ConversionEngineTest {

    public abstract ConversionEngineTest createConverterInstance();

    @Test
    public void testConvertForHourConverter() {
        ConversionEngineTest ConversionEngineTest = createConverterInstance();
        Assert.assertNotNull(ConversionEngineTest);
    }
}
