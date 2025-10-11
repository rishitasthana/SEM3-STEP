public class GameBattle {
    // Basic attack for [damage] points!
    public void attack(int damage) {
        System.out.println("Basic attack for " + damage + " points!");
    }

    // Attacking with [weapon] for [damage] points!
    public void attack(int damage, String weapon) {
        System.out.println("Attacking with " + weapon + " for " + damage + " points!");
    }

    // CRITICAL HIT! [weapon] deals [damage*2] points!
    // Else: use the previous overloaded method
    public void attack(int damage, String weapon, boolean isCritical) {
        if (isCritical) {
            System.out.println("CRITICAL HIT! " + weapon + " deals " + (damage * 2) + " points!");
        } else {
            attack(damage, weapon);
        }
    }

    // Team attack with [teammate names] for [damage * team size] total damage!
    public void attack(int damage, String[] teammates) {
        String names = String.join(", ", teammates);
        int totalDamage = damage * teammates.length;
        System.out.println("Team attack with " + names + " for " + totalDamage + " total damage!");
    }

    public static void main(String[] args) {
        GameBattle gb = new GameBattle();

        // Basic attack with 50 damage
        gb.attack(50);

        // Sword attack with 75 damage
        gb.attack(75, "Sword");

        // Critical bow attack with 60 damage
        gb.attack(60, "Bow", true);

        // Team attack with {"Alice", "Bob"} for 40 base damage
        gb.attack(40, new String[]{"Alice", "Bob"});
    }
}