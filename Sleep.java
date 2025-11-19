class Sleep extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
       try{
        Thread.sleep(10);
       }
       catch(InterruptedException e){
            System.out.println(e);
       }
       System.out.println(i);
      }
    }
    public static void main(String[]srgs){
        Sleep t1=new Sleep();
        t1.start();
    }
}
