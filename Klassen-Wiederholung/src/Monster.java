public abstract class Monster {
    private int level;

    public Monster(){ this.level = 1; } // mit einem Startwert initialisieren, kann auch 0 oder 10 sein

    public int getLevel(){ return this.level; }
    public int levelUp(){ return ++this.level; } // this.level++; return this.level; } //

    // abstrakte Methode
    public abstract int attack();
}
