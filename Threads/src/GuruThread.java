public class GuruThread implements Runnable {
    public static Thread guruthread;
    public static GuruThread obj;
    private final String guruname;

    public GuruThread(String name) {
        this.guruname = name;
    }


    // main method
    public static void main(String argvs[]) {
        // erst ein Objekt des GuruThreads anlegen und dieses dann an einen neuen Thread übergeben
        obj = new GuruThread("guruthread");
        guruthread  = new Thread(obj, obj.guruname);

        // Der Thread guruthread ist nun  angelegt und hat den Statue NEW
        System.out.println("The state of thread " + guruthread.getName() + " after spawning it - " + guruthread.getState());

        // aufrufen der Methode start, um den Thread zu starten
        guruthread.start();

        // guruthread ist nun im Status RUNNABLE
        System.out.println("The state of thread " + guruthread.getName() + " after invoking the method start() on it - " + guruthread.getState());
    }


    @Override
    public void run() {
        // Kindprozess chelathread anlegen
        ChelaThread chela = new ChelaThread("chelathread");
        Thread chelathread = new Thread(chela, chela.name);

        // chelathread ist angelegt und hat den Status NEW
        System.out.println("The state of thread " + chelathread.getName() + " after spawning it - "+ chelathread.getState());
        chelathread.start();

        // chelathread ist nun im Status RUNNABLE
        System.out.println("the state of thread " + chelathread.getName() + " after calling the method start() on it - " + chelathread.getState());

        // try-catch block, da der Thread während er schläft von außen unterbrochen werden könnte
        try {
            // der Thread guruthread ist nun im Status TIMED WAITING
            Thread.sleep(200);
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread " + chelathread.getName() + " after invoking the method sleep() on it - "+ chelathread.getState() );

        // try-catch block, da der Thread während er wartet von außen unterbrochen werden könnte
        try {
            // der Thread guruthread wartet nun auf den chelathread, bis dieser seine Ausführung beendet
            // und ist solange im Status TIMED WAITING
            chelathread.join();
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("The state of thread " + chelathread.getName() + " when it has completed it's execution - " + chelathread.getState());
    }
}

