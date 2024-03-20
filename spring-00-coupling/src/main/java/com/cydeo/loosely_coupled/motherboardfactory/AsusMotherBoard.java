package com.cydeo.loosely_coupled.motherboardfactory;

public class AsusMotherBoard extends Motherboard {
    public AsusMotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer, ramSlots, cardSlots, bios);
    }

    @Override
    public void loadProgram(String programName) {
        System.out.println("Program "+ programName + " is now loading...");
    }


}
