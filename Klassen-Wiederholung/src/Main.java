public class Main {
    public static void main(String[] args) {

        // Wiederholung Klassen allgemein
        Character Aragorn = new Character();
        Character Legolas = new Character("Legolas");

        System.out.println(Aragorn.getName());
        Aragorn.setName("Aragorn");
        System.out.println(Aragorn.getName());
        System.out.println(Legolas.getName());

        // Abstrakte Klassen
        //Monster Smaug = new Monster(); // Nicht erlaubt, da abstrakt
        Goblin MonsieurGoblin = new Goblin();
        System.out.println(MonsieurGoblin.attack());


        // Interfaces
        Dragon Smaug = new Dragon("Smaug");
        Smaug.moveUp();
        Smaug.moveDown();

        // Loop through Interfaces
        Dragon Toothless = new Dragon("Toothless");
        Dragon Drogon = new Dragon("Drogon");

        Mover.moveDragons(Smaug, Toothless, Drogon);


    }
}