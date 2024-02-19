public class Main {
    public static void main(String[] args) {

        // Wiederholung Klassen allgemein
        // Aufgabe 1.b
        Character Aragorn = new Character();
        Character Legolas = new Character("Legolas");

        System.out.println(Aragorn.getName());
        Aragorn.setName("Aragorn");
        System.out.println(Aragorn.getName());
        System.out.println(Legolas.getName());


        // Aufgabe 1.e
        Elf Galadriel = new Elf();
        Warrior Boromir = new Warrior();

        Boromir.setWeapon("Schwert");
        Galadriel.setSpell("Feuerball");

        System.out.println("Der Krieger heißt " + Boromir.getName() + " und seine Waffe ist ein " + Boromir.getWeapon());
        System.out.println("Die Elfe heißt " + Galadriel.getName() + " und ihr Zauberspruch ist der " + Galadriel.getSpell());



        // Abstrakte Klassen
        //Monster Smaug = new Monster(); // Nicht erlaubt, da abstrakt
        Goblin MonsieurGoblin = new Goblin();
        System.out.println(MonsieurGoblin.attack());





    }
}