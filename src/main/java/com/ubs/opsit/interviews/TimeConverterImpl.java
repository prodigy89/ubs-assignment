package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.engine.HourConverter;
import com.ubs.opsit.interviews.engine.MinuteConverter;
import com.ubs.opsit.interviews.engine.SecondConverter;

public class TimeConverterImpl implements TimeConverter {

    private HourConverter hourConverter;
    private MinuteConverter minuteConverter;
    private SecondConverter secondConverter;

    public TimeConverterImpl() {
        this.hourConverter = new HourConverter();
        this.minuteConverter = new MinuteConverter();
        this.secondConverter = new SecondConverter();
    }

    @Override
    public String convertTime(String aTime) {
        String result = null;
        String[] timeFactors = aTime.split(":");

        result = convert(timeFactors);

        return result;
    }

    private String convert(String[] timeFactors) {
        StringBuilder result = new StringBuilder();
        String hours = null;
        String minutes = null;
        String seconds = null;

        for (int index = 0; index < timeFactors.length; index++) {
            int timeFactor = Integer.parseInt(timeFactors[index]);
            switch (index) {
                case 0:
                    hours = hourConverter.convert(timeFactor);
                    break;
                case 1:
                    minutes = minuteConverter.convert(timeFactor);
                    break;
                case 2:
                    seconds = secondConverter.convert(timeFactor);
                    break;
                default:
                    break;
            }
        }
        return result.append(seconds).append("\r\n").append(hours).append("\r\n").append(minutes)
                .toString();
    }
}
