public class RunnableInterface {
    public static class Myrunnable implements Runnable{
        public void run(){
            System.out.println("hello world");

        }

    }
    public static void main(String[] args) {
        Thread t1=new Thread(new Myrunnable());
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("happy");
        }

    }
}
