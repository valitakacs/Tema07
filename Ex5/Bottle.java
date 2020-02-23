package org.FastTrackIt.HomeWork07.Ex5;

import java.util.Objects;

public class Bottle {
    private int totalCapacity;
    private double availebleLiquid;
    private boolean opened;

    public Bottle(int totalCapacity, double availebleLiquid, boolean opened) {
        this.totalCapacity = totalCapacity;
        this.availebleLiquid = availebleLiquid;
        this.opened = opened;
    }

    public String isOpened() {
        if (opened == true) {
            return "Bottle is opened";
        }
        return "Bottle is not oppened";
    }

    public boolean hasMoreLiquid() {
        if (this.availebleLiquid != 0) {
            return true;
        }
        return false;
    }

    public double getAvailebleLiquid() {
        return availebleLiquid;
    }

    public double emptyCapacity() {
        return (totalCapacity - availebleLiquid);
    }

    public String closesBottle() {
        if (this.opened == true) {
           this.opened = false;
            return "Bottle is closed";
        }
        return "Bottle is allready closed";

    }
    public String drinksLiquid(double drink){
        double drinksAmount;
        drinksAmount=this.totalCapacity-drink;
        return "A baut: "+drinksAmount;

    }



}
