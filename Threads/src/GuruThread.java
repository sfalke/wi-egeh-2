public class GuruThread implements Runnable {
    Thread guruthread;
    private String guruname;
    public GuruThread(String name) {
        guruname = name;
    }
    @Override
    public void run() {
        System.out.println("Thread running" + guruname);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(guruname);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
    public void start() {
        System.out.println("Thread started");
        if (guruthread == null) {
            guruthread = new Thread(this, guruname);
            guruthread.start();
        }
    }

}
