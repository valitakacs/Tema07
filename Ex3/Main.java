package org.FastTrackIt.HomeWork07.Ex3;

public class Main {
    public static void main(String[] args) {
        Product produs = new Product("Suc", 3, 3, "Bauturi");
        System.out.println(produs.toString()+" Required category="+produs.isCategory("Vehicul"));

        Product produs1 = new Product("Mercedes",900.111,1,"Autoturisme");
        System.out.println(produs1.toString()+" Required category="+produs1.isCategory("Vehicul"));


        Product produs2 =new Product(("Bicicleta"),2.000,0,"Vehicul");
        System.out.println(produs2.toString()+" Required category="+produs2.isCategory("Vehicul"));



    }
}
