package Task7;

public class Car extends Transport {
    private int maxPassengers;



    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }


    @Override
    public boolean canMove(int n) {
        if (super.fuel >= n) {
            super.fuel -= n;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getFuelLevel() {
        return super.fuel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}


