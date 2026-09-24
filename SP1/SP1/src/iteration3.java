public class iteration3 {

        String name = "Ragnar";
        int health = 85;
        int maxHealth = 100;
        int level = 5;
        int xp = 2300;
        double gold = 156.50;
        char heroClass = 'W';
        String[] inventory = {"sword", "shield", "potion", "bow"};



    void main() {


        printCharacterSheet();

        takeDamage(30);
        heal(20);
        addXP(500);

        if (removeGold(100.0)) {
            System.out.println("Bought a potion!");
        } else {
            System.out.println("Not enough gold!");
        }

        System.out.println("Health: " + getHealthPercentage() + "%");

        if (isHealthCritical()) {
            System.out.println("WARNING: Find a healer!");
        }

        printCharacterSheet();

    }




        void printCharacterSheet () {
            System.out.println("==Character sheet==" + "\n" + "Name:" + name + "\n" + "Class:" + heroClass + "\n" + "Health:" + health + "\n" + "Max health:" + maxHealth + "\n" + "level:" + level + "\n" + "XP:" + xp + "\n" + "gold:" + gold + "\n" + "Alive:" + isAlive());
            printInventory();
        }

        void takeDamage ( int amount){
        int oldHealth = health;
            health = health - amount;
            System.out.println(name + " " + "takes" + " " + amount + " " + "damage!" + oldHealth + " -> " + health);
            if (health > 0) {
                System.out.println(name + " " + "is still alive!");
            } else {
                System.out.println(name + " " + "is dead!");
            }
        }
            void heal (int amount) {
                int oldHealth = health;
                health = health + amount;

                if (health > maxHealth) {
                    health = maxHealth;
                }
                System.out.println(name + " " + "heals" + " " + amount + " " + "hp Health:" + oldHealth + " -> " + health);
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


                                    }












