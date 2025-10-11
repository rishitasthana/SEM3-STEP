// Gaming Character System - Dynamic Method Dispatch

abstract class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public abstract void attack();
}

// Warrior class
class Warrior extends GameCharacter {
    private String weapon;

    public Warrior(String name, String weapon) {
        super(name);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("Warrior " + name + " attacks fiercely with " + weapon + "! (High defense)");
    }
}

// Mage class
class Mage extends GameCharacter {
    private String spell;
    private int mana;

    public Mage(String name, String spell, int mana) {
        super(name);
        this.spell = spell;
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Mage " + name + " casts " + spell + " using " + mana + " mana!");
    }
}

// Archer class
class Archer extends GameCharacter {
    private int arrows;

    public Archer(String name, int arrows) {
        super(name);
        this.arrows = arrows;
    }

    @Override
    public void attack() {
        System.out.println("Archer " + name + " shoots an arrow! (" + arrows + " arrows left, long-range damage)");
    }
}

// Demo class
public class BattleDemo {
    public static void main(String[] args) {
        GameCharacter[] army = new GameCharacter[3];
        army[0] = new Warrior("Ragnar", "Sword");
        army[1] = new Mage("Merlin", "Fireball", 50);
        army[2] = new Archer("Robin", 12);

        for (GameCharacter character : army) {
            character.attack();
        }
    }
}