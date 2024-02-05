public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.vinNumber = "123456789";
        truck.make = "Ford";
        truck.model = "F-150";
        truck.mileage = 10000;
        truck.towingCapacity = 10000;
        System.out.println(truck.getInfo());

        UtilityVehicle utilityVehicle = new UtilityVehicle();
        utilityVehicle.vinNumber = "987654321";
        utilityVehicle.make = "Chevy";
        utilityVehicle.model = "Silverado";
        utilityVehicle.mileage = 5000;
        utilityVehicle.hasFourWheelDrive = true;
        System.out.println(utilityVehicle.getInfo() + " Four Wheel Drive: " + utilityVehicle.hasFourWheelDrive);

        TvSeries tvSeries = new TvSeries();
        tvSeries.title = "The Office";
        tvSeries.duration = 30;
        tvSeries.episodes = 200;
        System.out.println(tvSeries.getInfo() + " Episodes: " + tvSeries.episodes);

        ////////////////////////////

        Movie movie = new Movie();
        movie.title = "The Godfather";
        movie.duration = 120;
        movie.rating = 9.5;
        System.out.println(movie.getInfo() + " Rating: " + movie.rating);

        ///////////////////////////

        // Create an instance of IntArrayList
        IntArrayList intList = new IntArrayList();

        // Add some elements to the list
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Print elements by iterating through the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        // Display the size of the list
        System.out.println("Size of the list: " + intList.size());

        // Add more elements to see if list expands correctly
        for (int i = 4; i <= 15; i++) {
            intList.add(i);
        }

        // Print the new size of the list
        System.out.println("New size of the list after adding more elements: " + intList.size());

        // Try accessing an element
        int index = 5;
        System.out.println("Element at index " + index + ": " + intList.get(index));

        ///////////////////////////

        // Create an instance of IntVector
        IntVector intVector = new IntVector();

        // Add some elements to the vector
        for (int i = 1; i <= 25; i++) {
            intVector.add(i);
        }

        // Print elements and the dynamic resizing demonstration
        System.out.println("Elements in the vector:");
        for (int i = 0; i < intVector.size(); i++) {
            System.out.println(intVector.get(i));
        }

        // Display the size of the vector
        System.out.println("Size of the vector: " + intVector.size());

        // Since capacity initially starts at 20 and then doubles,
        // adding 25 elements will show that dynamic resizing took place.

        // Try accessing an element to see if get method works as expected
        int index2 = 10;
        System.out.println("Element at index " + index + ": " + intVector.get(index));
  }
}
