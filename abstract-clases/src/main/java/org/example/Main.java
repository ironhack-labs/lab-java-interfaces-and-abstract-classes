package org.example;
import java.math.BigDecimal;
import org.example.bigDecimal.*;
import org.example.videoStreaming.*;
import org.example.carInventory.*;
import org.example.intListInterface.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Movie pelicula = new Movie("EL ultimo samurai",21,10);
        System.out.println(pelicula.getInfo());
        TvSeries serie = new TvSeries("EL ultimo samurai",21,20);
        System.out.println(serie.getInfo());
        Sedan sedan = new Sedan("5mgo659",  "Audi", "A3", 120);
        System.out.println(sedan.getInfo());
        Truck camion = new Truck("5mgo659",  "Audi", "A3", 120,100);
        System.out.println(camion.getInfo());
        UtilityVehicle vehiculoUtilitario = new UtilityVehicle("5mgo659",  "Audi", "A3", 120,true);
        System.out.println(vehiculoUtilitario.getInfo());
    }
}

