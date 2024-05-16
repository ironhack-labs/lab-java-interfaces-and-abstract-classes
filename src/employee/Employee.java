package employee;

public class Employee {
    public interface  Moveable {
        //direct movement right or left
        int moveLeft();
        int moveRight();

        //Movment Speed
        void increaseSpeed();
        void decreaseSpeed();
}
}
