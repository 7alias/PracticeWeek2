public class Task1 {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.makeSound();
        Car c = new Car();
        c.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

    }
    static class Car implements Soundable {

        @Override
        public void makeSound() {
            System.out.println("Beep");
        }
    }

    static class Guitar implements Soundable {

        @Override
        public void makeSound() {
            System.out.println("Brumm");
        }
    }

    static class Cat implements Soundable {

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

}
