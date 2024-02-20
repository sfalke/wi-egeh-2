public class Bow extends Weapon {

    private int numOfArrows;

    public Bow(String name){
        super(name);
        numOfArrows = 0;
    }

    public void setNumOfArrows(int numOfArrows) {
        this.numOfArrows = numOfArrows;
    }

    public int getNumOfArrows(){
        return this.numOfArrows;
    }
}
