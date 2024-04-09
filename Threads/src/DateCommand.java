public class DateCommand implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread (run) DateCommand running");

        for (int n=1; n<2000; n++){
            System.out.println("DateCommand: " + n);
        }
        System.out.println("DateCommand.run(): Thread " + Main.ct.getName() + " is in State " + Main.ct.getState());

    }


}
