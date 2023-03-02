package com.company;

public class CartWheel extends Machine implements NonElectronik{

    public CartWheel(String name, double size) throws MachineException {
        super(name, size);
    }

    @Override
    public boolean isUsable() {
        return false;
    }
}
