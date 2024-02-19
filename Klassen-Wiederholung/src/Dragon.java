import java.awt.*;

public class Dragon extends Monster {
    private String name;

    public Dragon(String name){
        //super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int attack(){ return this.getLevel() * 200; }




}
