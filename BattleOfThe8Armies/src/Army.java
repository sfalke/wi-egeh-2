public class Army {

    private String name;
    private int strength;
    private boolean hasWon;

    public Army(String name, int strength){
        this.name = name;
        this.strength = strength;
        hasWon = false;
    }

    public String getName(){ return this.name; }
    public int getStrength(){ return this.strength; }
    public void setStrength(int strength){ this.strength = strength; }
    public void setHasWon(boolean hasWon){ this.hasWon = hasWon; }
    public boolean getHasWon(){ return this.hasWon; }

}
