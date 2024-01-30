public class Goblin<T> {

    private T weapon;
    public Goblin(T weapon){ this.weapon = weapon; }

    @Override
    public String toString() {
        return "I carry a " + this.weapon;
    }
}
