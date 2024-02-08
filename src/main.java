import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static java.lang.Math.round;

public class main {

    public void main(String[] args) {

        BigDecimal x = new BigDecimal("4.2545");
        System.out.println(doubleRoundedHundredth(x));

        BigDecimal y = new BigDecimal("1.2345");
        BigDecimal z = new BigDecimal("-45.67");
        System.out.println(reversedNumber(y));
        System.out.println(reversedNumber(z));

        Sedan carSedan = new Sedan("2222BDS", "Peugeot", "207", 20000);
        System.out.println(carSedan.getInfo());

        UtilityVehicle carUtility = new UtilityVehicle("6689LPS", "Land Rover", "Range Rover LIGHT version", 15000, false);
        UtilityVehicle carUtility2 = new UtilityVehicle("4994LPS", "Land Rover", "Range Rover Sport", 70000, true);
        System.out.println(carUtility.getInfo());
        System.out.println(carUtility2.getInfo());

        Truck carTruck = new Truck("9999LLS", "IVECO", "Super Truck 2000", 250, 25.66);
        System.out.println(carTruck.getInfo());

        TvSeries dark = new TvSeries("Dark", 60, 18);
        System.out.println(dark.getInfo());

        Movie inception = new Movie("Inception", 180, 98.9);
        System.out.println(inception.getInfo());

        Movie interstellar = new Movie("Interstellar", 190, 977);
        System.out.println(interstellar.getInfo());

        Movie tenet = new Movie("Tenet", 190, 9.15);
        System.out.println(tenet.getInfo());
    }

    public static double doubleRoundedHundredth (BigDecimal num) {
        num = num.setScale(2, RoundingMode.HALF_UP);
        return num.doubleValue();
    }

    public static BigDecimal reversedNumber (BigDecimal num2) {

        if (num2.compareTo(BigDecimal.ZERO) < 0) {
            return num2.abs().setScale(1, RoundingMode.HALF_UP);
        } else {
            return num2.negate().setScale(1, RoundingMode.HALF_UP);
        }

    }

    public abstract class Car {
        private String vinNumber;
        private String make;
        private String model;
        private int mileage;

        public Car(String vinNumber, String make, String model, int mileage) {
            setVinNumber(vinNumber);
            setMake(make);
            setModel(model);
            setMileage(mileage);
        }

        public String getVinNumber() {
            return vinNumber;
        }

        public void setVinNumber(String vinNumber) {
            this.vinNumber = vinNumber;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        abstract String getInfo();
    }

    public class IntArrayList implements IntList {
        private int[] array;
        private int size;

        public IntArrayList() {
            this.array = new int[10];
            this.size = 0;
        }

        @Override
        public void add(int number) {
            if (size == array.length) {
                int newLength = array.length + (array.length / 2);
                int[] newArray = new int[newLength];
                System.arraycopy(array, 0, newArray, 0, array.length); //
                array = newArray;
            }
            array[size++] = number;
        }

        @Override
        public int get(int id) {
            return array[id];
        }
    }


    public interface IntList {
        // Method to add a new number to the list
        void add(int number);
        // Method to retrieve an element by its ID
        int get(int id);

    }

    public class IntVector implements IntList {
        private int[] array;
        private int size;

        public IntVector() {
            this.array = new int[20];
            this.size = 0;
        }

        @Override
        public void add(int number) {
            if (size == array.length) {
                int newLength = array.length*2;
                int[] newArray = new int[newLength];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
            array[size++] = number;
        }

        @Override
        public int get(int id) {
            return array[id];
        }
    }

    public class Movie extends Video{

        private double rating;

        public Movie(String title, int duration, double rating) {
            super(title, duration);
            setRating(rating);
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            if (rating > 100) {
                this.rating = rating/10;
            } else if (rating < 10) {
                this.rating = rating*10;
            } else {
                this.rating = rating;
            }
        }

        public String getInfo(){
            return "The Movie is: " + getTitle() + ", The Duration is: " + getDuration() + "min, And the rating is: " + getRating() + "/100";
        }

    }
    public class Sedan extends Car {

        public Sedan (String vinNumber, String make, String model, int mileage){
            super(vinNumber, make, model, mileage);
        }

        public String getInfo(){
            return "This is a Sedan, and the Vin Number is: " + getVinNumber() + ", Make by: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage();
        }


    }

    public class Truck extends Car {
        private double towingCapacity;

        public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
            super(vinNumber, make, model, mileage);
            setTowingCapacity(towingCapacity);
        }

        public double getTowingCapacity() {
            return towingCapacity;
        }

        public void setTowingCapacity(double towingCapacity) {
            this.towingCapacity = towingCapacity;
        }

        public String getInfo(){
            return "This is a UtilityVehicle, and the Vin Number is: " + getVinNumber() + ", Make by: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + ", The Towing Capacity is: " + getTowingCapacity() + "Kg";
        }
    }

    public class TvSeries extends Video {

        private int episodes;


        public TvSeries(String title, int duration, int episodes) {
            super(title, duration);
            setEpisodes(episodes);
        }

        public int getEpisodes() {
            return episodes;
        }

        public void setEpisodes(int episodes) {
            this.episodes = episodes;
        }

        public String getInfo(){
            return "The TV Serie is: " + getTitle() + ", The Duration is: " + getDuration() + "min, And has: " + getEpisodes() + " episodes.";
        }
    }

    public class UtilityVehicle extends Car {
        private boolean fourWheelDrive;


        public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
            super(vinNumber, make, model, mileage);
            setFourWheelDrive(fourWheelDrive);
        }
        //Getter
        public String isFourWheelDrive() {
            if (fourWheelDrive) {
                return "YES";
            } else {
                return "NO";
            }
        }
        //Setter
        public void setFourWheelDrive(boolean fourWheelDrive) {
            this.fourWheelDrive = fourWheelDrive;
        }

        public String getInfo(){
            return "This is a UtilityVehicle, and the Vin Number is: " + getVinNumber() + ", Make by: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + ", has four-wheel drive: " + isFourWheelDrive();
        }
    }
    public abstract class Video {
        private String title;
        private int duration;

        public Video(String title, int duration) {
            setTitle(title);
            setDuration(duration);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        abstract String getInfo();
    }







}
