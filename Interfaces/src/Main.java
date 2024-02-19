public class Main {
    public static void main(String[] args) {

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