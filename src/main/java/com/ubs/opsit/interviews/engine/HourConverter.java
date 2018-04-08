package com.ubs.opsit.interviews.engine;

import com.ubs.opsit.interviews.enums.LampType;

import static com.ubs.opsit.interviews.Constants.*;
import static com.ubs.opsit.interviews.enums.LampType.LAMP_OFF;
import static com.ubs.opsit.interviews.enums.LampType.RED_LAMP_ON;

public class HourConverter implements ConversionEngine {
    @Override
    public String convert(int hours) {
        StringBuilder hrsResult = new StringBuilder();

        int onLampsCountForFirstRow = hours / TIME_UNIT_FOR_ONE_LAMP;
        int onLampsCountForSecondRow = hours % TIME_UNIT_FOR_ONE_LAMP;
        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            for (int count = 0; count < NUMBER_OF_LAMPS_IN_HOURS_ROW; count++) {

                LampType lampFlag = getLampType(onLampsCountForFirstRow, onLampsCountForSecondRow, row, count);
                hrsResult.append(lampFlag.getValue());
            }
            if (row == 0) {
                hrsResult.append(NEW_LINE);
            }
        }
        return hrsResult.toString();
    }

    private LampType getLampType(int onLampsCountForFirstRow, int onLampsCountForSecondRow, int row, int count) {
        LampType lampFlag;
        if (row == 0) {
            lampFlag = count < onLampsCountForFirstRow ? RED_LAMP_ON : LAMP_OFF;
        } else {
            lampFlag = count < onLampsCountForSecondRow ? RED_LAMP_ON : LAMP_OFF;
        }
        return lampFlag;
    }
}
