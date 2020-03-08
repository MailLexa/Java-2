package ru.gb.jtwo.la.online.circles;

import java.awt.*;
import java.lang.*;
import java.lang.Runnable;


public class background extends Thread{
    MainCircles Circles;




    background (MainCircles Circles){
        this.Circles = Circles;

    }

    public  void run() {
        Integer i = 0;
        while (true){
//            System.out.println(System.nanoTime());
            try {
                background.sleep(1000);
                if (i == 1 )
                    editcolor (Color.black);
                if (i==2)
                    editcolor (Color.red);
                if (i==3)
                    editcolor (Color.yellow);
                if (i==4) {
                    editcolor(Color.blue);
                    i = 0;
                }
                i++;
            }
            catch (Exception e){
                System.out.println(e);
            }

        }

    }


    void editcolor (Color bg){
        Circles.canvas.setBackground(bg);
    }
}
