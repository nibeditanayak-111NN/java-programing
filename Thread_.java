class Thread_ extends Thread {
    public void run() {
        System.out.println("thread is running");
    }

    public void go() {
        System.out.println("the thread is going so first");
    }

    public static void main(String[] args) {
        Thread_ n = new Thread_();

        n.run();      
        n.start();    
        Thread_ m = new Thread_();
        m.go();

    /*
       try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    */
    }
}
