package csd.sampleapp.app;

public class App {
    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(new Sample());
        t.start();
        t.join(); //main thread, thread refasına(t) sahip. t.join(), main bekliyor. main ben seni bekliyorum der.

        //main thread
        System.out.println("hello");
    }
}

class Sample implements Runnable {
    //Anlaşmaya uyucam demişim

    @Override
    public void run()
    {
        for (int i = 0; i < 10000; ++i) {
            System.out.println(i + 1);
        }
    }
}

