public class Main {
    public static void main(String[] args) {

        System.out.println("### Generics ###");
        System.out.println();

        System.out.println("## Aufgabe 4.a ##");
        System.out.println();

        // Eigenschaft ist vom Typ Weapons, aber zugewiesen werden Sword und Bow
        // dies funktioniert über die gemeinsame Mutterklasse
        Sword Anduril = new Sword("Anduril");
        Warrior Aragorn = new Warrior("Aragorn", Anduril);
        Bow BowOfTheGaladhrim = new Bow("Bow of the Galadhrim");
        Warrior Legolas = new Warrior("Legolas", BowOfTheGaladhrim);

        // Aufruf der Methoden der Mutterklasse ist jederzeit möglich
        System.out.println("Ich bin " + Legolas.getName() + " und meine Waffe ist der " + Legolas.getWeapon().getName());
        System.out.println("Ich bin " + Aragorn.getName() + " und meine Waffe ist " + Aragorn.getWeapon().getName());
        // Aufruf der speziellen Methoden nicht möglich
        //System.out.println("Mein Bogen hat " + Legolas.getWeapon().getNumOfArrows() + " Pfeile");
        // Aufruf nur über das spezielle Objekt
        System.out.println("Mein Bogen hat " + BowOfTheGaladhrim.getNumOfArrows() + " Pfeile");
        // Java Objekte sind nicht nur von einer Klasse, sondern von allen ihren Oberklassen (und Interfaces).
        // So ist das Objekt Anduril von den Klassen Sword UND Weapons und kann daher der Eigenschaft zugewiesen werden,
        // die ein Objekt vom Typ Weapons verlangt. Aber es wird dann auch "nur" als Objekt vom Typ Weapons behandelt.


        System.out.println();
        System.out.println("## Aufgabe 4.c ##");
        System.out.println();

        Goblin<Bow> MonsieurGoblin = new Goblin<>("Monsieur Goblin");
        MonsieurGoblin.setWeapon(BowOfTheGaladhrim);
        Goblin<Sword> MadameGoblin = new Goblin<>("Madame Goblin");
        MadameGoblin.setWeapon(Anduril);
        // Aufruf der Methoden der Mutterklasse
        System.out.println("Ich bin " + MonsieurGoblin.getName() + " und meine Waffe ist der " + MonsieurGoblin.getWeapon().getName());
        System.out.println("Ich bin " + MadameGoblin.getName() + " und meine Waffe ist " + MadameGoblin.getWeapon().getName());
        // Aufruf der speziellen Methoden jetzt möglich
        MonsieurGoblin.getWeapon().setNumOfArrows(10);
        System.out.println("Mein Bogen hat " + MonsieurGoblin.getWeapon().getNumOfArrows() + " Pfeile");



    }
}