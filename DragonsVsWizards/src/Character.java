public class Character {

    private String name;
    private int hitpoints;

    public Character(){
        this.name = "";
        this.hitpoints = 0;
    }
    public Character(String name, int hitpoints){
        this.name = name;
        this.hitpoints = hitpoints;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public int getHitpoints(){ return this.hitpoints; }
    public void setHitpoints(int hitpoints){ this.hitpoints = hitpoints; }


}
