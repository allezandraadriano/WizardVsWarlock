public class Character {
    public String characterName;
    public int lvl;
    public int hP;
    public int mP;

    Character(String name,int healthPoints,int level,int manaPoints){
        characterName = name;
        hP = healthPoints;
        lvl = level;
        mP = manaPoints;
    }

    public Character(String name) {
    }

    public void info(Character c1, Character c2){
        System.out.println("\n"+c1.characterName+"\nhP: "+c1.hP+"\nmP: "+c1.mP);
        System.out.println("\n"+c2.characterName+"\nhP: "+c2.hP+"\nmP: "+c2.mP);
    }

    public void display(Character turnCharacter){
        System.out.println("Character Sheet\nName: "+turnCharacter.characterName+"\nLevel: "+turnCharacter.lvl+"\nHealth Points: "+turnCharacter.hP+"\nMana Points: "+turnCharacter.mP+"\n\n");
    }

    public void levelUp(Character turnCharacter){
        turnCharacter.lvl = lvl;
        lvl += 10;

        System.out.println("\n"+turnCharacter.characterName+" has gained 10 levels!\n"+turnCharacter.characterName+" is now level "+turnCharacter.lvl+"!");
    }

    public void recover(Character turnCharacter){
        turnCharacter.hP = hP;
        turnCharacter.mP = mP;

     hP +=200;
     mP +=400;
    }

    public void manaDeduction(Character turnCharacter, int manaCost){
       turnCharacter.mP = mP;
        mP -= manaCost;
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){

        enemyCharacter.hP -= damagePoints;
        System.out.println("Character "+ enemyCharacter.characterName + "'s HP Left: " + enemyCharacter.hP);

        if(enemyCharacter.hP == 0){
            System.out.println("Character " +enemyCharacter.characterName + " has been defeated."  );
        }

    }

}