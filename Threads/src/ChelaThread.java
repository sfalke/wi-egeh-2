public class ChelaThread implements Runnable {

    public String name;

    public ChelaThread(String name){
        this.name = name;
    }
    public void run() {

        // try-catch block, da der Block während er schläft von außen unterbrochen werden könnte
        try {
            // Thread chelathread wird schlafen gelegt
            Thread.sleep(100);
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread " + GuruThread.guruthread.getName() + " while it invoked the method join() on thread " + Thread.currentThread().getName() + " - " + GuruThread.guruthread.getState());

        // try-catch block
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }


}
