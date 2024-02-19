import java.awt.Point;

public class Character implements Moveable {

    private String name;
    private Point position;
    private String direction;

    public Character(){
        this.name = "";
        this.position = new Point(0,0);
        this.direction = "";
    }

    public Character(String name){
        this();
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDirection(String direction){ this.direction = direction; }
    public String getDirection(){ return this.direction; }
    public String getPosition(){ return this.position.x + "/" + this.position.y; }


    public void moveUp() {
        this.position.move(this.position.x, this.position.y + 2);
        System.out.println(this.name + "->moveUp()");
    }

    public void moveDown() {
        this.position.move(this.position.x, this.position.y - 2);
        System.out.println(this.name + "->moveDown()");
    }

    public void moveLeft() {
        this.position.move(this.position.x - 2, this.position.y);
        System.out.println(this.name + "->moveLeft()");
    }

    public void moveRight() {
        this.position.move(this.position.x + 2, this.position.y);
        System.out.println(this.name + "->moveRight()");
    }

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
