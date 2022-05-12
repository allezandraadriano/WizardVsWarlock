public class Wizard extends Character{
    Wizard(String name, int healthPoints,int level,int manaPoints){
        super(name);
        characterName = name;
        hP = healthPoints;
        lvl = level;
        mP = manaPoints;
    }

    public void display(){
        display();
    }

    public void info(){
        info();
    }

    public void levelUp(){
        levelUp();
    }

    public void fireBlade(Character turnCharacter, Character enemyCharacter){
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Blade!\n" +enemyCharacter.characterName + " receives 50 damage!");
        int manaCost = 62;
        int damagePoints = 50;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    };

    public void waterTide(Character turnCharacter, Character enemyCharacter){
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Water Tide!\n" +enemyCharacter.characterName + " receives 65 damage!");
        int manaCost = 85;
        int damagePoints = 65;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    }

    public void lightRealm(Character turnCharacter){
        System.out.println("\n"+super.characterName + " used Light Realm!\n" + super.characterName + " restores 400mp and 200 hp!");
        recover(turnCharacter);
    }

}