public class Main {
    public static void main(String[] args) {
        // Crear instancias de Car
        Car sedanCar = new Sedan("VIN123", "Toyota", "Camry", 50000);
        Car truckCar = new Truck("VIN456", "Ford", "F-150", 70000, 5000.0);
        Car utilityVehicleCar = new UtilityVehicle("VIN789", "Jeep", "Wrangler", 30000, true);

        // Llamar al método getInfo() de cada instancia de Car
        System.out.println(sedanCar.getInfo());
        System.out.println(truckCar.getInfo());
        System.out.println(utilityVehicleCar.getInfo());

        // Crear instancias de IntList (usando IntArrayList e IntVector)
        IntList arrayList = new IntArrayList();
        IntList vectorList = new IntVector();

        // Agregar elementos a las listas
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            vectorList.add(i * 2);
        }

        // Obtener elementos de las listas
        for (int i = 0; i < 10; i++) {
            System.out.println("ArrayList[" + i + "] = " + arrayList.get(i));
            System.out.println("VectorList[" + i + "] = " + vectorList.get(i));
        }

        // Crear instancias de Video
        Video tvSeries = new TvSeries("Breaking Bad", 60, 62);
        Video movie = new Movie("Inception", 148, 8.7);

        // Llamar al método getInfo() de cada instancia de Video
        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());
    }
}
