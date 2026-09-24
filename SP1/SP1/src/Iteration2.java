public class Iteration2 {
    void main () {

        String name = "Ragnar";

        int health = 85;
        int maxHealth = 100;
        int level = 5;
        int xp = 2300;
        double gold = 156.50;
        boolean isAlive = true;
        char heroClass = 'W';
        String[] inventory = {"sword", "shield", "potion", "bow"};

        System.out.println("Name:" + name + "\n" + "Class:" + heroClass + "\n" + "Health:" + health + "\n" + "Max health:" + maxHealth + "\n" + "level:" + level + "\n" + "XP:" + xp + "\n" + "gold:" + gold + "\n" + "Alive:" + isAlive);


        System.out.println("STATUS CHECK:");

        if (health < maxHealth * 0.25) {
            System.out.println("Warning: Health critical!");
        }
        if (health <= 0) {
            isAlive = false;
        }

        if (heroClass == 'W') {
            System.out.println("You are a Warrior!");
        } else if (heroClass == 'M') {
            System.out.println("You are a Mage!");
        } else if (heroClass == 'R') {
            System.out.println("You are a Rogue!");
        } else {
            System.out.println("Unknown class");
        }


        if (xp > 1000 * level) {
            System.out.println("Ready to level up!");
        }


        System.out.println("===INVENTORY===");


        for (String item : inventory) {
            System.out.println(item);
        }

        System.out.println("you have" + " " + inventory.length + " " + "items" + " " + "in" + " " + "your" + " " + "inventory");


        System.out.println("===COMBAT===");
        System.out.println("You took damage!!!");

        int Damage = 35;
        health = health - Damage;
        System.out.println("Health:" + health);

        if (health > 0) {
            System.out.println("Character is still alive!");
        } else {
            System.out.println("Character is dead!");
        }




    }
}
