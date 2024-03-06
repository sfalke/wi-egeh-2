public class Character {

    private String name;
    private int hitpoints;
    private String icon;
    private SpecialMove specialMove;

    public Character(){
        this.name = "";
        this.hitpoints = 0;
        this.icon = "";
        this.specialMove = new SpecialMove("", 0.0, 0);
    }

    public Character(String name, int hitpoints, String icon, SpecialMove specialMove){
        this.name = name;
        this.hitpoints = hitpoints;
        this.icon = icon;
        this.specialMove = specialMove;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public int getHitpoints(){
        // default
        //return this.hitpoints;

        // Aufgabe 5.x
        boolean hit = Math.random() < this.specialMove.getRate();
        if (hit){
            System.out.println("Special Move!");
            return this.hitpoints + this.specialMove.getHitpoints();
        } else {
            return this.hitpoints;
        }

    }
    public void setHitpoints(int hitpoints){ this.hitpoints = hitpoints; }
    public String getIcon(){ return this.icon; }

    public SpecialMove getSpecialMove(){ return this.specialMove; }

    public String toString(){
        return this.name;
    }


}
