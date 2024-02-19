public class Warrior extends Character {

    private String weapon;

    // Aufgabe 1.f
    public Warrior(String name){
        // Möglichkeit 1 - Konstruktor der Mutterklasse aufrufen
        super(name);

        // Möglichkeit 2 - Über die Methode setName einen Namen zuweisen
        this.setName(name);
    }

    public Warrior(){
        super();
    }

    public void setWeapon(String weapon){ this.weapon = weapon; }

    public String getWeapon(){ return this.weapon; }

}
