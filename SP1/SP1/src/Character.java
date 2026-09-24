public class Character {

     private String name;
     private int health;
     private int maxHealth;
     private int level;
     private int xp;
     private double gold;
     private char heroClass;
     private boolean isAlive;
     private String [] inventory;


      Character(String name, char heroClass){
        this.name = name;
        this.heroClass = heroClass;

        this.maxHealth = 100;
        this.health = 100;
        this.xp = 0;
        this.level = 1;
        this.gold = 50;
        this.inventory = new String[] {"sword", "shield", "potion", "bow"};
    }
    void printCharacterSheet () {
        System.out.println("==Character sheet==" + "\n" + "Name:" + name + "\n" + "Class:" + heroClass + "\n" + "Health:" + health + "\n" + "Max health:" + maxHealth + "\n" + "level:" + level + "\n" + "XP:" + xp + "\n" + "gold:" + gold + "\n" + "Alive:" + isAlive());
    }
    void takeDamage ( int amount){
        health = health - amount;
        System.out.println(name + " " + "takes" + " " + amount + " " + "damage!");
        if (health > 0) {
            System.out.println(name + " " + "is still alive!");
        } else {
            System.out.println("you are dead!");
        }
    }
    void heal (int amount) {
        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println(name + " " + "heals" + " " + amount + " " + "hp");
    }

    void addGold ( double amount){
        gold = gold + amount;
    }

    boolean removeGold ( double amount){
        if (gold >= amount) {
            gold = gold - amount;
            return true;
        } else {
            return false;
        }
    }

    void addXP ( int amount){
        xp = xp + amount;
        System.out.println(name + " " + "gains" + " " + amount + " " + "XP! Total:" + " " + xp);
        if (xp >= 1000 * level) {
            levelUp(); }
    }

    void levelUp () {
        level = level + 1;
        xp = 0;
        maxHealth = maxHealth + 10;
    }

    boolean isHealthCritical () {
        if (health < maxHealth * 0.25) {
            return true;
        } else {
            return false;
        }
    }

    boolean isAlive () {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    double getHealthPercentage () {
        return (double) health / maxHealth * 100;
    }

    void printInventory () {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }


    }
void attack (Character enemy){
          int damage = 15;
    System.out.println(name + " " + "attacked" + " " + enemy.name);
    enemy.takeDamage(damage);

}

}
