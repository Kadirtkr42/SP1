public class iteration4 {

void main (String[] args){
Character hero = new Character("Ragnar", 'W');
Character enemy = new Character("Neymar", 'R');

    hero.printCharacterSheet();
    enemy.printCharacterSheet();

    hero.attack(enemy);
   enemy.attack(hero);

   hero.printCharacterSheet();
    enemy.printCharacterSheet();
}

}
