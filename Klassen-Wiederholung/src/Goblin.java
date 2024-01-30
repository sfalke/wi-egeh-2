public class Goblin extends Monster {

    public int attack(){
        // return this.level * 10; // level ist private!
        return this.getLevel() * 10;
    }

}
