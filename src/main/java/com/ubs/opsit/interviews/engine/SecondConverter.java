package com.ubs.opsit.interviews.engine;

import static com.ubs.opsit.interviews.enums.LampType.YELLOW_LAMP_ON;
import static com.ubs.opsit.interviews.enums.LampType.LAMP_OFF;

public class SecondConverter implements ConversionEngine {
    @Override
    public String convert(int seconds) {
        String secResult = null;
        if (seconds % 2 == 0) {
            secResult = YELLOW_LAMP_ON.getValue();
        } else {
            secResult = LAMP_OFF.getValue();
        }
        return secResult;
    }
}
