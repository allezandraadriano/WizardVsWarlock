public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Wizards and Warlocks!\n");

        Warlock Atlanta = new Warlock("Atlanta",305,25,350);
        Wizard Cassius = new Wizard ("Cassius",471,25,320);

        System.out.println("Character Status!\n");

        Atlanta.display(Atlanta);
        Cassius.display(Cassius);

        System.out.println("Game Start!");
        Cassius.fireBlade(Cassius, Atlanta);
        Atlanta.frostBite(Atlanta,Cassius);

        Cassius.info(Cassius,Atlanta);

        Cassius.waterTide(Cassius,Atlanta);
        Atlanta.criticalForce(Atlanta,Cassius);

        Atlanta.infos(Atlanta,Cassius);

        Cassius.waterTide(Cassius,Atlanta);
        Atlanta.frostBite(Atlanta,Cassius);

        Cassius.info(Cassius,Atlanta);

        Cassius.waterTide(Cassius,Atlanta);
        Atlanta.criticalForce(Atlanta,Cassius);

        Cassius.info(Cassius,Atlanta);

        Cassius.lightRealm(Cassius);
        Atlanta.theGift(Atlanta);

        Atlanta.infos(Atlanta,Cassius);

        Cassius.waterTide(Cassius,Atlanta);
        Atlanta.frostBite(Atlanta,Cassius);

        Cassius.info(Cassius,Atlanta);

        Cassius.waterTide(Cassius,Atlanta);
        Atlanta.criticalForce(Atlanta,Cassius);

        Cassius.info(Cassius,Atlanta);

        Cassius.waterTide(Cassius,Atlanta);
        Atlanta.frostBite(Atlanta,Cassius);

        Cassius.info(Cassius,Atlanta);

        Cassius.waterTide(Cassius,Atlanta);
        Cassius.levelUp(Cassius);

        System.out.println("\nGame End!");

    }
}