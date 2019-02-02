package csd.sampleapp.app;

public class App {
    public static void main(String[] args)
    {
        new Sample().run();
        System.out.println("hello");
    }
}

class Sample implements Runnable {
    //Anlaşmaya uyucam demişim

    @Override
    public void run()
    {
        for (int i = 0; i < 100; ++i) {
            System.out.println(i + 1);
        }
    }
}

