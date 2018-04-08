package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

public class TimeConverterImplTest extends TimeConverterTest{
    @Test
    public void testConvertTimeForMidnight(){
        // Setup
        StringBuilder builder = new StringBuilder();
        String midnight = builder.append("Y").append("\r\n")
                .append("OOOO").append("\r\n").append("OOOO").append("\r\n")
                .append("OOOOOOOOOOO").append("\r\n").append("OOOO")
                .toString();
        String result = null;

        // Execute
        TimeConverterImpl timeConverterImpl = new TimeConverterImpl();
        result = timeConverterImpl.convertTime("00:00:00");

        //Verify
        Assert.assertEquals(midnight, result);

    }

    @Test
    public void testConvertTimeForMidnight24Hours(){
        // Setup
        StringBuilder builder = new StringBuilder();
        String midnight = builder.append("Y").append("\r\n")
                .append("RRRR").append("\r\n").append("RRRR").append("\r\n")
                .append("OOOOOOOOOOO").append("\r\n").append("OOOO")
                .toString();
        String result = null;

        // Execute
        TimeConverterImpl timeConverterImpl = new TimeConverterImpl();
        result = timeConverterImpl.convertTime("24:00:00");

        // Verify
        Assert.assertEquals(midnight, result);

    }

    @Test
    public void testConvertTimeForMidAfternoon(){
        // Setup
        StringBuilder builder = new StringBuilder();
        String midafternoon = builder.append("O").append("\r\n")
                .append("RROO").append("\r\n").append("RRRO").append("\r\n")
                .append("YYROOOOOOOO").append("\r\n").append("YYOO")
                .toString();
        String result = null;

        // Execute
        TimeConverterImpl timeConverterImpl = new TimeConverterImpl();
        result = timeConverterImpl.convertTime("13:17:01");

        // Verify
        Assert.assertEquals(midafternoon, result);

    }

    @Test
    public void testConvertTimeJustBeforeMidnight(){
        // Setup
        StringBuilder builder = new StringBuilder();
        String justBeforeMidnight = builder.append("O").append("\r\n")
                .append("RRRR").append("\r\n").append("RRRO").append("\r\n")
                .append("YYRYYRYYRYY").append("\r\n").append("YYYY")
                .toString();
        String result = null;

        // Execute
        TimeConverterImpl timeConverterImpl = new TimeConverterImpl();
        result = timeConverterImpl.convertTime("23:59:59");

        // Verify
        Assert.assertEquals(justBeforeMidnight, result);

    }



    @Override
    public TimeConverterTest createInstance() {
        return new TimeConverterImplTest();
    }

}
