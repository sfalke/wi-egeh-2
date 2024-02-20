public class Warrior {

    private String name;
    private Weapon weapon;

    public Warrior(){ this.weapon = null; }
    public Warrior(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon){ this.weapon = weapon; }
    public Weapon getWeapon() { return this.weapon; }

    public String getName(){ return this.name; }

    @Override
    public String toString(){
        return "Ich bin Aragorn, Arathorns Sohn, der Stammesführer der Dúnedain (Westmenschen) des Nordens, der Nachkomme von Isildur und der rechtmäßige Erbe der Königreiche Gondor und Arnor.";
    }

}
