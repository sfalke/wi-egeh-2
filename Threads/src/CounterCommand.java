public class CounterCommand implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread (run) " + Thread.currentThread().getName() + " in State " + Thread.currentThread().getState());

        for (int n=1; n<2000; n++){
            System.out.println(n);
        }
    }

}
