package com.company;

public class Laptop extends Machine implements Electronic{
    private String operatingSystem;
    private String processorType;

    public Laptop(String name, double size, String operatingSystem, String processorType) throws MachineException {
        super(name, size);
        if(operatingSystem.equals("") || operatingSystem==null){
            throw new MachineException("Not a valid Operating system!");
        }
        if (processorType.equals("")||processorType==null){
            throw new MachineException("Processor is not valid!!");
        }
        this.operatingSystem=operatingSystem;
        this.processorType=processorType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public boolean isUsable() {
        return false;
    }
}
