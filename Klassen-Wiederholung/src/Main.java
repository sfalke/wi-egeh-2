public class Main {
    public static void main(String[] args) {

        System.out.println("### Klassen Wiederholung ###");
        System.out.println();

        System.out.println("## Aufgabe 1.b ##");
        System.out.println();

        // Wiederholung Klassen allgemein
        // Aufgabe 1.b
        Character Aragorn = new Character();
        Character Legolas = new Character("Legolas");

        System.out.println(Aragorn.getName());
        Aragorn.setName("Aragorn");
        System.out.println(Aragorn.getName());
        System.out.println(Legolas.getName());


        System.out.println();
        System.out.println("## Aufgabe 1.e ##");
        System.out.println();

        // Aufgabe 1.e
        Elf Galadriel = new Elf();  // Name über den Konstruktor zu vergeben ist hier nicht möglich
        Warrior Boromir = new Warrior();

        Boromir.setName("Borormir");
        Boromir.setWeapon("Schwert");

        Galadriel.setName("Galadriel");
        Galadriel.setSpell("Feuerball");

        System.out.println("Der Krieger heißt " + Boromir.getName() + " und seine Waffe ist ein " + Boromir.getWeapon());
        System.out.println("Die Elfe heißt " + Galadriel.getName() + " und ihr Zauberspruch ist der " + Galadriel.getSpell());


        System.out.println();
        System.out.println();
        System.out.println("### Abstrakte Klassen ###");
        System.out.println();

        System.out.println("## Aufgabe 2.b ##");
        System.out.println();
        // Abstrakte Klassen

        //Monster Smaug = new Monster(); // Nicht erlaubt, da abstrakt

        Goblin MonsieurGoblin = new Goblin();
        System.out.println("Monsieur Goblin hat das Level: " + MonsieurGoblin.getLevel());
        System.out.println("Monsieur Goblin ist gelevelt. Er hat nun das Level: " + MonsieurGoblin.levelUp());

        System.out.println("Monsieur Goblin hat den Attack-Wert: " + MonsieurGoblin.attack());

        System.out.println();
        System.out.println("## Aufgabe 2.c ##");
        System.out.println();

        Dragon Smaug = new Dragon("Smaug");
        System.out.println("Der Drachen heißt: " + Smaug.getName());
        System.out.println(Smaug.getName() + " hat das Level: " + Smaug.getLevel());

        System.out.println(Smaug.getName() + " hat den Attack-Wert: " + Smaug.attack());





    }
}