public class Mover {
    // statische Methoden können aufgerufen werden, ohne dass ein Objekt der Klasse angelegt werden muss
    static void moveDragons(Moveable first, Moveable... more){
        for (Moveable moveable : more){
            moveable.moveUp();
        }
    }
}
