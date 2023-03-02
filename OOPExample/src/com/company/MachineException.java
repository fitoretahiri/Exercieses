package com.company;

public class MachineException extends Exception{
    private String message;
    public MachineException(String message) {
        super(message);
    }
}
