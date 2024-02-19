public class Mover {
    // statische Methoden können aufgerufen werden, ohne dass ein Objekt der Klasse angelegt werden muss
    static void moveDragons(Moveable... more){
        for (Moveable moveable : more){
            //moveable.moveUp();
            moveable.move();
        }
    }

    // Aufgabe 3.g
    static void moveAll(Moveable... more){
        for (Moveable moveable : more){
            //moveable.moveUp();
            moveable.move();
        }
    }
}
