public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Alle Armeen anlegen
        Army army1 = new Army("Dwarfs", 1000);
        Army army2 = new Army("Orcs", 100);

        Army army3 = new Army("Elves", 2000);
        Army army4 = new Army("Uruk-hai", 1500);

        Army army5 = new Army("Men", 1000);
        Army army6 = new Army("Isengarders", 500);

        Army army7 = new Army("Hobbits", 150);
        Army army8 = new Army("Balrog", 2500);



        // Quarterfinal
        Thread battlethread1 = new Thread(new Battle("Quarter Battle 1", army1, army2), "Thread: Battle 1");
        battlethread1.start();

        Thread battlethread2 = new Thread(new Battle("Quarter Battle 2", army3, army4));
        battlethread2.start();

        Thread battlethread3 = new Thread(new Battle("Quarter Battle 3", army5, army6));
        battlethread3.start();

        Thread battlethread4 = new Thread(new Battle("Quarter Battle 4", army7, army8));
        battlethread4.start();


        // warten bis alle Threads fertig sind
        battlethread2.join();
        battlethread3.join();
        battlethread1.join();
        battlethread4.join();



        // Semifinal
        Army semiarmy1 = (army1.getHasWon()) ? army1 : army2; // im Falle eines Unentschieden gewinnt der Herausforderer
        Army semiarmy2 = (army3.getHasWon()) ? army3 : army4;
        Army semiarmy3 = (army5.getHasWon()) ? army5 : army6;
        Army semiarmy4 = (army7.getHasWon()) ? army7 : army8;

        semiarmy1.setHasWon(false);
        semiarmy2.setHasWon(false);
        semiarmy3.setHasWon(false);
        semiarmy4.setHasWon(false);

        Thread semibattle1 = new Thread(new Battle("Semi Final Battle 1", semiarmy1, semiarmy2));
        Thread semibattle2 = new Thread(new Battle("Semi Final Battle 2", semiarmy3, semiarmy4));

        semibattle1.start();
        semibattle2.start();

        semibattle1.join();
        semibattle2.join();



        // Final
        Army finalarmy1 = (semiarmy1.getHasWon()) ? semiarmy1 : semiarmy2;
        Army finalarmy2 = (semiarmy3.getHasWon()) ? semiarmy3 : semiarmy4;
        finalarmy1.setHasWon(false);
        finalarmy2.setHasWon(false);

        Thread finalbattle = new Thread(new Battle("Final Battle", finalarmy1, finalarmy2));
        finalbattle.start();
        finalbattle.join();

        if (finalarmy1.getHasWon()) {
            System.out.println(finalarmy1.getName() + " have won!");
        } else {
            System.out.println(finalarmy2.getName() + " have won!");
        }


    }
}