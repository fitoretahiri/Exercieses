package com.company;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private String name;
    private String role;
    List<Machine> machines;

    public Mechanic(String name, String role, List<Machine> machines) throws MachineException{
        if (name.trim().equals("")||name==null){
            throw new MachineException("Mechanic should have a name!");
        }
        if (role.trim().equals("")||role==null){
            throw new MachineException("Role has to be specified!");
        }
        for (Machine m:machines) {
            if (m==null){
                throw new MachineException("You cannot insert a null value of a machine");
            }
        }
        this.name = name;
        this.role = role;
        this.machines=machines;
    }





}
