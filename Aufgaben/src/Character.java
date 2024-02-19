public class Character {

    private String name;
    protected int hitpoints;
    public double money;

    Character(){
        this.name = "";
        this.hitpoints = 0;
        this.money = 0.0;
    }

    Character(String name, int hitpoints, double money){
        this.name = name;
        this.hitpoints = hitpoints;
        this.money = money;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public int getHitpoints(){ return this.hitpoints; }
    public void setHitpoints(int hitpoints){ this.hitpoints = hitpoints; }
    public double getMoney(){ return this.money; }
    public void setMoney(double money){ this.money = money; }

}
