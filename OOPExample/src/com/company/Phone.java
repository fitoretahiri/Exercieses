package com.company;

public class Phone extends Machine implements Electronic{
    private String model;
    public Phone(String name, double size, String model) throws MachineException {
        super(name, size);
        if (model.trim().equals("")||model==null){
            throw new MachineException("Model is not specified!");
        }
        this.model=model;
    }

    @Override
    public boolean isUsable() {
        return true;
    }
}
