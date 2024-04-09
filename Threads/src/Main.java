public class Main {

    public static CounterCommand c;
    public static Thread ct;
    public static DateCommand d;
    public static Thread dt;

    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Thread.currentThread().threadId());

        // Aufgabe 6.a
        c = new CounterCommand();
        ct = new Thread(c, "CounterCommand");

        d = new DateCommand();
        dt = new Thread(d, "DateCommand");

        System.out.println("Main.main(): " + ct.getName() + " is in State " + ct.getState());
        System.out.println("Main.main(): " + dt.getName() + " is in State " + dt.getState());


        ct.start();
        dt.start();

        System.out.println("Main.main(): " + ct.getName() + " is in State " + ct.getState());
        System.out.println("Main.main(): " + dt.getName() + " is in State " + dt.getState());

        ct.join();
        System.out.println("Main.main(): " + ct.getName() + " is in State " + ct.getState());
        System.out.println("Main.main(): " + dt.getName() + " is in State " + dt.getState());
        dt.join();






    }
}