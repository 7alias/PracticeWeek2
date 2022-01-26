package Task8;

public class Main {
    public static void main(String[] args) {

        Wizard wizard = new Wizard(100, 1, "wizard", "magik wand", 15, "fire");


        Wizard wizard1 = new Wizard(100, 1, "wizard", "wand", 15, "fire");


        Wizard wizard2 = new Wizard(100, 1, "wizard", "magik wand", 15, "fire");


        Wizard wizard3 = new Wizard(100, 1, "wizard", "wand", 15, "fire");

        System.out.println("Wizard" + wizard.getFullInfo());
        System.out.println("Wizard1" + wizard1.getFullInfo());
        System.out.println("Wizard2" + wizard2.getFullInfo());
        System.out.println("Wizard3" + wizard3.getFullInfo());
    }
}
