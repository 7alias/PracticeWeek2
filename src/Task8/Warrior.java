package Task8;

public class Warrior extends Player {
    private String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }


    @Override
    String getFullInfo() {
        return super.hp + " " + super.level + " " + super.type + " " + super.weapon + " " + armor;
    }

    @Override
    void levelUp() { super.level+=1;

    }

    @Override
    boolean doDamage() {
        return true;
    }
}

