public class Battle implements Runnable {

    private String name;
    private Army army1;
    private Army army2;

    public Battle(String name, Army army1, Army army2){
        this.name = name;
        this.army1 = army1;
        this.army2 = army2;
    }

    @Override
    public void run(){

        if (army1 == null || army2 == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Thread " + Thread.currentThread().getName() + " has been interrupted");
            }
        }


        //System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getState());

        System.out.println(this.name + ": " + army1.getName());
        System.out.println(this.name + ": " + army2.getName());
        System.out.println(this.name + ": " + army1.getStrength());
        System.out.println(this.name + ": " + army2.getStrength());

        if (army1.getStrength() > army2.getStrength()){
            army2.setStrength(0);
            army1.setStrength(army1.getStrength() - army2.getStrength());
            System.out.println(this.name + ": " + army1.getName() + " gewinnen!");
            army1.setHasWon(true);
        } else if (army1.getStrength() < army2.getStrength()){
            army1.setStrength(0);
            army2.setStrength(army2.getStrength() - army1.getStrength());
            System.out.println(this.name + ": " + army2.getName() + " gewinnen!");
            army2.setHasWon(true);
        } else {
            System.out.println(this.name + ": Unentschieden!");
        }

        System.out.println(this.name + ": " + army1.getStrength());
        System.out.println(this.name + ": " + army2.getStrength());
    }


}
