public class iteration1 {

    void main () {

        String name = "Neymar";
        int healthPoints = 85;
        int maxHealth = 100;
        int level = 5;
        int xp = 2300;
        double gold = 156.50;
        char heroClass = 'W';
        boolean isAlive = true;
        String [] inventory = {"sword", "shield", "potion", "bow"};

        System.out.println("Name:" + name + "\n" + "Class:" + heroClass + "\n" + "Health:" + healthPoints + "\n" + "Max health:" +  maxHealth + "\n" + "level:" + level + "\n" +  "XP:" + xp + "\n" + "gold:" + gold + "\n" +"Alive:" + isAlive);
        System.out.println("Inventory (" + inventory.length + " items):");

        for (String item : inventory) {
            System.out.println("- " + item);






    }
}

}

