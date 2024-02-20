public class Goblin<T extends Weapon> {

    private String name;
    private T weapon;
    public Goblin(String name, T weapon){
        this.name = name;
        this.weapon = weapon;
    }
    public Goblin(String name){ this.name = name; this.weapon = null; }

    public void setWeapon(T weapon){
        this.weapon = weapon;
    }

    public T getWeapon(){ return this.weapon; }

    public String getName(){ return this.name; }

    @Override
    public String toString() {
        return "I carry a " + this.weapon;
    }
}
