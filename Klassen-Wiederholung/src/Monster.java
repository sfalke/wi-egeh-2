public abstract class Monster {
    private int level;

    public Monster(){ this.level = 1;}

    public int getLevel(){ return this.level; }

    public abstract int attack();
}
