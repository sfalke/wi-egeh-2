import java.awt.Point;

public class Dragon extends Monster implements Moveable {

    private Point position;
    private String name;

    private String direction;

    public Dragon(String name, Point position){
        this.position = position;
        this.name = name;
        this.direction = "";
    }

    public int attack(){ return this.getLevel() * 200; }

    public String getPosition(){ return this.position.x + "/" + this.position.y; }
    public String getName(){ return this.name; }
    public void setDirection(String direction){ this.direction = direction; }
    public String getDirection(){ return this.direction; }

    public void moveUp() {
        this.position.move(this.position.x, this.position.y + 1);
        System.out.println(this.name + "->moveUp()");
    }

    public void moveDown() {
        this.position.move(this.position.x, this.position.y - 1);
        System.out.println(this.name + "->moveDown()");
    }

    public void moveLeft() {
        this.position.move(this.position.x - 1, this.position.y);
        System.out.println(this.name + "->moveLeft()");
    }

    public void moveRight() {
        this.position.move(this.position.x + 1, this.position.y);
        System.out.println(this.name + "->moveRight()");
    }

    // Aufgabe 3.e
    public void move(){
        switch(this.direction){
            case "w":
                moveUp();
                break;
            case "a":
                moveLeft();
                break;
            case "s":
                moveDown();
                break;
            case "d":
                moveRight();
                break;
        }
    }


}
