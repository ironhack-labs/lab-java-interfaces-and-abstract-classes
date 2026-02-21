package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArrayList<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Sedan("S101ABC", "Mercedes-Benz", "S-Class", 5000));
        listOfCars.add(new Sedan("S102DEF", "Honda", "Civic", 120000));
        listOfCars.add(new Sedan("S103GHI", "BMW", "3 Series", 45000));
        listOfCars.add(new Sedan("S104JKL", "Tesla", "Model 3", 15000));
        listOfCars.add(new Sedan("S105MNO", "Audi", "A6", 88000));
        listOfCars.add(new UtilityVehicle("U201PQR", "Land Rover", "Defender", 2500, true));
        listOfCars.add(new UtilityVehicle("U202STU", "Toyota", "RAV4", 65000, true));
        listOfCars.add(new UtilityVehicle("U203VWX", "Nissan", "Qashqai", 42000, false));
        listOfCars.add(new UtilityVehicle("U204YZ1", "Volkswagen", "Tiguan", 33000, true));
        listOfCars.add(new UtilityVehicle("U205ABC", "Hyundai", "Tucson", 51000, false));
        listOfCars.add(new Truck("T301DEF", "RAM", "1500", 28000, 12750.0));
        listOfCars.add(new Truck("T302GHI", "Toyota", "Hilux", 95000, 3500.0));
        listOfCars.add(new Truck("T303JKL", "GMC", "Sierra", 12000, 13200.0));
        listOfCars.add(new Truck("T304MNO", "Mitsubishi", "L200", 72000, 3100.0));
        listOfCars.add(new Truck("T305PQR", "Isuzu", "D-Max", 84000, 3500.0));

        for(Car car : listOfCars){
            System.out.println(car.getInfo());
            System.out.println("===================================================================================================");
        }
        ArrayList<Video> listOfVideos = new ArrayList<>();
        listOfVideos.add(new Movie("Inception", 148, 0));
        listOfVideos.add(new Movie("The Godfather", 175, 9.2));
        listOfVideos.add(new Movie("Interstellar", 169, 8.7));
        listOfVideos.add(new Movie("Parasite", 132, 8.5));
        listOfVideos.add(new Movie("The Dark Knight", 152, 9.0));
        listOfVideos.add(new Movie("Spirited Away", 125, 8.6));
        listOfVideos.add(new Movie("Pulp Fiction", 154, 8.9));
        listOfVideos.add(new Movie("The Shawshank Redemption", 142, 9.3));
        listOfVideos.add(new TvSeries("Breaking Bad", 47, 62));
        listOfVideos.add(new TvSeries("Stranger Things", 50, 34));
        listOfVideos.add(new TvSeries("The Crown", 58, 60));
        listOfVideos.add(new TvSeries("The Last of Us", 55, 9));
        listOfVideos.add(new TvSeries("Friends", 22, 236));
        listOfVideos.add(new TvSeries("The Office", 22, 201));
        listOfVideos.add(new TvSeries("Black Mirror", 60, 27));
        for(Video video : listOfVideos){
            System.out.println(video.getInfo());
            System.out.println("==================================================================================");
        }

        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 25; i++) {
            list1.add(i);
            list2.add(i);
        }

        System.out.println("IntArrayList element at index 14: " + list1.get(14));
        System.out.println("IntVector element at index 7: " + list2.get(7));

    }
}
