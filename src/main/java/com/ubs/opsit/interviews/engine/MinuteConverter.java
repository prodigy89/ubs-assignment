package com.ubs.opsit.interviews.engine;

import com.ubs.opsit.interviews.enums.LampType;

import java.util.Arrays;
import java.util.List;
import static com.ubs.opsit.interviews.Constants.*;
import static com.ubs.opsit.interviews.enums.LampType.LAMP_OFF;
import static com.ubs.opsit.interviews.enums.LampType.RED_LAMP_ON;
import static com.ubs.opsit.interviews.enums.LampType.YELLOW_LAMP_ON;

public class MinuteConverter implements ConversionEngine {

    private final List<Integer> redLampsIndices = Arrays.asList(2, 5, 8);

    @Override
    public String convert(int minutes) {
        StringBuilder minResult = new StringBuilder();
        LampType lampFlag = null;


        int onLampsCountForFirstRow = minutes / TIME_UNIT_FOR_ONE_LAMP;
        int onLampsCountForSecondRow = minutes % TIME_UNIT_FOR_ONE_LAMP;

        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            for (int count = 0; count < (row == 0 ? NUBER_OF_LAMPS_IN_MINUTES_FIRST_ROW : NUMBER_OF_ROWS_IN_MINUTES_SECOND_ROW); count++) {
                lampFlag = getLampType(onLampsCountForFirstRow, onLampsCountForSecondRow, row, count);
                minResult.append(lampFlag.getValue());
            }
            if (row == 0)
                minResult.append(NEW_LINE);
        }
        return minResult.toString();
    }

    private LampType getLampType(int onLampsCountForFirstRow, int onLampsCountForSecondRow, int row, int count) {
        LampType lampFlag;
        if (row == 0) {
            LampType lampColor = redLampsIndices.contains(count) ? RED_LAMP_ON : YELLOW_LAMP_ON;
            lampFlag = count < onLampsCountForFirstRow ? lampColor : LAMP_OFF;
        } else {
            lampFlag = count < onLampsCountForSecondRow ? YELLOW_LAMP_ON : LAMP_OFF;
        }
        return lampFlag;
    }
}
