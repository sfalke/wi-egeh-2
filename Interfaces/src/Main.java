import java.awt.Point;

public class Main {
    public static void main(String[] args) {

        System.out.println("### Interfaces ###");
        System.out.println();

        System.out.println("## Aufgabe 3.a ##");
        System.out.println();
        // Create Dragons
        Dragon Smaug = new Dragon("Smaug", new Point(2, 3));
        System.out.println(Smaug.getName() + " steht an Position " + Smaug.getPosition());

        Dragon Toothless = new Dragon("Toothless", new Point(4,4));
        System.out.println(Toothless.getName() + " steht an Position " + Toothless.getPosition());

        Dragon Drogon = new Dragon("Drogon", new Point(5,2));
        System.out.println(Drogon.getName() + " steht an Position " + Drogon.getPosition());

        System.out.println();
        System.out.println("## Aufgabe 3.c ##");
        System.out.println();

        Smaug.moveUp();
        System.out.println(Smaug.getName() + " steht an Position " + Smaug.getPosition());
        Toothless.moveRight();
        System.out.println(Toothless.getName() + " steht an Position " + Toothless.getPosition());
        Drogon.moveLeft();
        System.out.println(Drogon.getName() + " steht an Position " + Drogon.getPosition());


        System.out.println();
        System.out.println("## Aufgabe 3.e ##");
        System.out.println();

        Smaug.setDirection("a");
        System.out.println(Smaug.getName() + " steht an Position " + Smaug.getPosition());
        Toothless.setDirection("w");
        System.out.println(Toothless.getName() + " steht an Position " + Toothless.getPosition());
        Drogon.setDirection("s");
        System.out.println(Drogon.getName() + " steht an Position " + Drogon.getPosition());

        Mover.moveDragons(Smaug, Toothless, Drogon);

        System.out.println(Smaug.getName() + " steht an Position " + Smaug.getPosition());
        System.out.println(Toothless.getName() + " steht an Position " + Toothless.getPosition());
        System.out.println(Drogon.getName() + " steht an Position " + Drogon.getPosition());

        System.out.println();
        System.out.println("## Aufgabe 3.f ##");
        System.out.println();

        Character Aragorn = new Character("Aragorn");
        Aragorn.setDirection("w");
        System.out.println(Aragorn.getName() + " steht an Position " + Aragorn.getPosition());

        Mover.moveAll(Smaug, Toothless, Drogon, Aragorn);

        System.out.println(Aragorn.getName() + " steht an Position " + Aragorn.getPosition());



    }

}