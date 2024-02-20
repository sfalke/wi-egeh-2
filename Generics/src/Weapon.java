public class Weapon {
    private String name;
    private int hitpoints;

    public Weapon(){
        this.name = "";
        this.hitpoints = 0;
    }

    public Weapon(String name){
        this.name = name;
        this.hitpoints = 0;
    }
    public Weapon(String name, int hitpoints){
        this.name = name;
        this.hitpoints = hitpoints;
    }

    public String getName(){ return this.name; }

    public int getHitpoints(){ return this.hitpoints; }

    @Override
    public String toString(){
        return "Ich bin ein " + this.name + " und meine Hitpoints sind " + this.hitpoints;
    }

}
