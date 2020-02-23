package org.FastTrackIt.HomeWork07.Ex5;


public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(2,0.5,false);
        System.out.println("Statut sticla: "+bottle.isOpened());
        System.out.println("Daca mai este lichid: "+bottle.hasMoreLiquid());
        System.out.println("Lchidul ramas: "+bottle.getAvailebleLiquid());
        System.out.println("Capacitatea goala din sticla: "+bottle.emptyCapacity());
        System.out.println(bottle.closesBottle());
        System.out.println("Capacitate consumata: "+bottle.drinksLiquid(0.3));


    }


}
