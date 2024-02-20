public class Sword extends Weapon {

    public Sword(){
        super();
    }

    public Sword(String name){
        super(name, 10);
    }
    @Override
    public String toString(){
        return "Sword";
    }
}
