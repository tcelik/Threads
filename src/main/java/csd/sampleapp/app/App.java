package csd.sampleapp.app;

public class App {
    public static void main(String[] args)
    {
        new Thread(new Sample()).start();
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

