package server;

import client.ClientWindow;

import java.util.concurrent.*;



public class Main {

    public  static void main(String[] args) throws Exception{
        //ClientWindow  clientWindow = new ClientWindow();
        //     Thread myThready = new Thread(new Runnable()
        //   {
        //      public void run() //Этот метод будет выполняться в побочном потоке
        //     {
        //         Server server = new Server();
        //     }
        //  });
        //  myThready.start();	//Запуск потока
        // System.out.println("Главный поток завершён...");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            public void run() {
                new Server();
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                new ClientWindow();
            }
        });
        //  executorService.execute(new Runnable(){  new Server());}
        //    executorService.execute((Runnable) new ClientWindow());
        executorService.shutdown();
        //         Lesson_4 w = new Lesson_4();
        //        Lesson_4.main();

        //      Integer [] u= {1,2,3,4,5,6,7,8};
        //   Lesson6.Massiv Les = new Lesson6.Massiv();
        //    u = Les.OutMassiv(u);
        //    for (Integer i=0; i<u.length;i++){
        //         System.out.println(u[i]);
        //  }
        // ClientWindow clientWindow_1 = new ClientWindow();
    }

}
