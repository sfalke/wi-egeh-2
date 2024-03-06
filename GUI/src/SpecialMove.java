public class SpecialMove {
    private String name;
    private double rate;
    private int hitpoints;

    public SpecialMove(String name, double rate, int hitpoints){
        this.name = name;
        this.rate = rate;
        this.hitpoints = hitpoints;
    }

    public String getName(){ return this.name; }
    public double getRate(){ return this.rate; }
    public int getHitpoints(){ return this.hitpoints; }
}
