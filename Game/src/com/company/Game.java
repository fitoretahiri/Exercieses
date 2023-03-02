package com.company;

public class Game {
    private String name;
    private double sizeInGB;
    private boolean isReady;

    public Game(String name, double sizeInGB, boolean isReady) {
        this.name = name;
        this.sizeInGB = sizeInGB;
        this.isReady=isReady;
    }

    public boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(boolean ready) {
        isReady = ready;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(double sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    public boolean start(){
        return getIsReady();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Player){
            return ((Game)obj).getName().equals(name);
        }
        return false;
    }
}
