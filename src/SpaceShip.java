public class SpaceShip{
    private String name;
    private final int maxcrew;
    private int currentCrew = 0;
    private double fuelLevel = 0.0;

    public SpaceShip(int maxcrew, String name, int currentCrew, double fuelLevel) {
        this.maxcrew = maxcrew;
        this.name = name;
        this.currentCrew = 0;
        this.fuelLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCrew() {
        return currentCrew;
    }
    public void setCrew(int crew) {
        this.currentCrew = crew;
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

}

