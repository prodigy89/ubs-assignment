package com.ubs.opsit.interviews.enums;

public enum LampType {
    LAMP_OFF("O"),
    RED_LAMP_ON("R"),
    YELLOW_LAMP_ON("Y");

    private String value;

    private LampType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}
