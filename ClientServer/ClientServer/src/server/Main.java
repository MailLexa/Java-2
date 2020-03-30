package server;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

import client.ClientWindow;


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




    }

}