package com.cydeo.bean_annotaion;

import com.cydeo.bean_annotaion.casefactory.Case;
import com.cydeo.bean_annotaion.monitorfactory.Monitor;
import com.cydeo.bean_annotaion.motherboardfactory.Motherboard;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}
