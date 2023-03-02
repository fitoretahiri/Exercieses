package com.company;

public abstract class Machine {
    private String name;
    private double size;
    private boolean isUsable;

    public Machine(String name, double size) throws MachineException{
        if (name.equals("") || name==null){
            throw new MachineException("Name of Machine is not valid!");
        }
        if (size<=0){
            throw new MachineException("Size is not valid!");
        }
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public abstract boolean isUsable();
}
