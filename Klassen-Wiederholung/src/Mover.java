public class Mover {
    static void moveDragons(Moveable first, Moveable... more){
        for (Moveable moveable : more){
            moveable.moveUp();
        }
    }
}
