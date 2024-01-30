import java.awt.*;

public class Dragon extends Monster implements Moveable {

    private Point position;
    private String name;

    public Dragon(String name){
        this.position = new Point(0,0);
        this.name = name;
        System.out.println(this.name + ": Position " + this.position);
    }

    public int attack(){ return this.getLevel() * 200; }

    public void moveUp() {
        this.position.move(this.position.x, this.position.y + 1);
        System.out.println(this.name + "->moveUp():  Neue Position: " + this.position);
    }

    public void moveDown() {
        this.position.move(this.position.x, this.position.y - 1);
        System.out.println(this.name + "->moveDown(): Neue Position: " + this.position);
    }


}
