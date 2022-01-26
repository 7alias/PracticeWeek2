package Task4;
public class Car {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    public static void main(String[] args) {


        Car peugeot = new Car("Peugeot");
        Car.Engine cEngine = peugeot.new Engine(100);



        System.out.println(cEngine.startStopEngine());
        System.out.println(cEngine.startStopEngine());

    }

    public class Engine {
        private boolean isWorking = false;
        private int horsepower;

        public Engine(int horsepower) {

            this.horsepower = horsepower;
        }

        public String startStopEngine() {
            if (isWorking == false) {
                this.isWorking = true;
                return "engine was started";


            } else {
                this.isWorking = false;
                return "engine was stopped";
            }
        }
    }
}


